package main.com.jc.beginner.basics.string_functions;

public class StringFunctionsMain {
    public static void main(String[] args) {

        StringFunctions stringFunctions = new StringFunctions();

        System.out.println(stringFunctions.convertToLowerCase("Java")); //java
        System.out.println(stringFunctions.convertToUpperCase("Java")); //JAVA
        System.out.println(stringFunctions.getStringLength("Java")); // 4
        System.out.println(stringFunctions.get(2, "Java")); //v


        System.out.println(stringFunctions.getSubString(1, 2,"Java"));
        System.out.println(stringFunctions.compare("JAVA","java")); // false
        System.out.println(stringFunctions.compare("java","java")); // true

        System.out.println(stringFunctions.getCharactersAsArray("Java")); //'j','a','v','a'
        System.out.println(stringFunctions.split("Adv Java", " "));  // "Adv", "Java"

        // todays class is conditional and loops --> " " -> 6
        //Java/Spring/DBMS --> input.split("/"); --> "Java", "Spring", "DBMS"
    }
}
