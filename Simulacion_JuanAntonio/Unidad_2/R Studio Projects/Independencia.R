set.seed(123)
total <- 20
num1 <- runif(total, min=0, max=1)  # primer número
num2 <- runif(total, min=0, max=1)  # segundo número

cat("Pares de números uniformes independientes (R):\n")
for (i in 1:total) {
  cat(sprintf("Par %d: (%.3f, %.3f)\n", i, num1[i], num2[i]))
}
