package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < alphabet.size(); i++) {
            number.add(0);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        for (String s1 : list) {
            char[] s = s1.toCharArray();
            for (char c : s) {
                if (alphabet.contains(c)) {
                    number.set(alphabet.indexOf(c), number.get(alphabet.indexOf(c)) + 1);
                }
            }
        }

        for (int i = 0; i < number.size(); i++) {
            System.out.println(alphabet.get(i) + " " + number.get(i));
        }
    }

}
