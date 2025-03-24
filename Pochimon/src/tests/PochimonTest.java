package tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import src.Pochimon;
import src.Trainer;

class PochimonTest {

	@Test
	void testCaptureRate() {
	    Trainer trainer = new Trainer("T001", "Ash", 10, 0, 100);
	    Pochimon pochimon = new Pochimon(1, "Pochi", 5, 0, 100);

	    double rate = pochimon.getCaptureRate(trainer);

	    assertTrue(rate >= 1 && rate <= 99, "La taxa ha d'estar entre 1 i 99");
	}
	@Test
	void testTryToCatchResult() {
	    Trainer trainer = new Trainer("T002", "Brock", 10, 0, 100);
	    Pochimon pochimon = new Pochimon(2, "Catchmon", 5, 0, 100);

	    Boolean result = pochimon.tryToCatch(trainer);
	    assertNotNull(result);
	}
	@Test//si pot evolucionar
	void testEvolve() {
	    Pochimon pochimon = new Pochimon(3, "Evo", 10, 0, 100);
	    pochimon.setSpecies("PochimonBasic");

	    pochimon.evolve(pochimon);

	    assertEquals("PochimonEvolved", pochimon.getSpecies());
	}
	@Test	//si no pot evolucionar
	void testEvolvefalse() {
	    Pochimon pochimon = new Pochimon(4, "NoEvo", 10, 0, 100);
	    pochimon.setSpecies("OtherSpecies");

	    pochimon.evolve(pochimon);

	    assertEquals("OtherSpecies", pochimon.getSpecies());
	}

	@Test
	void testHeal() {
	    Pochimon pochimon = new Pochimon(5, "Healer", 5, 0, 100);
	    pochimon.setHp(50);
	    pochimon.setHpMax(100);

	    pochimon.heal(30);

	    assertEquals(80, pochimon.getHp());
	}
	@Test
	void testHealnegatiu() {
	    Pochimon pochimon = new Pochimon(6, "HealerNeg", 5, 0, 100);
	    pochimon.setHp(50);
	    pochimon.setHpMax(100);

	    pochimon.heal(-10);

	    assertEquals(50, pochimon.getHp());
	}
	@Test
	void testHealvidaplena() {
	    Pochimon pochimon = new Pochimon(7, "HealerFull", 5, 0, 100);
	    pochimon.setHp(100);
	    pochimon.setHpMax(100);

	    pochimon.heal(50);

	    assertEquals(100, pochimon.getHp());
	}
	@Test
	void testTakeDamage() {
	    Pochimon pochimon = new Pochimon(8, "Tank", 5, 0, 100);
	    pochimon.setHp(80);

	    pochimon.takeDamage(30);

	    assertEquals(50, pochimon.getHp());
	}
	@Test
	void testTakeDamageMajorA0() {
	    Pochimon pochimon = new Pochimon(9, "Squishy", 5, 0, 100);
	    pochimon.setHp(20);

	    pochimon.takeDamage(50);

	    assertEquals(0, pochimon.getHp());
	}
	@Test
	void testTakeNegatiu() {
	    Pochimon pochimon = new Pochimon(10, "Undamaged", 5, 0, 100);
	    pochimon.setHp(60);

	    pochimon.takeDamage(-10);

	    assertEquals(60, pochimon.getHp());
	}





	


}
