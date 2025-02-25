public class Fibonacci {
    public static void main(String[] args) {
        
        int num = Integer.parseInt(args[0]);
        
        int arr[] = new int[num + 1];

        // intial Values
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i<arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
