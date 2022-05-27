import java.util.Scanner;

public class Day02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        int target = 9;
        
        for(int i=0; i<=nums.length-1; i++) {
            nums[i] = sc.nextInt();
        }

        for(int i=1; i<=nums.length; i++) {
            for(int j=1; j<=nums.length; j++) {
                if((i+j) == target) {
                    System.out.println(i + "+" + j + "=" + (i+j));
                    return;
                }
            }
            
            
        }
        
        
        

    }
}
