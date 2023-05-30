package edu.unlam.paradigmas.patrones.ej02;

interface TankState {
	public abstract void move(Tank tank);
	public abstract void attack(Tank tank);
}
