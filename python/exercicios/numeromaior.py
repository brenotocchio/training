primeiro_numero = input('Digite o primeiro número: ')
segundo_numero = input('Digite o segundo número: ')

if primeiro_numero > segundo_numero:
    print(f"O primeiro número '{primeiro_numero}' é maior do que o segundo número '{segundo_numero}'")
elif segundo_numero > primeiro_numero:
    print(f"O segundo número '{segundo_numero}' é maior do que o primeiro número '{primeiro_numero}'.")
else:
    print('Os dois número são iguais.')
