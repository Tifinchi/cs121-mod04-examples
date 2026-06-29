/**
 * Example to demonstrate Boolean Expressions and
 *   combinational logic
 * 
 * @author CS121 Instructors
 */

public class SmartHome {
    public static void main(String[] args)
    {
        final int MAX_TIME = 60; // minutes
        boolean alertMode = true; 
        boolean lightsOn = true; 
        boolean away = false; 
        int timeOn = 0; //minutes 

        boolean alert = alertMode && ( (lightsOn && away) || (timeOn > MAX_TIME));

        System.out.println("An alert has been triggered: " + alert);
    }
}
