class Solution {
    public int arrangeCoins(int n) {
        // int i=0;
        // int sum=0;
        // while(i<=n){
        //     sum += i;
        //     if(n<sum){
        //         break;
        //     }
        //     i++;
        // }
        // return i-1;
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);


    }
}