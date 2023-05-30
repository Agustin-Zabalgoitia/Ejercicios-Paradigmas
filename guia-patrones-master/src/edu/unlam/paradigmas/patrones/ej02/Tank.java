package edu.unlam.paradigmas.patrones.ej02;

public class Tank {
	TankState state;
	int fuel = 50;
	int ammo = 20;
	int damage;
	double speed;

	public void tankMode() {
		this.state = new TankModeTankState();
	}

	public void siegeMode() {
		this.state = new TankModeSiegeState();
	}

	public void move() {
		this.state.move(this);
	}

	public void attack() {
		this.state.attack(this);
	}

	public TankState getState() {
		return state;
	}

	public int getFuel() {
		return fuel;
	}

	public int getAmmo() {
		return ammo;
	}

	public int getDamage() {
		return damage;
	}

	public double getSpeed() {
		return speed;
	}
}
