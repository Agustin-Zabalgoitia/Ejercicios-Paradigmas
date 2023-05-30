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

bebida(vino).
bebida(cerveza).
bebida(agua).

plato_principal(Principal):-
	carne(Principal);
	pescado(Principal).

menu(Entrada, Principal, Postre, Bebida):-
	entrada(Entrada),
	plato_principal(Principal),
	postre(Postre),
    bebida(Bebida).

menu_sin_flan(X,Y,Z):-
	menu(X,Y,Z), Z \== flan.