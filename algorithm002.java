import java.util.Scanner;

public class algorithm002 {

    static void triangleA(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=i; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleB(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleC(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for(int k=n; k>=i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleD(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=n; j>=i; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void spira(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=n; j>=i; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        //triangleA(star);
        //triangleB(star);
        //triangleC(star);
        //triangleD(star);
        spira(star);

        /*
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        for(int i=1; i<=star; i++) {
            for(int j=1; j<=star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*
        System.out.println("    | 1  2  3  4  5  6  7  8  9  ");
        System.out.println("----+--------------------------------------------");

        for(int i=1; i<=9; i++) {
            System.out.print("  " + i + " | ");
            for(int j=1; j<=9; j++) {
                System.out.print(i * j + "  ");
            }
            System.out.println();
        }
        */

        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int no = 0;
        while(a > 0) {
            a /= 10;
            no++;
        }

        System.out.println(no);
        */

        /*
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        a = sc.nextInt();
        System.out.println("a : " + a);

        do {
            
            b = sc.nextInt();
            System.out.println("b : " + b);
            if(a >= b) {
                System.out.println("a보다 큰 값을 입력하세요.");
            }
        } while(a > b);
        
        System.out.println("b - a : " + (b-a));
        */
    }
    
}
