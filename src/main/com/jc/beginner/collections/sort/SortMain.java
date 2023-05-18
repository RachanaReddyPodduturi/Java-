package main.com.jc.beginner.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMain {
    public static void main(String[] args) {

        Company c1 = new Company("Google", "1234","300000","California","3");
        Company c5 = new Company("Google", "1234","300000","California","3");
        Company c2 = new Company("Microsoft", "2345","320000","California","2");
        Company c3 = new Company("Apple", "3456","400000","Austin","1");
        Company c4 = new Company("Nvidia", "1345","200000","Atlanta","32");

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c1));
        System.out.println(c1.equals(c5));

        System.out.println(c1.hashCode());

        Company1 c11 = new Company1("Google", "1234",300000,"California","3");
        Company1 c51 = new Company1("Google", "1234",320000,"California","3");
        Company1 c21 = new Company1("Microsoft", "2345",350000,"California","2");
        Company1 c31 = new Company1("Apple", "3456",400000,"Austin","1");
        Company1 c41 = new Company1("Nvidia", "1345",200000,"Atlanta","32");

        List<Company1> company1List = new ArrayList<>();
        company1List.add(c11);
        company1List.add(c51);
        company1List.add(c21);
        company1List.add(c31);
        company1List.add(c41);

        System.out.println(company1List);
        Collections.sort(company1List);
        System.out.println(company1List);

    }
}
