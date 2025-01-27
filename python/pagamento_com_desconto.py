vippass = input('Você é usuário vip? [Sim] [Não]: ')
if vippass == 'Sim' or vippass == 'sim':
    senha = input('Digite sua senha: ')

    senha_permitida = '123456'

    if senha == senha_permitida:
        print('Você se cadastrou com sucesso!')
        valor_compra_vip = float(input('Digite o valor da sua compra: '))
        cupom_vip = input('Você possuí cupom de desconto? [Sim] [Não]: ')
        if cupom_vip == 'Sim' or cupom_vip == 'sim':
            cupom_vip_senha = input('Digite o cupom: ')
            cupom_vip_senha_correto = '123456'
            if cupom_vip_senha == cupom_vip_senha_correto:
                desconto_vip = valor_compra_vip * 0.3
                resultado_vip_cupom = valor_compra_vip - (valor_compra_vip*0.3)
                print(f'Você recebeu um desconto de 30%! Sua compra ficou no valor de:{resultado_vip_cupom:.2f} reais')
                print(f'Com um desconto incrível de {desconto_vip:.2f} reais')
            else:
                print('O cupom que você escreveu está incorreto ou inválido, tente novamente.')
                exit()
        else:
            resultado_vip_cupom = valor_compra_vip - (valor_compra_vip*0.2)
            desconto_vip = valor_compra_vip * 0.2
            print(f'Você ganhou um desconto de 20%! O valor da sua compra ficou {resultado_vip_cupom:.2f} reais.')
            print(f'Com um desconto incrível de {desconto_vip:.2f} reais')

    else:
        print('Senha incorreta.')
        exit()

# Cliente sem cadastro

else:
    print('Você ainda não é cliente vip, faça o cadastro agora mesmo!')
    nulo = input('Caso queira completar a compra sem iniciar login, prossiga apertando enter.')

    try:
            valor_compra_sem_vip = float(input('Digite o valor da compra: '))
    except ValueError:
        print("Você digitou algo que não é um número! Por favor, tente novamente.")
        exit()

    cupom_sem_vip = input('Você possuí cupom de desconto? [Sim] [Não]: ')
    print('Lembrando que compras acima de 300 reais recebem 5% de desconto mesmo sem cupom.')
    if (cupom_sem_vip == 'Sim' or cupom_sem_vip == 'sim') and valor_compra_sem_vip >=300:
        senha_sem_vip = '123456'
        senha_digitada = input('Digite o cupom: ')
        if senha_digitada == senha_sem_vip:
            print('Você ganhou 15% de desconto nas compras!')
            compra_combo_sem_vip = valor_compra_sem_vip - (valor_compra_sem_vip*0.15)
            desconto_combo_sem_vip = valor_compra_sem_vip * 0.15
            print(f'O valor total ficou: {compra_combo_sem_vip:.2f} reais.')
            print(f'Com um desconto incrível de {desconto_combo_sem_vip:.2f} reais')

        else:
            print('Cupom incorreto ou inválido.')
            exit()

    elif (cupom_sem_vip == 'Sim' or cupom_sem_vip == 'sim'):
        senha_sem_vip = '123456'
        senha_digitada = input('Digite o cupom: ')
        if senha_digitada == senha_sem_vip:
            print('Você ganhou 10% de desconto nas compras!')
            valor_total_sem_vip = valor_compra_sem_vip - (valor_compra_sem_vip*0.1)

            print(f'O valor total ficou: {valor_total_sem_vip:.2f} reais.')

            desconto_sem_vip = valor_compra_sem_vip * 0.1

            print(f'Com um desconto incrível de {desconto_sem_vip:.2f} reais')
            exit()
        else:
            print('Cupom incorreto ou inválido.')
            exit()

        valor_total_sem_vip = valor_compra_sem_vip - (valor_compra_sem_vip*0.1)

        print(f'O valor total ficou: {valor_total_sem_vip:.2f} reais.')

        desconto_sem_vip = valor_compra_sem_vip * 0.1

        print(f'Com um desconto incrível de {desconto_sem_vip:.2f} reais')
        exit()
    elif valor_compra_sem_vip >= 300:

        valor_total_sem_vip = valor_compra_sem_vip - (valor_compra_sem_vip*0.05)

        print(f'O valor total ficou: {valor_total_sem_vip:.2f} reais.')
        desconto_sem_vip = valor_compra_sem_vip * 0.05
        print(f'Com um desconto incrível de {desconto_sem_vip:.2f} reais')

    else:
        print(f'A compra não alterou o valor, ficando {valor_compra_sem_vip} reais')
    exit()
