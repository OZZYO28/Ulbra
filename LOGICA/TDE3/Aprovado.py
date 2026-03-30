nota:float = float(input("Nota do aluno: "))
entregou:bool = bool(input("Entregou dentro do prazo? ").strip().lower() in ["sim", "s"])
apresentou:bool = bool(input("Apresentou o trabalho? ").strip().lower() in ["sim", "s"])
print("Aprovado" if nota >= 6 and entregou and apresentou else "Reprovado")