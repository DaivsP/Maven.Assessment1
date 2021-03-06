package com.zipcodewilmington.assessment1.part1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String answer = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
        return answer;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder answer = new StringBuilder(str);
        return answer.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder answer = new StringBuilder(str);
        answer.reverse().toString();
        return answer.substring(0,1).toUpperCase() + answer.substring(1).toLowerCase();
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String answer = str.substring(1, str.length() - 1);
        return answer;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
            char[] chars = str.toCharArray();
            new ArrayList<String>();
            for (int i = 0; i < chars.length; i++)
            {
                char c = chars[i];
                if (Character.isUpperCase(c))
                {
                    chars[i] = Character.toLowerCase(c);
                }
                else //if (Character.isLowerCase(c))
                {
                    chars[i] = Character.toUpperCase(c);
                }
            }
            return new String(chars);
    }
}