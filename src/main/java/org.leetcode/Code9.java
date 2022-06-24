package src.main.java.org.leetcode;

public class Code9 {
    public static void main(String[] args) {
        System.out.println(123 % 10);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 ) {
            return false;
        }

        int res = 0;
        int n = x;
        while(n > 0){
            res = res * 10 + n % 10;
            n = n / 10;
        }
        return res == x;
    }

}
