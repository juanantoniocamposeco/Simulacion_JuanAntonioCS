import random

resultados = [random.randint(1, 6) for _ in range(30)]

print("Resultados:", resultados)
for i in range(1, 7):
    print(f"El número {i} salió {resultados.count(i)} veces")
