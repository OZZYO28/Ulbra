senha: str = str(input("Digite sua senha de quatro digitos: ")).lower().strip()
if (len(senha) != 4):
  print("Este valor nao tem quatro digitos")
  exit()
 
v1: int = int(senha[0])
v2: int = int(senha[1])
v3: int = int(senha[2])
v4: int = int(senha[3])
iguais = 0
soma = v1+v2+v3+v4
maior = int(senha[0])

print(v1, "é o primeiro")
print(v2, "é o segundo")
print(v3, "é o terceiro")
print(v4, "é o quarto")

if (senha[::-1] == senha):
  print("é palíndromo")
else:
  print("Náo é palíndromo")

if (v1 == v2 or v1 == v3 or v1 == v4):
  iguais += 1
if (v2 == v3 or v2 == v4):
  iguais += 1
if (v3 == v4):
  iguais += 1

if (iguais >= 1):
    print("Existem numeros repetidos")
else:
   print("Não existem numeros repetidos")

if (maior < v2):
    maior = v2
if (maior < v3):
    maior = v3
if (maior < v4):
    maior = v4

print(f" {maior}é o maior numero")