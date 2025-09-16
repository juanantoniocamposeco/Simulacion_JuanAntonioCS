set.seed(123)
total <- 10000
numeros <- runif(total, min=0, max=1)  

cat("Promedio esperado ≈ 0.5\n")
cat("Promedio obtenido:", mean(numeros), "\n")

# Graficar histograma
hist(numeros, breaks=20, main="Uniformidad en R",
     xlab="Valores", ylab="Frecuencia", col="lightblue", border="black")
