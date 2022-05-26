
public class Day01 {
    public static void main(String[] args) {
        String input = "11111111011111";
        int arr[] = new int[input.length()];
        int result = 0;

        for(int i=0; i<input.length(); i++){
            arr[i] = input.charAt(i) - '0';

            if(arr[i] == 1) {
                result += 1;
            }
        }

        System.out.println(result);
        

    }
}