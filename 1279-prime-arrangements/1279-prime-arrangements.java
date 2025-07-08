class Solution {
    private static final int MOD = 1_000_000_007;
    public int numPrimeArrangements(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        long result= (factorial(count)*factorial(n-count))%MOD;
        return (int) result;

        
    }
    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public long factorial(int n){
        long res = 1;
        for(int i = 2; i <= n; i++){
            res = (res * i) % MOD;
        }
        return res;
    }
}