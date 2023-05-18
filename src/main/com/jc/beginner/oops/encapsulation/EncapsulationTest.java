package main.com.jc.beginner.oops.encapsulation;

public class EncapsulationTest {
    private String name;
    private int id;
    private String email;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public EncapsulationTest() {

    }

    public EncapsulationTest(String name, int id, String email) {
        this.name = name;
        this.id = id ;
        this.email = email;
    }


}
