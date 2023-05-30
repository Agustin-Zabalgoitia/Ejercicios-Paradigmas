parcial1(ana, 7).
parcial1(juan, 4).
parcial1(luisa, 8).
parcial1(pedro, 6).
parcial1(maría, 5).
parcial1(carlos, 2).
parcial1(sofía, 7).
parcial1(fernando, 9).
parcial1(jose, 1).

parcial2(ana,9).
parcial2(juan,8).
parcial2(luisa, 7).
parcial2(pedro, 3).
parcial2(maría, 8).
parcial2(carlos, 4).
parcial2(sofía, 6).
parcial2(fernando, 9).
parcial2(jose, 1).

promocionados(A,N):-
    parcial1(A,N1),
    parcial2(A,N2),
    N1 >= 7,
    N2 >= 7,
    N is (N1+N2)/2.

cursados(A,N):-
    parcial1(A,N1),
    parcial2(A,N2),
    N is (N1+N2)/2,
    \+N >= 7,
    \+N < 4.

recursan(A,N):-
    parcial1(A,N1),
    parcial2(A,N2),
    N is (N1+N2)/2,
    \+N >= 4.







    
    
    