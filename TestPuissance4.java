package fr.uha.td1.puissance4;

import static org.junit.Assert.*;
import static fr.uha.td1.puissance4.Color.*;
import org.junit.Test;

public class TestPuissance4 {

	@Test
	public void testFirstFilling() {
		Puissance4 sut = new Puissance4();
		sut.insert(Color.red, 4);
		assertEquals(red, sut.isFull(4, 0));
	}
	
	@Test
	public void testSecondFilling() {
		Puissance4 sut = new Puissance4();
		sut.insert(Color.red, 4);
		sut.insert(Color.yellow, 4);	
		assertEquals(red, sut.isFull(4, 0));
		assertEquals(yellow, sut.isFull(4, 1));
		
	}
	
	@Test
	public void testColumnFull() {
		Puissance4 sut = new Puissance4();
		sut.insert(Color.red, 4);
		sut.insert(Color.yellow, 4);
		sut.insert(Color.red, 4);
		sut.insert(Color.yellow, 4);
		sut.insert(Color.red, 4);
		sut.insert(Color.yellow, 4);
		assertEquals(yellow, sut.isFull(4, 5));
	}
	
	@Test(expected=IllegalStateException.class)
	public void testColumnOverflow() {
		Puissance4 sut = new Puissance4();
		sut.insert(Color.red, 4);
		sut.insert(Color.yellow, 4);
		sut.insert(Color.red, 4);
		sut.insert(Color.yellow, 4);
		sut.insert(Color.red, 4);
		sut.insert(Color.yellow, 4);
		sut.insert(red, 4);
		
	}
	@Test(expected=IllegalStateException.class)
	public void testTurn() {
		Puissance4 sut = new Puissance4();
		sut.insert(Color.red, 4);
		sut.insert(Color.red, 4);
	}
	
	@Test
	public void testOtherColumn() {
		Puissance4 sut = new Puissance4();
		sut.insert(Color.red, 3);
		sut.insert(Color.yellow, 4);
		assertEquals(red,sut.isFull(3, 0));
		assertEquals(yellow,sut.isFull(4, 0));
		assertEquals(null,sut.isFull(3, 1));
		assertNull(sut.isFull(4, 1));
		// mercurial-scm.org pour les binaires et help market place-mercurial
	}
	@Test
	public void testRedWin()
	{
		Puissance4 sut = new Puissance4();
		sut.insert(Color.red, 4);
		sut.insert(Color.yellow, 3);
		sut.insert(Color.red, 4);
		sut.insert(Color.yellow, 3);
		sut.insert(Color.red, 4);
		sut.insert(Color.yellow, 3);
		sut.insert(Color.red, 4);
	}
	
	
	
	

}
