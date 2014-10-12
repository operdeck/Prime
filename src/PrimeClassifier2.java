import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class PrimeClassifier2 {
    private Long number;
    private Map<Long, Long> cache;

    {
        cache = new HashMap<Long, Long>();
    }

    public PrimeClassifier2(Long number) {
        this.number = number;
    }

    public boolean isFactor(long i) {
        return number % i == 0;
    }

    public Set<Long> getFactors() {
        Set<Long> factors = new HashSet<Long>();
        factors.add((long) 1);
        factors.add(number);
        for (long i = 2; i < Math.sqrt(number) + 1; i++)
            if (isFactor(i)) {
                factors.add(i);
                factors.add(number / i);
            }
        return factors;
    }

    public Long sumFactors() {
        Long sum = (long) 0;
        if (cache.containsValue(number))
            sum = cache.get(number);
        else
            for (Long i : getFactors())
                sum += i;
        return sum;
    }

    public boolean isPrime() {
        return number == 2 || sumFactors() == number + 1;
    }

}