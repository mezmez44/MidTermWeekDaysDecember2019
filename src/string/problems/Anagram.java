package string.problems;

import java.util.Arrays;
import java.util.Scanner;


public class Anagram {
    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] array1 = (str1.toCharArray());
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String str1;
        String str2;
        Scanner sc = new Scanner(System.in);


        System.out.println("enter the first string ");
        str1 = sc.next();
        System.out.println("enter the second string ");
        str2 = sc.next();

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " " + "and " + " " + str2 + " " + "are Anagram");
        } else
            System.out.println(str1 + " " + "and " + " " + str2 + " " + "are  not Anagram");

        sc.close();
    }


}
