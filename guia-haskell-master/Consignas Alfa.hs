module Main where

--1. Dado dos números enteros A y B, implemente una función que retorne la división entera de ambos por el método de las restas sucesivas
dividir 0 b = 0
dividir a b = dividir (a - b) (b) + 1

--2. Escribir una función para hallar la potencia de un número

potencia a 0 = 1
potencia a b = a * potencia a (b - 1)

--3. Definir una función menor que devuelve el menor de sus dos argumentos enteros

menor a b = if a < b 
    then a
    else b

--4. Definir una función maximoDeTres que devuelve el máximo de sus argumentos enteros
maximo a b = if a > b
    then a
    else b

maximoDeTres a b c = maximo (maximo a b ) c

main = do
  print ("--- Punto 1 ---")
  print (100 `dividir` 2)
  print ("--- Punto 2 ---")
  print (2 `potencia` 16)
  print ("--- Punto 3 ---")
  print (7 `menor` 8)
  print (123456 `menor` 1)
  print ("--- Punto 4 ---")
  print (maximoDeTres 1 2 3)
  print (maximoDeTres 5 4 6)
  print (maximoDeTres 9 8 7)
  