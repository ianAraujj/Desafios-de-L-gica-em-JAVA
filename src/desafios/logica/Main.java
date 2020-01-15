/**
 *
 * @author IAN LUCCAS ARAÙJO
 */

package desafios.logica;
public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Desafios d = new Desafios();
        
        /*
        Given a string and a non-negative int n, return a larger string that is n copies of the original string
        stringTimes("Hi", 2) → "HiHi"
        stringTimes("Hi", 3) → "HiHiHi"
        stringTimes("Hi", 1) → "Hi"
        */
        //System.out.println(d.stringTimes("SAPO ", 4));
        
        /*
        Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
        frontTimes("Chocolate", 2) → "ChoCho"
        frontTimes("Chocolate", 3) → "ChoChoCho"
        frontTimes("Abc", 3) → "AbcAbcAbc"
        */
        //System.out.println(d.frontTimes("Abc", 3));
        
        /*
        Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
        countXX("abcxx") → 1
        countXX("xxx") → 2
        countXX("xxxx") → 3
        */
        //System.out.println(d.countXX("xxxx"));
        
        /*
        Given a non-empty string like "Code" return a string like "CCoCodCode".
        stringSplosion("Code") → "CCoCodCode"
        stringSplosion("abc") → "aababc"
        stringSplosion("ab") → "aab"
        */
        //System.out.println(d.stringSplosion("ab"));
        
        /*
        Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
        array123([1, 1, 2, 3, 1]) → true
        array123([1, 1, 2, 4, 1]) → false
        array123([1, 1, 2, 1, 2, 3]) → true
        */
        //int[] intArray = new int[]{1, 1, 2, 1, 2, 3};
        // OBS: é dessa forma que se declara um array de inteiros
        //System.out.println(d.array123(intArray));
        
        
        /*
        Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in 
        "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of 
        a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) 
        tests if a char is an alphabetic letter.)
        countYZ("fez day") → 2
        countYZ("day fez") → 2
        countYZ("day fyyyz") → 2
        */
        // OBS: Character.isLetter(char) testa se o caracter é uma letra alfabética
        //System.out.println(d.countYZ("daY fyyyz"));
        
        
        /*
        Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
        countEvens([2, 1, 2, 3, 4]) → 3
        countEvens([2, 2, 0]) → 3
        countEvens([1, 3, 5]) → 0
        */
        //int[] array = new int[]{1, 3, 5};
        //System.out.println(d.countEvens(array));
        
        
        
        /*
        Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is 
        immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same 
        number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
        fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
        fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
        fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
        */
        //int[] array = new int[]{3, 2, 2, 4};
        //int[] res = d.fix34(array);
        //d.mostrarArray(res);
        //System.out.println();
        
    }
    
}
