seguimento1: float = float(input("Primeiro seguimento: "))
seguimento2: float = float(input("Segundo seguimento: "))
seguimento3: float = float(input("Terceiro seguimento: "))

if (seguimento1 < (seguimento2 + seguimento3) and seguimento2 < (seguimento1 + seguimento3) and seguimento3 < (seguimento1 + seguimento2)):
    print("Esses valores formam um triângulo")
else:
    print("Esses valores NÃO formam um triangulo")
    exit()

if (seguimento1 == seguimento2 and seguimento2 == seguimento3):
    print("Este triângulo é equilátero!")
elif (seguimento1 == seguimento2 or seguimento1 == seguimento3 or seguimento2 == seguimento3):
    print("Este triângulo é Isóceles")
else:
    print("Este triângulo é Escaleno")