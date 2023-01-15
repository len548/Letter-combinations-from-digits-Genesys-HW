package main;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String digits = "44";
        ArrayList<String> result = allLetterCombinations(digits);
        System.out.println("Digits: " + digits);
        System.out.println(result);
        System.out.println(result.size());
        digits = "859";
        System.out.println("Digits: " + digits);
        System.out.println(allLetterCombinations(digits));
        digits = "7496";
        System.out.println("Digits: " + digits);
        System.out.println(allLetterCombinations(digits));
    }
    // main function 
    public static ArrayList<String> allLetterCombinations(String digits) {
        if(digits.length() < 0 || digits.length() > 4) throw new IllegalArgumentException("The number of digits must be between 0 and 4!"); // check the number of the digits
        ArrayList<String> result = new ArrayList<>();
        if(digits.length() == 0) return result;
        ArrayList<String> letters = new ArrayList<>(Arrays.asList("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"));
        result.add("");
        for(int i = 0; i < digits.length(); i++){
            if((int)digits.charAt(i) < 50 || (int)digits.charAt(i) > 57) throw new IllegalArgumentException("All digits must be from 2 to 9!"); // check if each digit is valid
            result = merge(result, letters.get(digits.charAt(i) - '0'));
        }
        return result;
    }

    // helper functiction to merge the given array list with each possible next letter and return the array list
    private static ArrayList<String> merge(ArrayList<String> list, String letters){
        ArrayList<String> newResult = new ArrayList<>();
        for(String s : list){
            for(int i = 0; i < letters.length(); i++){
                newResult.add(s+letters.charAt(i));
            }
        }
        return newResult;
    }
}
