from os import system as cls
palavra = str(input("Digite a palavra: ")).strip().upper()

vidas = 6
historicoS = []
historicoN = []

cls("cls")
letras = [char for char in palavra]

for letra in enumerate(letras):
    print(" _ ", end="")

while True:
    cls("cls")
    print(f"\n\nvocê tem {vidas} vidas restantes")
    print(f"Historico de letras: {historicoN}")

    L = input("\nLetra:").strip().upper()
    if L in historicoN or L in historicoS:
        input("Ja tentou esta letra")
    elif L in letras:
        historicoS.append(L)
    else:
        historicoN.append(L)
        vidas -= 1

    for letra in historicoS:
        for letra1 in letras:
            if letra1 == letra:
                print(letra1, end="")
            else:
                print(" _ ", end="")
    