import threading

def tabuada():
    numero = 1
    i = 1
    while(numero < 11):
        resultado = numero * i
        print(f"Resultado {i} vezes {numero}: {resultado}" )
        numero += 1
    
    
t = threading.Thread(target=tabuada)
t.start()

t.join()

print("Fim do programa")