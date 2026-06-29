class Solution {
    public int getSum(int a, int b) {
    while (b != 0) {
        int sum = a ^ b;      // XOR gives sum without carry
        int carry = (a & b) << 1; // AND and left shift gives carry
        a = sum;
        b = carry;
    }
    return a;
}

}