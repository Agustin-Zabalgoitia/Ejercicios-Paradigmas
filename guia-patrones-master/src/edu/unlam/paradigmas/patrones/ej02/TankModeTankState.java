package edu.unlam.paradigmas.patrones.ej02;

public class TankModeTankState implements TankState{

	@Override
	public void move(Tank tank) {
		tank.speed = 1.5;
		tank.fuel -= 3;
	}

	@Override
	public void attack(Tank tank) {
		tank.damage = 10;
		tank.ammo -= 1;
	}

}
