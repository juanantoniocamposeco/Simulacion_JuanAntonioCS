set.seed(123)
total <- 30
dados <- sample(1:6, total, replace=TRUE)

cat("Lanzamientos de dado en R:\n")
print(dados)

# Tabla de frecuencias
cat("\nFrecuencia de cada cara:\n")
print(table(dados))
