const tarefa = document.querySelector("#tarefa");
const pendentes = document.getElementById("pendentes");
const concluidos = document.getElementById("concluidos");
const pos = document.getElementById("pos");

function adicionar() {
    if(tarefa.value == "") {
        alert("Digite uma tarefa válida!");
        tarefa.focus();
        return;
    }

    const li = document.createElement("li");
    
    const spanTexto = document.createElement("span");
    spanTexto.textContent = tarefa.value;
    li.appendChild(spanTexto);

    li.classList.add("p-4", "mb-3", "rounded-lg", "flex", "justify-between", "items-center", "shadow-sm");

    if(pos.value == "baixa") {
        li.classList.add("bg-green-500", "text-white");
    } else if(pos.value == "media") {
        li.classList.add("bg-yellow-500", "text-white");
    } else {
        li.classList.add("bg-red-500", "text-white");
    }

    const divBotoes = document.createElement("div");

    const btnRemover = document.createElement("button");
    btnRemover.textContent = "Excluir";
    btnRemover.classList.add("bg-black", "bg-opacity-20", "hover:bg-opacity-40", "px-3", "py-1", "rounded", "ml-2", "text-sm", "cursor-pointer");

    btnRemover.addEventListener("click", function() {
        li.remove();
        atualizarContadores();
    });

    const btnConcluir = document.createElement("button");
    btnConcluir.textContent = "Concluir";
    btnConcluir.classList.add("bg-black", "bg-opacity-20", "hover:bg-opacity-40", "px-3", "py-1", "rounded", "ml-2", "text-sm", "cursor-pointer");

    btnConcluir.addEventListener("click", function() {
        const data = new Date();
        let texto = `${data.getHours()}:${data.getMinutes()}:${data.getSeconds()} - ${data.getDate()}/${data.getMonth() + 1}/${data.getFullYear()}`;
        
        const spanData = document.createElement("span");
        spanData.textContent = ` (${texto})`;
        spanData.classList.add("text-sm", "font-light", "italic");
        
        spanTexto.appendChild(spanData);

        concluidos.appendChild(li);
        btnConcluir.remove();
        atualizarContadores();
    });

    divBotoes.appendChild(btnConcluir);
    divBotoes.appendChild(btnRemover);
    li.appendChild(divBotoes);

    pendentes.appendChild(li);
    
    tarefa.value = "";
    tarefa.focus();
    atualizarContadores();
}

function atualizarContadores() {
    const countPendentes = document.getElementById("count-pendentes");
    const countConcluidos = document.getElementById("count-concluidos");
    
    if (countPendentes) countPendentes.textContent = pendentes.children.length;
    if (countConcluidos) countConcluidos.textContent = concluidos.children.length;
}