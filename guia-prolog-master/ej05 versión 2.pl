parcial1(ana, 7).
parcial1(juan, 4).
parcial1(luisa, 9).
parcial1(pedro, 6).
parcial1(carlos, 2).
parcial1(fernando, 9).
parcial1(jose, 1).

parcial2(ana,8).
parcial2(juan,8).
parcial2(pedro, 3).
parcial2(maría, 8).
parcial2(carlos, 4).
parcial2(sofía, 6).
parcial2(fernando, 9).
parcial2(jose, 1).

notaFinal(Alumno, NotaF):-
    parcial1(Alumno, N1),
    parcial2(Alumno, N2),
    NotaF is (N1+N2)/2.

%Alumnos que promocionan
promocionan(Alumno):-
    parcial1(Alumno, N1),
    parcial2(Alumno, N2),
    N1 >= 7,
    N2 >= 7.
%Alumnos que promocionan con nota final
promocionanNota(Alumno, NotaF):-
    promocionan(Alumno),
    notaFinal(Alumno, NotaF).

%Alumnos que aprueban
aprueban(Alumno):-
    parcial1(Alumno, _),
    parcial2(Alumno, _),
    \+promocionan(Alumno),
    \+recursan(Alumno).

%Alumnos que recursan
recursan(Alumno):-
    parcial1(Alumno, N1),
    parcial2(Alumno, N2),
    ( N1 < 4 ; N2 < 4).

%El alumno con mayor nota final
sinMaxNota(Nota):-
    promocionanNota(_, Nota),
    promocionanNota(_, Nota2),
    Nota<Nota2.

maxNota(Alumno, Nota):-
    promocionanNota(Alumno, Nota),
    \+sinMaxNota(Nota).

sinMax2Notas(Nota):-
    sinMaxNota(Nota),
    sinMaxNota(Nota2),
    Nota<Nota2.

max2Notas(Alumno, Nota):-
    promocionanNota(Alumno, Nota),
    \+sinMax2Notas(Nota).

%Ausentes
ausentes(Alumno):-
    (parcial1(Alumno, _) ; parcial2(Alumno,_ )),
    \+ notaFinal(Alumno, _).
    