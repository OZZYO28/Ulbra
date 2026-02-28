def menu():
    fds = int(input("""======== MENU ========
1 - Escolher palavra
2 - Descobrir palavra
======================
[Indice]: """))
    
    match fds:
        case 1:
            Escolher()
        case 2:
            Descobrir()

def Escolher(): pass

def Descobrir(): pass

menu()