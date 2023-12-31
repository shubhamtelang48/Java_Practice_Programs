package JavaPrograms;

import java.io.*;
import java.util.*;

public class Anagram {

    static boolean isAnagram(String a, String b)
    {
        boolean anagram = true;
        Character[] charSet =   {'A','B','C','D','E',
                'F','G','H','I','J',
                'K','L','M','N','O',
                'P','Q','R','S','T',
                'U','V','W','X','Y','Z'};
        HashMap<Character,Integer> ALetterFrequency = new HashMap<Character,Integer>();
        HashMap<Character,Integer> BLetterFrequency = new HashMap<Character,Integer>();
        intializeHash(ALetterFrequency, charSet);       //O(n)
        intializeHash(BLetterFrequency, charSet);       //O(n)
        a = a.toUpperCase(); //O(n)
        b = b.toUpperCase(); //O(n)

        //Originally I took a different approach to this problem because I was using substring and it
        // runs in O(n) which would make my algorithm run in O(n^2) with constant space, but then I
        // remembered that charAt() runs in constant time so utilizing that function I was able to
        // have a time complexity of O(n) and space complexity of O(1)

        for(int i = 0;i <a.length();i++)  //O(n)
        {
            Character letter = a.charAt(i);   //O(1)
            Integer frequency = ALetterFrequency.get(letter);
            ALetterFrequency.put(letter,++frequency);
        }
        for(int i = 0;i <b.length();i++)  //O(n)
        {
            Character letter = b.charAt(i);   //O(1)
            Integer frequency = BLetterFrequency.get(letter);
            BLetterFrequency.put(letter,++frequency);
        }


        //Compare Hash
        for(Character letter : charSet)
        {
            if(!ALetterFrequency.get(letter).equals(BLetterFrequency.get(letter)))
            {
                anagram = false;
            }
        }

        return anagram;
    }
    static void intializeHash(HashMap hash, Character[] set)
    {
        for(Character letter : set)
        {
            hash.put(letter,0);
        }

    }
    static Character[] toCharacterArray(char[] cArray)
    {
        Character[] CArray = new Character[cArray.length];
        for(int i =0; i<cArray.length;i++)
        {
            CArray[i] = (Character) cArray[i];
        }
        return CArray;
    }

    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        String a = "anagramg";
        String b = "margana";
        //scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println(ret);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
