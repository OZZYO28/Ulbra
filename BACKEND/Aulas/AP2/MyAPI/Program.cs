using Microsoft.EntityFrameworkCore;

var builder = WebApplication.CreateBuilder(args);

builder.Services.AddDbContext<AppDbContext>(options => options.UseSqlite("Data Source=Jogos.db"));

var app = builder.Build();

using (var scope = app.Services.CreateScope())
{
    var db = scope.ServiceProvider.GetRequiredService<AppDbContext>();
    db.Database.EnsureCreated();
}

app.MapGet("/", () => "API de Jogos - Minimal API com .NET");

app.MapGet("/status", () => 
{
    return Results.Ok(new 
    { 
        status = "online", 
        mensagem = "API de Jogos funcionando", 
        dataHora = DateTime.Now 
    });
});

app.MapPost("/jogos", async (AppDbContext db, Jogo novoJogo) =>
{
    db.Jogos.Add(novoJogo);
    await db.SaveChangesAsync();
    
    return Results.Created($"/jogos/{novoJogo.Id}", novoJogo);
});

app.MapGet("/jogos", async (AppDbContext db) =>
{
    var jogos = await db.Jogos.ToListAsync();
    return Results.Ok(jogos);
});

app.MapGet("/jogos/{id}", async (int id, AppDbContext db) =>
{
    var jogo = await db.Jogos.FindAsync(id);
    
    if (jogo is null) return Results.NotFound("Jogo não encontrado.");
    
    return Results.Ok(jogo);
});

app.MapPut("/jogos/{id}", async (int id, Jogo jogoAtualizado, AppDbContext db) =>
{
    var jogo = await db.Jogos.FindAsync(id);
    if (jogo is null) return Results.NotFound("Jogo não encontrado.");

    jogo.Nome = jogoAtualizado.Nome;
    jogo.Desenvolvedora = jogoAtualizado.Desenvolvedora;
    jogo.Preco = jogoAtualizado.Preco;
    jogo.Disponivel = jogoAtualizado.Disponivel;
    jogo.DataCadastro = jogoAtualizado.DataCadastro;

    await db.SaveChangesAsync();
    return Results.Ok(jogo);
});


app.MapDelete("/jogos/{id}", async (int id, AppDbContext db) =>
{
    var jogo = await db.Jogos.FindAsync(id);
    if (jogo is null) return Results.NotFound("Jogo não encontrado.");

    db.Jogos.Remove(jogo);
    await db.SaveChangesAsync();
    

    return Results.NoContent();
});

app.Run();