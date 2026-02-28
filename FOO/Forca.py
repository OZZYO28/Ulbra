from os import system as cls
palavra = str(input("Digite a palavra: ")).strip().upper()

vidas = 6
historicoS = []
historicoN = []

cls("cls")
letras = [char for char in palavra]

while True:
    cls("cls")
    erros = 0
    for letra in letras:
        if letra in historicoS:
            print(letra, end=" ")
        else:
            print("_", end=" ")
            erros += 1
    if erros > 0:
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
    else:
        break
print(f"\nfim do jogo, você teve {6 - vidas} erro até conseguir")
    