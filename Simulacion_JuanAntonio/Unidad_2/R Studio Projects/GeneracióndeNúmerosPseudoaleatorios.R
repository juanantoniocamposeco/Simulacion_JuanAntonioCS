fibonacci_aditivo <- function(seed, n) {
  m <- 2^31 - 1
  x <- numeric(n+2)
  x[1] <- seed
  x[2] <- (seed * 37) %% m
  
  for (i in 3:(n+2)) {
    x[i] <- (x[i-1] + x[i-2]) %% m
  }
  return(x[3:(n+2)])
}

cat("Generación de números pseudoaleatorios con método aditivo (R):\n")
print(fibonacci_aditivo(12345, 10))
