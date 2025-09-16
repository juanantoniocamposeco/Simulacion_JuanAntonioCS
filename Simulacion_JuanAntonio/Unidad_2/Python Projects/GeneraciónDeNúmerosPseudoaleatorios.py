def cuadrados_medios(seed, n):
    numeros = []
    x = seed
    for _ in range(n):
        x = (x * x) // 100 % 10000  # cuadrado, quitar extremos
        numeros.append(x)
    return numeros

print("Generación de números pseudoaleatorios con el método del cuadrado medio:")
print(cuadrados_medios(5735, 10))
