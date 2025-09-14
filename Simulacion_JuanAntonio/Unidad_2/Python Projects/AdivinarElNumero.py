import random

secreto = random.randint(1, 30)
print("Adivina el número entre el 1 y 30 si usas mas de 3 intentos me debes un chesco:")

while True:
    intento = int(input("Tu intento: "))
    if intento < secreto:
        print("El número es mayor.")
    elif intento > secreto:
        print("El número es menor.")
    else:
        print("¡Siii! El NUMERO Era", secreto)
        break
