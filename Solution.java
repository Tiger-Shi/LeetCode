class Solution {
    public double myPow(double x, int n) {
        if (n%2==0) {
            return myPow(x, n/2)*myPow(x, n/2);
        }
    }
}