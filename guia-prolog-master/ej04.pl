transporte(roma,20).
transporte(londres,30).
transporte(tunez,10).

alojamiento(roma,hotel,50).
alojamiento(roma,hostal,30).
alojamiento(roma,camping,10).
alojamiento(londres,hotel,60).
alojamiento(londres,hostal,40).
alojamiento(londres,camping,20).
alojamiento(tunez,hotel,40).
alojamiento(tunez,hostal,20).
alojamiento(tunez,camping,5).

viaje(C,S,H,P):-
    transporte(C,PT),
    alojamiento(C,H,PA),
    P is PT+(PA*S).

viajeeconomico(C,S,H,P,Pmax):-
    viaje(C,S,H,P),
    P<Pmax.