hombre(pedro) .
hombre(manuel) .
hombre(arturo) .

mujer(maría).

padre(pedro, manuel).
padre(pedro, arturo).
padre(pedro, maría) .

niño(X,Y):- % expresa que X es hijo o hija de Y.
    padre(Y,X).

hijo(X,Y):- % expresa que X es un hijo varón de Y.
    niño(X,Y),
    hombre(X).

hija(X,Y):- % expresa que X es una hija de Y.
    niño(X,Y),
    mujer(X).

hermano-o-hermana(X,Y):- % expresa que X es hermano o hermana de Y.
	niño(X, Padre),
    niño(Y, Padre),
    X \== Y.

hermano(X,Y):- % expresa que X es un hermano de Y.
    hermano-o-hermana(X,Y),
    hombre(X).

hermana(X,Y):- % expresa que X es una hermana de Y.
    hermano-o-hermana(X,Y),
    mujer(X).