from os import system as cls

palavra = str(input("Digite a palavra: ")).strip().upper()

vidas = 6
historicoS = []
historicoN = []

cls("cls")
letras = [char for char in palavra]

while True:
    cls("cls")

    if vidas == 0:
        print("Fim do jogo, sem mais vidas restantes")
        break

    certas = 0

    for letra in letras:

        if letra in historicoS:
            print(letra, end=" ")
            certas += 1

        else:
            print("_", end=" ")
            certas = 0

    if certas != len(letras):

        print(f"\n\nvocê tem {vidas} vidas restantes")
        print(f"Historico de letras: {historicoN}")

        L = input("\nLetra:").strip().upper()[0]

        if L in historicoN or L in historicoS:
            input("Ja tentou esta letra")

        elif L in letras:
            historicoS.append(L[0])

        else:
            historicoN.append(L[0])
            vidas -= 1
    else:
        print(f"\nfim do jogo, você teve {6 - vidas} erro(s) até conseguir")
        break
