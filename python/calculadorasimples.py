operacao = input('Digite qual operação deseja fazer [+] | [-] | [*] | [/] : ')

if operacao not in ['+', '-', '*', '/']:
    print('Nenhuma operação foi selecionada, tente novamente.')
else:
    numero_1 = float(input('Digite o primeiro número: '))
    numero_2 = float(input('Digite o segundo número: '))

    if operacao == '+':
        print(f'A soma resulta em: {numero_1 + numero_2}')

    elif operacao == '-':
        print(f'A subtração resulta em: {numero_1 - numero_2}')
    elif operacao == '*':
        print(f'A multiplicação resulta em: {numero_1 * numero_2}')
    elif operacao == '/':
        resultado = numero_1 / numero_2
        if resultado.is_integer():
            print(f'A divisão resulta em: {int(resultado)}')  # Converte para inteiro
        else:
            print(f'A divisão resulta em: {resultado:.2f}')  # Mantém como float
