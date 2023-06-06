%1. Codifique en prolog las reglas necesarias para obtener el término N en la serie de Gauss
serie_gauss(0,0).
serie_gauss(N,R):-
    N>0,
    N1 is N-1,
    serie_gauss(N1,R1),
    R is R1+N.

%2. Codifique en prolog las reglas necesarias para obtener el término N en la serie de Fibonacci
%a0 = 0
%a1 = 1
%a2 = a0 + a1 / a2 = 0 + 1 = 1
%a3 = a1 + a2 / a3 = 1 + 1 = 2
%a4 = a2 + a3 / a4 = 1 + 2 = 3
%an+2 = an + an+1

fibonacci(0,0).
fibonacci(1,1).
fibonacci(N,R):-
    N>1,
    N1 is N-1,
    N2 is N-2,
    fibonacci(N1,R1),
    fibonacci(N2,R2),
    R is R1+R2.

%3. Codifique en prolog las reglas necesarias para obtener el factorial de un número natural N.
%n! = ... * (n-2) * (n-1) * n
factorial(1,1).
factorial(N,R):-
    N>1,
    N1 is N-1,
    factorial(N1, R1),
    R is R1*N.

%4. Codifique en prolog las reglas necesarias para obtener el producto de dos numeros X e Y, aplicando sumas sucesivas.
multiplicar(_,0,0).
multiplicar(0,_,0).
multiplicar(X,1,X).
multiplicar(1,X,X).
multiplicar(X,Y,R):-
    Y>1,
    Y1 is Y-1,
    multiplicar(X,Y1,R1),
    R is R1+X.

%5. Codifique en prolog las reglas necesarias para obtener la potencia N de un numero X aplicando multiplicaciones sucesivas.
potencia(_, 0, 1).
potencia(X, 1, X).
potencia(X, Y, R):-
    Y>1,
    Y1 is Y-1,
    potencia(X, Y1, R1),
    R is R1*X.

%6. Codifique en prolog las reglas necesarias para obtener la el cociente entre dos números a partir de restas sucesivas.
