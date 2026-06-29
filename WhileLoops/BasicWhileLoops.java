import java.util.Scanner;

public class BasicWhileLoops {
    public static void main(String[] args)
    {
        /* Basic example of a while loop, counting down */
        int numCookies = 6;  // starting condition
        // Updated to use >= 1 to experiment with off-by-one errors 
        while (numCookies >= 1)  // looping condition
        {
            System.out.println("Here's a cookie! Count: " + numCookies); 
            numCookies = numCookies - 1; //loop counter
        }
        System.out.println("Cookies remaining:" + numCookies);

        /* Basic example of a while loop, counting up */
        int count = 1; //starting condition
        while (count <= 5) //looping condition
        {
            System.out.println(count);
            count++;
        }
        System.out.println("The final value of count is: " + count);

        /* Basic example of while loop with Strings and sentinel value */
        Scanner kbd = new Scanner(System.in);
        String input = "";  //Starting condition
        // Updated to check only the first character [cite: 138, 142]
        while (!(input.length() > 0 && input.charAt(0) == 'q')) //looping condition
        {
            System.out.print("Enter something (starts with q to quit): ");
            input = kbd.nextLine().toLowerCase(); //loop iterator
        }
        System.out.println("The final value of input is: " + input);
        kbd.close();

        /* Knowledge Check */
        int counter = 0;
        while (counter <= 10) 
        {
            if(counter % 2 == 0)
            {
                System.out.println(counter);
            }
            counter++;
        }
    }
}