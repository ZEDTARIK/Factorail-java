import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Write the NUMBER:  " );
         Scanner scanner = new Scanner(System.in);

            try {
                int n = scanner.nextInt();
                if(n > 0) {
                    int fat = 1;
                    for (int i = 1; i<= n; i++){
                        fat = fat * i;
                    }
                    System.out.println("Factorial the " + n + " is = " + fat);
                } else {
                    System.out.println("fill the number value!");
                }
            } catch (Exception e) {
                System.out.println("please, fill the input number !");
            } finally {
                scanner.close();
            }

        }


}
