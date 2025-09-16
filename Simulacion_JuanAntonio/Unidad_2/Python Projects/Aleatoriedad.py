import random

opciones = ["Cara", "Cruz"]
total = 15

print("Lanzamiento de moneda en Python:")
for i in range(1, total+1):
    moneda = random.choice(opciones)  # elige entre Cara y Cruz
    print(f"Lanzamiento {i}: {moneda}")
