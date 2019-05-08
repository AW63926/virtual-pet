import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

import com.adam.virtualpet.VirtualPet;

public class VirtualPetTest {
	VirtualPet underTest = new VirtualPet("Igor", "Red", 23, 36);
	Scanner input = new Scanner(System.in);
	
	@Test
	public void nameTest() {
		assertEquals("Igor", underTest.getDragonName());
	}
	
	@Test
	public void colorTest() {
		assertEquals("Red", underTest.getColor());
	}
	public void heightTest() {
		assertEquals(23, underTest.getHeight());
	}
	public void lengthTest() {
		assertEquals(36, underTest.getLenght());
	}
	
//	@Test
//	public void isThereFire() {
//		boolean fire = true;
//		assertEquals(fire, underTest.breatheFire());
//	}
	
//	@Test
//	public void isEatingtest() {
//		boolean eating = true;
//		//Assertion
//		assertEquals(eating, underTest.eat());
//	}
	
//	@Test
//	public void isFlyingTest() {
//		//When this method is called the dragon should fly
//		boolean flying = true;
//		assertEquals(flying, underTest.fly());
//	}
	
	
//	@Test
//	public void isSleepingTest() {
//		boolean sleeping = true;
//		assertEquals(sleeping, underTest.sleep());
//	}
	
//	@Test
//	public void tickTesting() {
//		int tickCount = 2;
//		int tickTest = underTest.tick(2);
//		//underTest.tick();
//		assertEquals(tickCount, tickTest);	
//	}
	
	@Test
	public void treasureHuntTest() {
		//boolean treasure = true;
		//boolean noTreasure = false;
		//assertEquals(noTreasure, underTest.treasureHunt());
		//assertEquals(treasure, underTest.treasureHunt());
		//System.out.println("Did your dragon find treasure? " + underTest.treasureHunt());
		
	}
	@Test
	public void gamePLayTest() {
//		underTest.treasureHunt();
//		underTest.breatheFire();
//		underTest.fly();
//		underTest.eat();
//		underTest.sleep();
		underTest.gamePLay();
		//underTest.dragonArtOne();
		//underTest.dragonArtTwo();
		
	}


	

}
