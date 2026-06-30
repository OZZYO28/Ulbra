# 1. Estrutura do Projeto

```text
projeto/
├── index.html
└── js/
    └── script.js

index.html: Monta a tela do aplicativo (textos, botões e listas) e carrega o visual usando o Tailwind CSS.

js/script.js: Guarda toda a lógica do sistema. É ele que cria os itens, move as tarefas e avisa se o usuário deixou o campo vazio.

Como funciona: O aplicativo roda direto no navegador. O JavaScript pega o que o usuário digitou, cria os blocos das tarefas na tela, pinta com as cores certas (dependendo da prioridade) e organiza nas listas.

2. Métodos e Conceitos de DOM Utilizados
Seleção de Elementos
document.getElementById(): Encontra um elemento da página usando o seu id.

Exemplo: const pendentes = document.getElementById("pendentes");

document.querySelector(): Encontra o primeiro elemento que tenha a classe, id ou tag indicada.

Exemplo: const tarefa = document.querySelector("#tarefa");

Criação e Manipulação
document.createElement(): Cria um novo elemento HTML do zero para ser usado depois.

Exemplo: const li = document.createElement("li");

element.appendChild(): Coloca um elemento dentro de outro (como colocar um item dentro de uma lista).

Exemplo: pendentes.appendChild(li);

element.classList.add() / .remove(): Coloca ou tira classes de estilo (CSS) de um elemento.

Exemplo: li.classList.add("bg-red-500", "text-white");

Manipulação de Eventos
element.addEventListener(): Fica "escutando" as ações do usuário (como um clique no botão) e roda uma ação quando isso acontece.

Exemplo: btnRemover.addEventListener("click", function() { ... });

Manipulação de Estilos
Em vez de colocar o estilo direto no HTML (usando element.style), usamos o JavaScript para adicionar e remover classes prontas do Tailwind (como bg-green-500 ou bg-red-500). Isso deixa o código mais limpo e fácil de organizar.

Remoção e Movimentação
element.remove(): Apaga o elemento da tela de vez.

Exemplo: li.remove();

Transferência entre listas: Para mover uma tarefa das Pendentes para as Concluídas, usamos o próprio appendChild. O navegador percebe que o item já existe na tela e apenas o muda de lugar automaticamente, sem precisar copiar ou criar um novo.

3. Capturas de Tela
Tela inicial:

![alt](./Tela%20inicial.png)

Tarefa cadastrada:

![https://](./Pendentes.png)

Histórico de concluídas:

![alt](./Concluidas.png)

Funcionamento em tela menor (responsividade):

![alt](./Responsivo.png)

4. Sem muitas dificuldades, somente a "sintaxe" do tailwind, algumas pesquisas externas e auxilio de IA para alguns blocos mais complexos