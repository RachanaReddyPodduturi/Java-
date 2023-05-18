package main.com.jc.beginner.additional.concepts;

public class StringOperations {
    public static void main(String[] args) {

        String course = "Java Course";

        /**
         * Java Course
         * 012345678910
         *
         * J a v a   C o u r s e
         * 0 1 2 3 4 5 6 7 8 9 10
         *
         */

        System.out.println(course.length()); // 11

        System.out.println(course.equals("Java Course")); //true

        System.out.println(course.equalsIgnoreCase("JAVA Course")); //true

        System.out.println(course.toLowerCase()); //java course

        System.out.println(course.toUpperCase()); //JAVA COURSE

        System.out.println(course.charAt(0)); //J

        System.out.println(course.toCharArray());

        System.out.println(course.isBlank());

        System.out.println(course.isEmpty());

        System.out.println(course.contains("Course"));

        /**
         * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
         *
         * (The hash value of the empty string is zero.)
         */
        String a = "a";
        String empty = "";
        System.out.println(empty.hashCode());
        System.out.println();
        System.out.println(course.hashCode());
        System.out.println(a.hashCode()); //a*31 = 97*31^0 =
        System.out.println(97);

        System.out.println();


        System.out.println(course.split(" "));

        System.out.println(course.startsWith("Ja"));

        System.out.println(course.endsWith("rse"));

        System.out.println(course.substring(4));

    }
}

