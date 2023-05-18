package main.com.jc.beginner.oops.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {

        ResidentInfo residentInfo = new ResidentInfo();
        System.out.println(residentInfo.getFirstName()); //null

        IndianResidentInfo indianResidentInfo = new IndianResidentInfo();
        System.out.println(indianResidentInfo.getFirstName()); // null
        System.out.println(indianResidentInfo.getPassportNumber()); // null

        IndianResidentInfo indianResidentInfo1 = new IndianResidentInfo("aadhar", "pan", "passport");

        System.out.println(indianResidentInfo1.getFirstName()); // null
        System.out.println(indianResidentInfo1.getPassportNumber()); //passport
        System.out.println(indianResidentInfo1.getGender()); // null
        System.out.println(indianResidentInfo1.getAadharNumber()); // aadhar
        System.out.println(indianResidentInfo1.getPanCardNumber()); // pan

        IndianResidentInfo indianResidentInfo2 = new IndianResidentInfo("first", "middle", "last", "dob", "gender", "country", "passport", "aadhar", "pan");
        System.out.println(indianResidentInfo2.getFirstName()); //first
        System.out.println(indianResidentInfo2.getMiddleName()); //middle
        System.out.println(indianResidentInfo2.getLastName()); //last
        System.out.println(indianResidentInfo2.getPanCardNumber()); //pan

        ResidentInfo residentInfo1 = new IndianResidentInfo();
        ((IndianResidentInfo)residentInfo1).getAadharNumber();


    }
}
