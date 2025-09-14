secreto <- sample(1:40, 1)
intento <- as.integer(readline("Adivina el número entre 1 y 40: "))

while(intento != secreto){
  if(intento < secreto){
    intento <- as.integer(readline("Es mayor, intenta de nuevo: "))
  } else {
    intento <- as.integer(readline("Es menor, intenta de nuevo: "))
  }
}
cat("¡Correcto! El número era", secreto, "\n")

