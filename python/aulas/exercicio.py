lista = []

while (True):
    print("Selecione uma opção")
    opcao = input("[i]nserir [a]pagar [l]istar [s]air\n").lower()

    if opcao == 'i':
        valor = input("Valor: ")
        lista.append(valor)
        print("Valor adicionado!")

    elif opcao == 'a':
        if len(lista) == 0:
            print("Não há valores para apagar.")
        else:
            indice = int(input("Indice: "))
            lista.pop(indice)
            print("Valor removido")

    elif opcao == 'l':
        if len(lista) == 0:
            print("Não há valores para mostrar.")
        else:
            for indice, nome in enumerate(lista):
                print (indice, nome)

    elif opcao == 's':
        print("Saindo...")
        break

    else:
        print("Opção inválida")