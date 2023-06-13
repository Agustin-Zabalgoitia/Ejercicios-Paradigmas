module Main where

-- 1. Escribir una función que sume dos números enteros.
suma :: Int -> Int -> Int
suma a b = a + b

-- 2. Implementar una función que calcule el área de un círculo dado su radio.
area :: Float -> Float
area r = 3.14 * r * r

-- 3. Definir una función que determine si un número es par o impar.
esPar :: Int -> Bool
esPar n = even n

-- 4. Escribir una función que calcule el factorial de un número.
factorial :: Int -> Int
factorial 0 = 1
factorial n = n * factorial (n - 1)

-- 5. Implementar una función que invierta una lista.
invertir :: [a] -> [a]
invertir [] = []
invertir (x : xs) = invertir xs ++ [x]

-- 6. Definir una función que determine si una lista está ordenada de forma ascendente.
estaOrdenadaAscendente :: [Integer] -> Bool
estaOrdenadaAscendente [] = True
estaOrdenadaAscendente [a] = True
estaOrdenadaAscendente (a : b : resto) =
  if a > b
    then False
    else estaOrdenadaAscendente (resto)

-- 7. Escribir una función que cuente la cantidad de elementos en una lista.
contar :: [a] -> Integer
contar [] = 0
contar (_ : resto) = 1 + contar (resto)

-- 8. Implementar una función que obtenga los elementos en posiciones pares de una lista.
elementosEnPar :: [a] -> [a]
elementosEnPar [] = []
elementosEnPar [a] = [a]
elementosEnPar (a : _ : resto) = a : elementosEnPar resto

-- 9. Definir una función que calcule el máximo común divisor de dos números.
maxDivisor2 :: Int -> Int -> Int
maxDivisor2 a 0 = 0
maxDivisor2 a b =
  if a `mod` b == 0
    then b
    else maxDivisor2 a (b - 1)

divisores :: Int -> Int -> [Int]
divisores a 0 = []
divisores a b = maxDivisor2 a b : divisores a (maxDivisor2 a b - 1)

listaDivisores :: Int -> [Int]
listaDivisores a = divisores a a

mcd :: [Int] -> [Int] -> Int
mcd [] b = 0
mcd a [] = 0
mcd (a : as) b =
  if a == head b
    then a
    else
      if a > head b
        then mcd as b
        else mcd b (a : as)

mcdNum :: Int -> Int -> Int
mcdNum a b = mcd (listaDivisores a) (listaDivisores b)

-- 10. Implementar una función que calcule la suma de los dígitos de un número entero.
sumarDigitos :: Int -> Int
sumarDigitos 0 = 0
sumarDigitos a = (a `mod` 10) + sumarDigitos (a `div` 10)

-- 11. Definir una función que encuentre el elemento mínimo en una lista.
-- minEnLista :: [Int] -> Int
minEnLista [a] = a
minEnLista (a : b : resto) = if a < b then minEnLista (a : resto) else minEnLista (b : resto)

-- 12. Escribir una función que obtenga el enésimo número de la secuencia de Fibonacci.
fibonacci :: Int -> Int
fibonacci 0 = 0
fibonacci 1 = 1
fibonacci n = fibonacci (n - 1) + fibonacci (n - 2)

-- 13. Implementar una función que verifique si una cadena de texto es un palíndromo.
palindromo :: String -> Bool
palindromo [] = True
palindromo [a] = True
palindromo (a : as) = a == last as && palindromo (init as)

-- 14. Definir una función que elimine los duplicados de una lista.
--eliminarDuplicados :: [a] -> [a]
eliminarDuplicados [] = []
eliminarDuplicados (a : resto) = if a `elem` resto
    then eliminarDuplicados resto
    else a:eliminarDuplicados resto

-- 15. Implementar una función que obtenga el producto de todos los elementos de una lista.
--producto :: [Float] -> Float
producto [] = 1
producto (a:resto) = a * producto resto
--producto lista = foldr (*) 1 lista

main = do
  print ("--- Punto 1 ---")
  print ("63+5", suma 63 5)
  print ("--- Punto 2 ---")
  print ("radio 13", area 13)
  print ("--- Punto 3 ---")
  print (57, esPar 57)
  print (16, esPar 16)
  print ("--- Punto 4 ---")
  print (6, factorial 6)
  print ("--- Punto 5 ---")
  let listaP5 = [1, 2, 3, 4, 5, 6]
  print (invertir listaP5)
  print ("--- Punto 6 ---")
  let listaP6 = [1, 2, 3, 4]
  print (estaOrdenadaAscendente listaP6)
  let lista2P6 = [1, 2, 4, 3]
  print (estaOrdenadaAscendente lista2P6)
  print ("--- Punto 7 ---")
  let listaP7 = ["a", "b", "c", "d"]
  print (listaP7, contar listaP7)
  print ("--- Punto 8 ---")
  let listaP8 = [0, 1, 2, 3, 4, 5, 6]
  print (elementosEnPar listaP8)
  print ("--- Punto 9 ---")
  print (listaDivisores 152)
  print (listaDivisores 204)
  print (mcdNum 152 204)
  print ("--- Punto 10 ---")
  print (1000023, sumarDigitos 1000023)
  print ("--- Punto 11 ---")
  print (minEnLista [5, 2, 3, 4, 1, 2])
  print ("--- Punto 12 ---")
  print (fibonacci 11)
  print ("--- Punto 13 ---")
  print ("neuquen", palindromo "neuquen")
  print ("Neuquén", palindromo "Neuquén")
  print ("--- Punto 14 ---")
  let listaP14 = [1, 1, 2, 3, 5, 2, 6, 6, 6]
  print (eliminarDuplicados listaP14)
  print ("--- Punto 15 ---")
  print (producto [1,2,3,4])