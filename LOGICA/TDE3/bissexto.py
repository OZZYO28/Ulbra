ano:int = int(input("Digite um ano e veja se ele é bisexto: "))
if ((ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0)):
    print(f"O ano {ano} é bissexto.")
else:
    print(f"O ano {ano} NÃO é bissexto.")