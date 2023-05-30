entrada(paella, 10).
entrada(gazpacho, 5).
entrada(consomé, 2).

carne(filete_de_cerdo, 30).
carne(pollo_asado, 20).

pescado(trucha, 18).
pescado(bacalao, 12).

postre(flan, 35).
postre(helado, 40).
postre(pastel, 60).

plato_principal(Principal, Calorias):-
	carne(Principal, Calorias);
	pescado(Principal, Calorias).

menu(Entrada, Principal, Postre, Calorias):-
	entrada(Entrada, Calorias1),
	plato_principal(Principal, Calorias2),
	postre(Postre, Calorias3),
    Calorias is Calorias1 + Calorias2 + Calorias3.

menu_sin_flan(X,Y,Z,W):-
	menu(X,Y,Z,W), Z \== flan.

%los profes dijeron que no ibamos a ver listas,
%así que no estoy del todo seguro de qué otra forma
%se puede resolver esto.
min_calorias(MinCalorias):-
    findall(Calorias, menu(_, _, _, Calorias), CaloriasList),
    min_list(CaloriasList, MinCalorias).