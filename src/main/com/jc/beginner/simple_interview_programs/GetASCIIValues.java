package main.com.jc.beginner.simple_interview_programs;

public class GetASCIIValues {

    public static void main(String[] args) {

        System.out.println('A'+0);  // 65
        System.out.println('Z'+0);  // 90

        System.out.println('a'+0);  // 97
        System.out.println('z'+0);  // 122

        System.out.println('a' - 'A'); // 32

        System.out.println( (char) ('b' - 32));

        String name = "aDvAnCeD";

         char[] chars = name.toCharArray();
        for(int i=0 ; i < chars.length; i++) {

            if( chars[i] >= 'A' && chars[i] <='Z') {
                System.out.print( (char)(chars[i]+32));
            } else {
                System.out.print((char) (chars[i] - 32));
            }
        }



    }
}
