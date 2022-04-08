package string_problems;

import java.util.Arrays;

public class Anagram {

    /*
    Write a Java Program, `isAnagram`, to check if any two strings are anagrams

    An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
    original letters exactly once.

        Ex: "CAT" & "ACT",
            "ARMY" & "MARY",
            "FART" & "RAFT"
    */

    //Implement Here

    static boolean isAnagram(char[] string1, char[] string2){
        int name1 = string1.length;
        int name2 = string2.length;

    if (name1 != name2)
        return false;

        Arrays.sort(string1);
        Arrays.sort(string2);

    for (int i=0; i<name1; i++)
        if (string1[i] != string2[i])
            return false;

     return true;
    }

    public static void main(String[] args) {
        char string1[]= {'r', 'a', 'f','t'};
        char string2[]= {'f','a','r','t'};

        if (isAnagram(string1,string2))
            System.out.println("These words are anagrams");
        else
            System.out.println("These words are not anagrams");

    }
}
