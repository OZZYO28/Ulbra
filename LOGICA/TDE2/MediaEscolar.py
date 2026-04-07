nota1: float = float(input("primeira nota: "))
nota2: float = float(input("segunda nota: "))
media: float = float((nota1 + nota2) / 2)
print(f"Sua media foi: {media}!")
if (media >= 6):
    print("aprovado")
elif (media > 0):
    print("recuperação")
else:
    print("reprovado")