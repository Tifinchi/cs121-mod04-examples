public class StringsAndLoops {
    public static void main(String[] args)
    {
        /* Print each character of a string on a separate line */
        String input = "A String";
        for (int i = 0; i < input.length(); i++)
        {
            System.out.println(input.charAt(i));
        }

        /* Create a new String composed of every other character from the
         * String objects called name */
        String name = "Arnon";
        String newName = "";

        for (int i = 0; i < name.length(); i+=2)
        {
            newName += name.charAt(i);
        }

        System.out.println("New Name: " + newName);

        /* Write a loop that reverses the String stored in word and stores
         * the result in a String variable named reverse */
        String word = "spoons";
        String reverse = "";

        // Loop starts at the last index and moves to the first
        for (int i = word.length() - 1; i >= 0; i--)
        {
            reverse += word.charAt(i);
        }

        System.out.println("Original: " + word);
        System.out.println("Reversed: " + reverse);
    }
}