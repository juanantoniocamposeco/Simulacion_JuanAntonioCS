import random
import string

caracteres = string.ascii_letters + string.digits
password = ''.join(random.choice(caracteres) for _ in range(10))

print("La Contraseña generada es:", password)
