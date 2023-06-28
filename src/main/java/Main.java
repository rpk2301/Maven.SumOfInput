import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        int number = getInputNumber();


        int sum2 = sumOfNumbers(number);
       // int sum = gaussianSumOfNumbers(number);
       // System.out.println("The sum of numbers using the gaussian method: " + sum);
        System.out.println("The sum of numbers using the written method: " + sum2);


    }

    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    public static int sumOfNumbers(int n) {
        int roll = 0;
        for (int i = 1; i <= n; i++) {
            roll = roll + i;
        }
        int time = (int) System.currentTimeMillis();
        System.out.println("The current time using the written method is: " + time);
        return roll;
    }


    public static int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }


    // for Extra Credit
    public static int gaussianSumOfNumbers(int n) {
        int sum = 0;
        int pairs = n / 2;

        {
            for (int i = 1; i <= pairs; i++) {
                sum += (n + 1);
            }
            int time = (int) System.currentTimeMillis();
            System.out.print("System time using the gaussian method: " + time);


            return sum;
        }


    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.




    //sum of numbers was faster than gaussian by several milliseconds





}
