import java.util.Scanner;

public class Calculator {

 public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
     
        return a / b;
      
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Java Calculator ====");
            System.out.println("1. Addition");
            System.out.println("2. Subtract");
            System.out.println("3. Multiplication");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Progaram Exit Successfully");
                break;
            }
            if(choice < 1||choice > 5)
            {
                System.out.println("invalid choice. enter a valid choice . . .");
                continue;
            }

            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = 0;

            switch (choice) {
                case 1:
                    result = addition(a, b);
                    break;
                case 2:
                    result = subtract(a, b);
                    break;
                case 3:
                    result = multiply(a, b);
                    break;
                case 4:
                try{
                    result = divide(a, b);
                }
                catch(ArithmeticException e)
                {
                    System.out.println("number cannot"+e.getMessage());
                    continue;
                }
                    break;
            }
            System.out.println("Result = " + result);
        }

       
    }
}
