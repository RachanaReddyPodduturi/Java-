package main.com.jc.beginner.collections.sort;

import java.util.Objects;

public class Company {
    private String name;
    private String ein;
    private String noOfEmployees;
    private String location;
    private String rating;

    public Company() {

    }

    public Company(String name, String ein, String noOfEmployees, String location, String rating) {
        this.name = name;
        this.ein = ein;
        this.noOfEmployees = noOfEmployees;
        this.location = location;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public String getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(String noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;

        if(o == null) return false;
        if(this.getClass() != o.getClass()) return false;

        Company company = (Company)o;
        return Objects.equals(name, company.name) &&
                Objects.equals(ein, company.ein) &&
                Objects.equals(noOfEmployees, company.noOfEmployees) &&
                Objects.equals(location, company.location) &&
                Objects.equals(rating, company.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ein, noOfEmployees, location, rating);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", ein='" + ein + '\'' +
                ", noOfEmployees='" + noOfEmployees + '\'' +
                ", location='" + location + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
