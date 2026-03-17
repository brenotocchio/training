# Calculadora com while

continuar = True

while continuar:
    calculo = input('Digite o calculo que deseja fazer: [+] | [-] | [*] | [/] : ') # Entrada calculo

    operador_incorreto = calculo not in '+' '-' '*' '/' # Variavel dos operadores

    if len(calculo) > 1:
        print('Digite apenas 1 operador.')
        continue

    if operador_incorreto:
        print('Você não digitou nenhum operador corretamente.') # Caso nenhuma operação seja escolhida corretamente
        continue

    else:
        try:
            num_1 = float(input('Digite o primeiro número: '))
            num_2 = float(input('Digite o segundo número: '))
        except:
            print('Você não digitou um número corretamente.')
            continue

        if calculo == '+':
            resultado = num_1 + num_2

        elif calculo == '-':
            resultado = num_1 - num_2

        elif calculo == '*':
            resultado = num_1 *  num_2

        else:
            if num_2 == 0:
                print('Erro: divisão por 0 não permitida!')
                continue
            resultado = num_1 / num_2

    print(f'Resultado: {resultado:.2f}')

    ficar_programa = ('Sim', 'sim')
    sair_programa = ('Não', 'não','Nao','nao')

    continuar = input('Você deseja fazer mais um cálculo?: [Sim] [Não] ')
    if continuar in ficar_programa:
        continuar = True
    elif continuar in sair_programa:
        continuar = False
    else:
        print('Você não digitou nenhuma alternativa, por isso, vai sair do programa, espero que tenha gostado')
        exit()

    if continuar == False:
        print('Você saiu da calculadora! Espero que tenha gostado.')
        exit()
