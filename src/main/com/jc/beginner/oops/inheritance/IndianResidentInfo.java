package main.com.jc.beginner.oops.inheritance;

public class IndianResidentInfo extends ResidentInfo {

    private String aadharNumber;

    private String panCardNumber;

    public IndianResidentInfo() {

    }

    public IndianResidentInfo(String aadharNumber, String panCardNumber, String passportNumber) {
        this.aadharNumber = aadharNumber;
        this.panCardNumber = panCardNumber;
    }

    public IndianResidentInfo(String firstName, String middleName, String lastName, String dateOfBirth, String gender, String countryOfBirth, String passportNumber, String aadharNumber, String panCardNumber) {
        super(firstName, middleName, lastName, dateOfBirth, gender, countryOfBirth, passportNumber);
        this.aadharNumber = aadharNumber;
        this.panCardNumber = panCardNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getPanCardNumber() {
        return panCardNumber;
    }

    public void setPanCardNumber(String panCardNumber) {
        this.panCardNumber = panCardNumber;
    }
}
