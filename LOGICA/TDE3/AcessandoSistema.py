user: str = str(input("Usuário: ")).strip().capitalize()
password: str = str(input("Senha: ")).strip().lower()
if (user == "Admin" and password == "password"):
    print("Acesso concedido!")
else:
    print("Acesso negado!")