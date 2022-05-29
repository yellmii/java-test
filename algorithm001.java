import java.util.Scanner;

public class algorithm001 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        if(d > max) {
            max = d;
        }

        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if(b < min) {
            min = b;
        }
        if(c < min) {
            min = c;
        }

        return min;
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;
        if(b < min) {
            min = b;
        }
        if(c < min) {
            min = c;
        }
        if(d < min) {
            min = d;
        }

        return min;
    }

    static int med3(int a, int b, int c) {
        
        if(a >= b) {
            if(b >= c) {
                return b;
            } else if(a <= c) {
                return a;
            } else {
                return c;
            }
        } else if(a > c) {
            return a;
        } else if(b > c) {
            return c;
        } else {
            return b;
        }

    }

    public static void main(String[] args) {
        System.out.println(max4(1,2,3,4));
        System.out.println(min3(1,2,3));
        System.out.println(min4(5,6,7,8));
        System.out.println(med3(1,2,3));
    }
    
}
