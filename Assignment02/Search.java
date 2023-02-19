// Q.3: The replace() method searches a string for a specified character, and returns 
// a new string where the specified character(s) are replaced. The synntax of the 
// replace method is as under 
// Syntax
// public String replace(char searchChar, char newChar)
// Now make a java program and use the replace function. Take a string “ Waheed”
// and replace the characters “W and D” with “N”

public class Search
{
    String word;
    
    public Search( String word)
    {
        this.word= word.toUpperCase();
    }
    public String replace(char searchChar, char newChar)
    {
        word = word.replace(searchChar,newChar);
        System.out.println(searchChar + " is replaced with " + newChar);
        System.out.print("New String is: ");
        return word;
    }

    public static void main(String args[])
    {
        Search s = new Search("Waheed");
        System.out.println(s.replace('W','N'));
        System.out.println(s.replace('D','N'));
    }
}
