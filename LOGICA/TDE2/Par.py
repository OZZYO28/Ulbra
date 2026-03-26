numero:int = int(input("este numero é par? "))
verificação:int = int(numero % 2)
if (numero is 0):
    print("matematicamente zero corresponde como um valor par, por é divisivel e multiplo de dois, além de estar entre dois valores impares (-1 e 1)")
elif (verificação is 0):
    print("é par")
else:
    print("não é par")