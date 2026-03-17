num1 = int(input("Digite um número para ser somado: ")) # Primeiro número somado
print("Deseja somar mais um número? (S ou N)")
resposta = input().strip().upper()
if resposta in ('N'):
    print("O número escolhido resulta em: ", num1)
    exit()

else:
    num2 = int(input("Digite o segundo número para ser somado: ")) # Segundo número somado
soma = num1 + num2
print("Deseja somar mais um número? (S ou N)")
resposta2 = input().strip().upper()
if resposta2 in ('N'):
    print("O número somado resulta em: ", soma)
    exit()
    # Terceiro número somado
else:
    num3 = int(input("Digite o segundo número para ser somado: ")) # Terceiro número somado
soma2 = num1 + num2 + num3
print("Deseja somar mais um número? (S ou N)")
resposta3 = input().strip().upper()
if resposta3 in ('N'):
    print("O número somado resulta em: ", soma2)
    exit()
else: 
    num4 = int(input("Digite o segundo número para ser somado: ")) # Quarto número somado
soma3 = num1 + num2 + num3 + num4
print("O valor total da soma de 4 números resulta em: ", soma3)
exit()
