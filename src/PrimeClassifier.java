
public class PrimeClassifier {
	private long n;
	private boolean isPrime = true;

	public PrimeClassifier(long i) {
		n = i;
		checkFactors();
	}

	private void checkFactors() {
		for (int c=2; isPrime && c<=Math.sqrt(n); c++) {
			if (n%c == 0) {
				isPrime = false;
			}
		}
	}
	public boolean isPrime() {
		return n>=0 && isPrime;
	}

}
