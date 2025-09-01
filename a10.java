public class a10 {
    public static void main(String[] args) {
        // Check if any arguments are provided
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }

        System.out.println("Arguments in reverse order:");
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}

