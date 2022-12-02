package Oops.StaticKeyword;

public class StaticVariable {
    public static void main(String[] args) {
        Human pramod=new Human(27,"pramod",15000,false,"venus");
        Human ajay=new Human(27,"ajay",35000,false,"mercury");
        System.out.println(pramod.planet);
        System.out.println(ajay.planet);
    }
}
class Human{
    int age;
    String name;
    int sallary;
    Boolean married;
    static String planet="Earth";

    Human(int age,String name,int sallary,Boolean married,String planet){
        this.age=age;
        this.name=name;
        this.sallary=sallary;
        this.married=married;
    }

}