hombre(juan, alta, castaño, joven).
hombre(pedro, baja, pelirrojo, viejo).
hombre(fernando, media, castaño, adulta).
hombre(luis, baja, pelirrojo, joven).
hombre(carlos, media, castaño, vieja).

mujer(maria, media, rubio, adulta).
mujer(laura, alta, negro, joven).
mujer(sara, baja, rubio, vieja).
mujer(ana, alta, negro, adulta).
mujer(patricia, baja, rubio, joven).

gusta(juan, pop, aventura, tenis).
gusta(pedro, jazz, policíaca, jogging).
gusta(fernando, clásica, ciencia-ficción, natación).
gusta(luis, pop, aventura, tenis).
gusta(carlos, jazz, policíaca, jogging).
gusta(maria, clásica, ciencia-ficción, natación).
gusta(laura, pop, aventura, tenis).
gusta(sara, jazz, policíaca, jogging).
gusta(ana, clásica, ciencia-ficción, natación).
gusta(patricia, pop, aventura, tenis).

busca(juan, alta, rubio, adulta).
busca(pedro, media, negro, joven).
busca(fernando, alta, rubio, vieja).
busca(luis, alta, negro, adulta).
busca(carlos, media, rubio, joven).
busca(maria, baja, castaño, joven).
busca(laura, baja, pelirrojo, adulta).
busca(sara, media, castaño, vieja).
busca(ana, baja, pelirrojo, joven).
busca(patricia, alta, castaño, joven).

sexo_opuesto(X,Y):-
    (hombre(X,_,_,_), mujer(Y,_,_,_));
    (hombre(Y,_,_,_), mujer(X,_,_,_)).

son_adecuadas(X, Y):-
    %X conviene a Y, si X conviene físicamente a Y
    %(altura, edad y color de Y son los que busca X)
    busca(Y, Ay, Cy, Ey),
    ( hombre(X, Ax, Cx, Ex);mujer(X,Ax, Cx, Ex) ),
    gusta(X, Mx, Lx, Dx),
    gusta(Y, My, Ly, Dy),
    sexo_opuesto(X,Y),
    Ay == Ax,
    Cy == Cx,
    Ey == Ex,
    Mx == My,
    Lx == Ly,
    Dx == Dy.