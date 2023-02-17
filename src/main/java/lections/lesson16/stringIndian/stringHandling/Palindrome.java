package lections.lesson16.stringIndian.stringHandling;

public class Palindrome {
    public void checkStringPalindrome(String inputString) {
        String outputString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            outputString = outputString + inputString.charAt(i);
        }
        if (inputString.equalsIgnoreCase(outputString)) {
            System.out.println("input and output String are same ---> It's Palindrome" + inputString);
        } else {
            System.out.println("input and output String are NOT the same ---> It's are not Palindrome" + inputString);
        }
    }
}