entrada(paella).
entrada(gazpacho).
entrada(consomé).

carne(filete_de_cerdo).
carne(pollo_asado).

pescado(trucha).
pescado(bacalao).

postre(flan).
postre(helado).
postre(pastel).

plato_principal(Principal):-
	carne(Principal);
	pescado(Principal).

menu(Entrada, Principal, Postre):-
	entrada(Entrada),
	plato_principal(Principal),
	postre(Postre).

menu_sin_flan(X,Y,Z):-
	menu(X,Y,Z), Z \== flan.

