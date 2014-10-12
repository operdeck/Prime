import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class TestPrimes {

	@Test
	public void VerifySmallNonPrime() {
		assertTrue(!new PrimeClassifier(4).isPrime());
	}

	@Test
	public void VerifySmallPrime() {
		assertTrue(new PrimeClassifier(3).isPrime());
	}

	@Test
	public void Verify5() {
		assertTrue(new PrimeClassifier(5).isPrime());
	}
	
	@Test
	public void Verify6() {
		assertTrue(!new PrimeClassifier(6).isPrime());
	}
	
	@Test
	public void Verify7() {
		assertTrue(new PrimeClassifier(7).isPrime());
	}
	
	@Test
	public void VerifyNull() { 
		assertTrue(new PrimeClassifier(0).isPrime());
	}

	@Test
	public void VerifyNegative() {
		assertFalse(new PrimeClassifier(-11).isPrime());
	}

	@Test
	public void VerifyBigPrime1() {
		long then = System.currentTimeMillis();
		assertTrue(new PrimeClassifier(99999999977L).isPrime());
		long now = System.currentTimeMillis();
		System.out.println(String.format("Duration (1): %d msec", now-then));
	}

	@Test
	public void VerifyBigPrime2() {
		long then = System.currentTimeMillis();
		assertTrue(new PrimeClassifier2(99999999977L).isPrime());
		long now = System.currentTimeMillis();
		System.out.println(String.format("Duration (2): %d msec", now-then));
	}
}
