package edu.unlam.paradigmas.patrones.ej02;

public class TankModeSiegeState implements TankState {

	@Override
	public void move(Tank tank) {
		tank.speed = 0.5;
		tank.fuel -= 1;
	}

	@Override
	public void attack(Tank tank) {
		tank.damage = 22;
		tank.ammo -= 2;
	}

}
