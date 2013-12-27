package org.svenehrke.javaplaylib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

	@Test
	public void testGreet() throws Exception {
		assertEquals("hello Sven", new Greeter().greet("Sven"));
	}

}
