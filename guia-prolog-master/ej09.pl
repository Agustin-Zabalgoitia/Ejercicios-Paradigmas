pais_superficie(argentina, 2780400).
pais_superficie(bolivia, 1098581).
pais_superficie(brasil, 8515767).
pais_superficie(chile, 756102).
pais_superficie(colombia, 1141748).
pais_superficie(costa_rica, 51100).
pais_superficie(cuba, 109884).
pais_superficie(ecuador, 283561).
pais_superficie(el_salvador, 21040).
pais_superficie(guatemala, 108889).
pais_superficie(honduras, 112492).
pais_superficie(méxico, 1964375).
pais_superficie(nicaragua, 130373).
pais_superficie(panamá, 75420).
pais_superficie(paraguay, 406752).
pais_superficie(perú, 1285216).
pais_superficie(república_dominicana, 48671).
pais_superficie(uruguay, 176215).
pais_superficie(venezuela, 916445).

areas_no_max(X):-
    pais_superficie(_,X),
    pais_superficie(_,Y),
    X<Y.

max_area(Pais, Area):-
    pais_superficie(Pais, Area),
    \+ areas_no_max(Area).