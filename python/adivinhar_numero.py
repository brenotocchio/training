import random

print('Seja bem vindo ao jogo de adivinhação! abaixo segue as regras e como jogar!')
print('O sistema vai gerar um número aleatório entre 1 e 100, para ganhar, você deve acertar qual número foi gerado, e a cada tentativa, será contabilizado e será dada algumas dicas para te ajudar a achar, espero que você goste.')
print('Programing by Breno Tocchio', '\n')
none = input('Precione enter para iniciar o jogo!')

numero = random.randint(1, 100)

erros = 0

while True:

    palpite = int(input('Digite o palpite: '))

    distancia = abs(palpite - numero)

    if distancia == 0:
        erros += 1
        print('Parabéns! você acertou o número')
        print(f'O número de tentativas foram: {erros}')
        break

    if distancia <= 5:
        print('Está muito muito muito quente...')
        erros += 1

    elif distancia <= 10:
        print('Está muito quente...')
        erros += 1

    elif distancia <= 15:
        print('Está ficando quente...')
        erros += 1

    elif distancia <= 20:
        print('Está morno...')
        erros += 1

    elif distancia <= 25:
        print('Está ficando gelado...')
        erros += 1

    elif distancia <= 35:
        print('Está gelado...')
        erros += 1    

    else:
        print('Está congelando...')
        erros += 1
