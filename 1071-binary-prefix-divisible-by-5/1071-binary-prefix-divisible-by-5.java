import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        BigInteger val = BigInteger.ZERO;
        BigInteger TWO = BigInteger.valueOf(2);
        BigInteger FIVE = BigInteger.valueOf(5);

        for (int bit : nums) {
            val = val.multiply(TWO).add(BigInteger.valueOf(bit));
            result.add(val.mod(FIVE).equals(BigInteger.ZERO));
        }
        return result;
    }
}
