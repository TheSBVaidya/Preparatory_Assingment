public class MaxNumber {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java MaxNumber num1 num2 num3 ...");
            return;
        }

        int max = Integer.parseInt(args[0]); // Initialize max with the first number

        for (int i = 1; i < args.length; i++) {
            int num = Integer.parseInt(args[i]); // Convert argument to integer
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum number: " + max);
    }
}
