idade: int = int(input("digite sua idade: "))
if (18 <= idade <= 70):
    print("obrigatorio")
elif (idade >= 16):
    print("opcional")
else:
    print("não vota")