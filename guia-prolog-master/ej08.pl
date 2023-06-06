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

producto_menu_menor_cal(X,Y):-
    menu(_,_,_,X),
    menu(_,_,_,Y),
    X<Y.

menu_sin_min_cal(X):-
    producto_menu_menor_cal(_,X).

menu_min_cal(Entrada, Principal, Postre, Calorias):-
    menu(Entrada, Principal, Postre, Calorias),
    \+menu_sin_min_cal(Calorias).