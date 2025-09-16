import random

total = 100000
dentro = 0

for _ in range(total):
    x = random.random()
    y = random.random()
    if x**2 + y**2 <= 1:
        dentro += 1

pi = 4 * dentro / total
print("Aproximación de π con Monte Carlo:", pi)
