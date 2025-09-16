import random

total = 10000
numeros = [random.random() for _ in range(total)]  # entre 0 y 1

promedio = sum(numeros) / total

print("Se generaron", total, "números aleatorios uniformes en [0,1]")
print("Promedio esperado ≈ 0.5")
print("Promedio obtenido:", promedio)
