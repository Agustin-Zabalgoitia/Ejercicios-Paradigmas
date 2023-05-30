package edu.unlam.paradigmas.patrones.ej02;

import static org.junit.Assert.*;

import org.junit.Test;

public class TankTest {

	@Test
	public void CrearTanque() {
		Tank t = new Tank();
		assertNotNull(t);
	}

	@Test
	public void ModoTanque() {
		Tank t = new Tank();
		assertNull(t.getState());
		t.tankMode();
		assertNotNull(t.getState());
	}

	@Test
	public void ModoAsedio() {
		Tank t = new Tank();
		assertNull(t.getState());
		t.siegeMode();
		assertNotNull(t.getState());
	}

	@Test
	public void AtaqueModoTanque() {
		Tank t = new Tank();
		t.tankMode();
		t.attack();
		assertEquals(19, t.ammo);
		assertEquals(10, t.getDamage());
	}

	@Test
	public void AtaqueModoAsedio() {
		Tank t = new Tank();
		t.siegeMode();
		t.attack();
		assertEquals(18, t.ammo);
		assertEquals(22, t.getDamage());
	}

	@Test
	public void MoverModoTanque() {
		Tank t = new Tank();
		t.tankMode();
		t.move();
		assertEquals(47, t.fuel);
		assertEquals(1.5, t.getSpeed(), 0);
	}

	@Test
	public void MoverModoAsedio() {
		Tank t = new Tank();
		t.siegeMode();
		t.move();
		assertEquals(49, t.fuel);
		assertEquals(0.5, t.getSpeed(), 0);
	}
}
