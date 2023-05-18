package main.com.jc.beginner.basics.string_functions;

public class StringFunctions {

    public String convertToLowerCase(String input) {
        return input.toLowerCase();
    }

    public String convertToUpperCase(String input) {
        return input.toUpperCase();
    }

    public int getStringLength(String input) {
        return input.length();
    }

    public char get(int index, String input) {
        return input.charAt(index);
    }

    public String getSubString(int start, int end, String input) {
        return input.substring(start, end);
    }

    public boolean compare(String input1, String input2) {
        return input1.equals(input2);
    }

    public char[] getCharactersAsArray(String input) {
        return input.toCharArray();
    }

    public String[] split(String input, String regex) {
        return input.split(regex);
    }


}
