import java.awt.Point;

public class ObjectComparison {
    public static void main(String[] args) 
    {

        Point p1 = new Point(100,200);
        Point p2 = new Point(100,200);
        Point p3 = p1;

        /* There are two ways to compare objects.  The first is to check 
         *   if the contents of the objects are equal. To do this we use
         *   the object's own equals() method. */

        if (p1.equals(p3))  
        {
            System.out.println("The contents of the two objects are equal.");
        } 
        else 
        {
            System.out.println("The contents of the two objects are NOT equal.");
        }

        /* The second way to compare objects is to see if they are aliases
         *   of each other, meaning that two reference variables point to 
         *   the same object in memory. To do this we use the == operator. 
         * 
         * A common mistake is to use the == operator when wanting to compare the
         *   contents of the objects instead of their references. */

         if (p1 == p3) 
         {
             System.out.println("The objects are aliases, referencing the same object in memory");
         } 
         else 
         {
             System.out.println("The objects are NOT aliases");
         }
    }
}
