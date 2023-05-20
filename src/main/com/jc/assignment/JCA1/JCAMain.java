package main.com.jc.assignment.JCA1;

import org.junit.platform.commons.function.Try;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JCAMain {
    public static void main(String[] args
    ) throws Exception {
        try {
            List<Company> arraylist = read_companies_file();

            System.out.println("4. Companies that starts with A");
            companiesStartWithA(arraylist);
            System.out.println(" ");
          
            System.out.println("5. Get every companies where no of employees greater than 200000");
            companiesGreaterThan200000(arraylist);
            System.out.println(" ");

            System.out.println("6. Get all companies in zip code: 50020");
            companiesWithZip50020(arraylist);
            System.out.println(" ");

            System.out.println("7. Print all companies in the below format. [companyName, ein, ticker]");
            companiesNameEinTicker(arraylist);
            System.out.println(" ");

            System.out.println("8. Print address of all companies in below format.[companyName, address1, address2, address3, state, city, zip]");
            companiesAddress(arraylist);
            System.out.println(" ");

            System.out.println("9. Calculate total no of employees working in all companies");
            companiesTotalNoOfEmployees(arraylist);
            System.out.println(" ");

            System.out.println("10. Find the company with highest and lowest no of employees.");
            companiesWithHighAndLowEmployees(arraylist);

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
    public static List<Company> read_companies_file() throws Exception {

            List<Company> arraylist = new ArrayList<>();
            System.out.println("This is checked exception");
            File file = new File("/Users/rachanareddy/IdeaProjects/Java-/src/main/resources/companies.txt");
            FileReader fi = new FileReader(file);
            BufferedReader br = new BufferedReader(fi);
            String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    String[] columns = line.split(",");
                    if (columns.length == 10) {
                        String name = columns[0];
                        String ein = columns[1];
                        int noOfEmployees = Integer.parseInt(columns[2].trim());
                        String address1 = columns[3];
                        String address2 = columns[4];
                        String address3 = columns[5];
                        String city = columns[6];
                        String state = columns[7];
                        int zip = Integer.parseInt(columns[8].trim());
                        String ticker = columns[9];

                        Company company = new Company(name, ein, noOfEmployees, address1, address2, address3, city, state, zip, ticker);
                        arraylist.add(company);
                    }
                }
            return arraylist;
    }
    public static void companiesStartWithA(List<Company> arraylist) throws Exception {
        Iterator<Company> itr = arraylist.iterator();
        while (itr.hasNext()) {
            Company c = itr.next();
            if (c.getName().startsWith("A")) {
                System.out.println(c.getName());
            }
        }
    }
    public static void companiesGreaterThan200000(List<Company> arraylist) throws Exception {
        Iterator<Company> itr = arraylist.iterator();
        while (itr.hasNext()) {
            Company c = itr.next();
            if (c.getNoOfEmployees() > 200000) {
                System.out.println(c.getName());
            }
        }
    }
    public static void companiesWithZip50020(List<Company> arraylist) throws Exception {
        Iterator<Company> itr = arraylist.iterator();
        while (itr.hasNext()) {
            Company c = itr.next();
            if (c.getZip() == 50020) {
                System.out.println(c.getName());
            }
        }
    }
    public static void companiesNameEinTicker(List<Company> arraylist) throws Exception {
        Iterator<Company> itr = arraylist.iterator();
        while (itr.hasNext()) {
            Company c = itr.next();
            System.out.println("[" + c.getName() + "," + c.getEin() + "," + c.getTicker() + "]");
        }
    }
    public static void companiesAddress(List<Company> arraylist) throws Exception {
        Iterator<Company> itr = arraylist.iterator();
        while (itr.hasNext()) {
            Company c = itr.next();
            System.out.println("[" + c.getName() + "," + c.getAddress1() + "," + c.getAddress2() + "," + c.getAddress3() + "," + c.getState() + "," + c.getCity() + "," + c.getZip() + "]");
        }
    }
    public static void companiesTotalNoOfEmployees(List<Company> arraylist) throws Exception {
        int count = 0;
        Iterator<Company> itr = arraylist.iterator();
        while (itr.hasNext()) {
            Company c = itr.next();
            count = count + c.getNoOfEmployees();
        }
        System.out.println(count);
    }
    public static void companiesWithHighAndLowEmployees(List<Company> arraylist) throws Exception {
        int maxEmployees = 0;
        int minEmployees = Integer.MAX_VALUE;
        String companyWithMaxEmployees = null;
        String companyWithMinEmployees = null;
        Iterator<Company> itr = arraylist.iterator();
        while (itr.hasNext()) {
            Company c = itr.next();
            if (c.getNoOfEmployees() > maxEmployees) {
                maxEmployees = c.getNoOfEmployees();
                companyWithMaxEmployees = c.getName();
            }
            if (c.getNoOfEmployees() < minEmployees) {
                minEmployees = c.getNoOfEmployees();
                companyWithMinEmployees = c.getName();
            }
        }
        System.out.println(companyWithMaxEmployees);
        System.out.println(companyWithMinEmployees);
    }
}
