set.seed(123)
total <- 100000
x <- runif(total)
y <- runif(total)

dentro <- sum(x^2 + y^2 <= 1)
pi <- 4 * dentro / total

cat("Aproximación de π con Monte Carlo (R):", pi, "\n")
