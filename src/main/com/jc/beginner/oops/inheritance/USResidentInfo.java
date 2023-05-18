package main.com.jc.beginner.oops.inheritance;

public class USResidentInfo extends ResidentInfo {

    private String ssn;

    private String itin;

    private String i94Number;

    public USResidentInfo() {

    }

    public USResidentInfo(String ssn, String itin, String i94Number) {
        this.ssn = ssn;
        this.itin = itin;
        this.i94Number = i94Number;
    }

    public USResidentInfo(String firstName, String middleName, String lastName, String dateOfBirth, String gender, String countryOfBirth, String passportNumber, String ssn, String itin, String i94Number) {
        super(firstName, middleName, lastName, dateOfBirth, gender, countryOfBirth, passportNumber);
        this.ssn = ssn;
        this.itin = itin;
        this.i94Number = i94Number;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getItin() {
        return itin;
    }

    public void setItin(String itin) {
        this.itin = itin;
    }

    public String getI94Number() {
        return i94Number;
    }

    public void setI94Number(String i94Number) {
        this.i94Number = i94Number;
    }
}
