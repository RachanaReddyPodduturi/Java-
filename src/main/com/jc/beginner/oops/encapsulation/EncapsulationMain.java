package main.com.jc.beginner.oops.encapsulation;

class EncapsulationMainClass {

    public static void main(String[] args) {

        Encapsulation encapsulation = new Encapsulation("value1", "value2");
        System.out.println(encapsulation.getData1());
        System.out.println(encapsulation.getData2());

       // System.out.println(encapsulation.data1); 
       // System.out.println(encapsulation.data2);

        encapsulation.setData1("value1 updated");
        encapsulation.setData2("value2 updated");

        // encapsulation.data1= "value1 updated";
       // encapsulation.data2 = "value2 updated";

    }
}
