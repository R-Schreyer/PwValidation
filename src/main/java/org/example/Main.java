package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public static boolean checkLengthOfPassword(String pw) {
        return pw.length() > 7;

    }
    public static boolean isDigitInPassword(String pw) {
        boolean digitInPassword = false;
        char[] chars = pw.toCharArray();
        for (char c : chars) {
            digitInPassword = switch (c) {
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> true;
                default -> digitInPassword;
            };
        /*if (Integer.parseInt(CharofPW) * 0 ==0){
            digitInPassword = true;*/
        }
        return digitInPassword;
    }


    public static boolean isUppercaseAndLowercaseInPassword(String pw) {
    char[] chars = pw.toCharArray();
        boolean containsUppercase = false;
        boolean containsLowercase = false;
        boolean containsUppercaseAndLowercase = false;
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                containsUppercase = true;
            }
            if (Character.isLowerCase(c)) {
                containsLowercase = true;
            }
            if (containsLowercase && containsUppercase){
                containsUppercaseAndLowercase = true;
            }
        }
        return containsUppercaseAndLowercase;
    }
}