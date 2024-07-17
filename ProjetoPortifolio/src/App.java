print("Bem-Vindo a Sorveteria do Mateus Silva de Souza")
print("-------------------------------------------CARDÁPIO--------------------------------------------")
print("│ Código │       Descrição      │ Tamanho P (500ml) │ Tamanho M (1000ml) │ Tamanho G (2000ml) │")
print("│   TR   │ Sabores Tradicionais │      R$ 6,00      │      R$ 10,00      │      R$ 18,00      │")
print("│   ES   │  Sabores Especiais   │      R$ 7,00      │      R$ 12,00      │      R$ 21,00      │")
print("│   PR   │   Sabores Premium    │      R$ 8,00      │      R$ 14,00      │      R$ 24,00      │")
print("-----------------------------------------------------------------------------------------------")

valor = 0


while True:
    tamanho = input("Entre com o TAMANHO do pote desejado (P/M/G): ")
    tamanho = tamanho.upper()
    if tamanho != "P"  and tamanho != "M" and tamanho != "G":
        print("!!!!!! TAMANHO OU CÓDIGO INVÁLIDO(S) !!!!!!")
        continue # Se o usuário digitar algo inválido ele volta para o começo do while

    codigo = input("Entre com CÓDIGO do pote desejado (TR/ES/PR): ")
    codigo = codigo.upper() # Validar letra minúscula
    if codigo != 'TR' and codigo != 'ES' and codigo != 'PR':
        print("!!!!!! TAMANHO OU CÓDIGO INVÁLIDO(S) !!!!!!")
        continue # Se o usuário digitar algo inválido ele volta para o começo do while

    if tamanho == 'P' and codigo == 'TR':
        print("Você pediu um sorvete sabor TRADICIONAL P de R$ 6,00")
        valor = valor + 6 # Pega o valor e acrescenta 6 no total
        
    else if tamanho == 'M' and codigo == 'TR':
        print("Você pediu um sorvete sabor TRADICIONAL M de R$ 10,00")
        valor = valor + 10 # Pega o valor e acrescenta 10 no total
        
    else if tamanho == 'G' and codigo == 'TR':
        print("Você pediu um sorvete sabor TRADICIONAL G de R$ 18,00")
        valor = valor + 18 # Pega o valor e acrescenta 18 no total
        
    else if tamanho == 'P' and codigo == 'ES':
        print("Você pediu um sorvete sabor ESPECIAL P de R$ 7,00")
        valor = valor + 7 # Pega o valor e acrescenta 7 no total
       
    else if tamanho == 'M' and codigo == 'ES':
        print("VVocê pediu um sorvete sabor ESPECIAL M de R$ 12,00")
        valor = valor + 12  # Pega o valor e acrescenta 12 no total
        
    else if tamanho == 'G' and codigo == 'ES':
        print("Você pediu um sorvete sabor ESPECIAL G de R$ 21,00")
        valor = valor + 21  # Pega o valor e acrescenta 21 no total
       
    else if tamanho == 'P' and codigo == 'PR':
        print("Você pediu um sorvete sabor PREMIUM P de R$ 8,00")
        valor = valor + 8  # Pega o valor e acrescenta 8 no total
        
    else if tamanho == 'M' and codigo == 'PR':
        print("Você pediu um sorvete sabor PREMIUM M de R$ 14,00")
        valor = valor + 14  # Pega o valor e acrescenta 14 no total
        
    else if tamanho == 'G' and codigo == 'PR':
        print("Você pediu um sorvete sabor PREMIUM G de R$ 24,00")
        valor = valor + 24  # Pega o valor e acrescenta 24 no total
          
    comprar_mais = input("Deseja pedir mais alguma coisa? (S/N): ")
    if comprar_mais.upper() == 'S':
        continue # Voltar para o começo do while
    else:
        print("O total a ser pago é: R${:.2f}" .format(valor))
        break