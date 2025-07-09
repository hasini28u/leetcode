class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1; 

        String binary_n = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(binary_n);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') {
                sb.setCharAt(i, '1');
            } else {
                sb.setCharAt(i, '0');
            }
        }

        return Integer.parseInt(sb.toString(), 2);
    }
}
