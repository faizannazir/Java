public class StringMethod
{
    
    public static void main(String args[])
    {
        String a = "Faizan Nazir";
        // Length of String
        System.out.println("String length function a.length() => " + a.length());
        // Char at index 
        System.out.println("String charAt function a.charAt(int index) => " + a.charAt(0)); 
        // create substring from existing string starting string as parameter
        System.out.println("String Substring function a.substring(int beginindex) => " + a.substring(7));
        //  create substring from existing string start index and endindex as parameter
        System.out.println("String Substring function a.substring(int beginindex, int endIndex) => " + a.substring(7 , 12));
        //  check index of String 
        System.out.println("String indexOf function a.indexOf(String str) => " + a.indexOf("i"));
        // check index of string with additional parameter of starting indedex
        System.out.println("String indexOf function a.indexOf(String str , int fromIndex) => " + a.indexOf("i",7));
        // Replace function replace old char with new char 
        System.out.println("String replace function a.replace(char old, char new) => " + a.replace(' ','-'));
        //  tolowercase convert all characters to lower case
        System.out.println("String toLowerCase function a.toLowerCase() => " + a.toLowerCase());
        //  touppercase convert all characters to upper case
        System.out.println("String toUpperCase function a.toUpperCase() => " + a.toUpperCase());
        //  concat to strings 
        System.out.println("String concat function a.concat(String s) => " + a.concat(" Malik"));
        //  remove whitespaces from start and end of string
        System.out.println("String trim function a.trim() => " + a.trim());
        // Check two strings are equals or not
        System.out.println("String equals function a.equals(String s) => " + a.equals("Faizan Nazir"));

    }
}