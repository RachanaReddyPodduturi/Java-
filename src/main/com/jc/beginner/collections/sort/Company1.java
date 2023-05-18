package main.com.jc.beginner.collections.sort;

import java.util.Objects;

public class Company1 implements Comparable<Company1> {
    private String name;
    private String ein;
    private Integer noOfEmployees;
    private String location;
    private String rating;

    public Company1() {

    }

    public Company1(String name, String ein, Integer noOfEmployees, String location, String rating) {
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

    public Integer getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(Integer noOfEmployees) {
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

        Company1 company = (Company1)o;
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

    public int compareTo(Company1 company1) {
      if(this.noOfEmployees > company1.noOfEmployees) return 1;
      if(this.noOfEmployees < company1.noOfEmployees) return -1;
      else return 0;
    }
}
