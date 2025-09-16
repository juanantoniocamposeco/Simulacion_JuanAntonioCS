import random

opciones = ["Cara", "Cruz"]
total = 15

print("Lanzamientos consecutivos de dos monedas:")
for i in range(1, total+1):
    moneda1 = random.choice(opciones)
    moneda2 = random.choice(opciones)
    print(f"Par {i}: ({moneda1}, {moneda2})")
