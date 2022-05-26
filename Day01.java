
public class Day01 {
    public static void main(String[] args) {
        int n = 00000000000000000000000000110011;
        int ans=0;
            while(n!=0){
                n=n&(n-1);
                ans++;
            }
    System.out.println(ans);

        /*
        String input = "00000000000000000000000000100011";
        int arr[] = new int[input.length()];
        int result = 0;

        for(int i=0; i<input.length(); i++){
            arr[i] = input.charAt(i) - '0';

            if(arr[i] == 1) {
                result += 1;
            }
        }

        System.out.println(result);
        */
    }

}

