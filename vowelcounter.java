import java.util.Scanner;
public class vowelcounter 
{public static void main(String[]args)
    {
        Scanner count = new Scanner(System.in);
        int vowcount=0; 
        System.out.println("Enter a string, no spaces! : ");
        String input = count.next();
        input = input.toLowerCase();

        for(int i=0; i<input.length(); i++)
        {
            if
            (input.charAt(i)=='a'||
            input.charAt(i)=='e'||
            input.charAt(i)=='i'||
            input.charAt(i)=='o'||
            input.charAt(i)=='u')
            {
                vowcount++;
            }
        }
    
        count.close();
        System.out.println("The vowel count of the given string is = " + vowcount);
      

    }
    
}
