class Solution {
    public static double myPow(double x, int n) {
        if(n==1){
            return x;
        }
        double temp;
        if (n % 2 == 0) {
            temp = myPow(x, n / 2);
            return temp * temp;
        } else {
            temp = myPow(x, n / 2);
            return temp * temp * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(12, 3));
    }
}