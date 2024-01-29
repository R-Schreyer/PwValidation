package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        String[] pw = new String[]{
                "A", "s", "x", "d", "8", "g", "W", "g", "w"};
        System.out.println(checkLengthOfPassword(pw));
        System.out.println((isDigitInPassword(pw)));
        System.out.println(isUppercaseAndLowercaseInPassword(pw));
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
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                containsUppercase = true;
            }
            if (Character.isLowerCase(c)) {
                containsLowercase = true;
            }

            return containsLowercase && containsUppercase;

        }
        return false;
    }
}