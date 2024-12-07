package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Testing {
   Ex1 obj = new Ex1();
    
	@Test
	void test() {
		int res = obj.mul(20, 30);
		assertEquals(600, res);
	}

}
