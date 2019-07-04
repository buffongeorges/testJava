package testJenkinspck;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class testJenkins {
	
	@Test
	public void testFirstFilling() {
		jenkins sut = new jenkins();
		assertEquals(1, sut.isFull(4, 0));
	}
}
