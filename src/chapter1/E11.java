/**

 Write a program that reads a line of text and prints all characters that are not ASCII, together
 with their Unicode values.

 *
 */

package chapter1;

import java.util.Scanner;

public class E11 {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        int length = line.length();
        int value;

        //printing  the unicode character and its value
        for(int i =0; i<length; i++)
        {
            value = (int)line.charAt(i);

            if(value > 127)
            {
                System.out.println("unicode character is " + line.charAt(i) + " value is " + value);
            }

        }

    }
}