public class FloatingPointComparison {
    
    public static void main(String[] args) {

        
        double a = 1.0;
        double b = 0.9;
        double c = 0.1;

        /* We don't always get what we expect when working with 
         *   floating point values */
        if ( a - b == c ) {
            System.out.println("Life is good! " + a + " - " + b + " = " + c);
        } else {
            System.out.println("My world is shaken! " + a + " - " + b + " != " + c);
            System.out.println("The result of " + a + " - " + b +" is " + (a-b));
        }

        /* Instead it is best to avoid direct tests for equality and
         *   check to see if the numbers are "close enough." */
        final double TOLERANCE = 0.00000000000000001;
        if ( Math.abs(c - (a-b)) < TOLERANCE ) {
            System.out.println("Life is good! " + a + " - " + b + " is close enough to " + c);
        }
    }

}
