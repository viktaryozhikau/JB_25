package test;



	
	
	import org.junit.Assert;
	import org.junit.Test;
	public class test_unit {
	@Test
	public void calcYT001() {
	double x = 10;
	double realY;
	double expectedY = 0.00990099;
	realY = test1.calcY(x);
	Assert.assertEquals(expectedY, realY, 0.00000001);
	}
	@Test
	public void calcYT002() {
	double x = 2;
	double realY;
	double expectedY = 9;
	realY = test1.calcY(x);
	Assert.assertEquals(expectedY, realY, 0.0000001);
	}
	}

