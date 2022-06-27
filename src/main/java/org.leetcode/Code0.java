package src.main.java.org.leetcode;

public class Code0 {
    public static void main(String[] args) {
        print0(30);
        print1(30L);
    }

    private static void print0(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    private static void print1(long num) {
        for (int i = 63; i >= 0; i--) {
            System.out.print((num & (1L << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

}
