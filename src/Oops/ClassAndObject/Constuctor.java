package Oops.ClassAndObject;

public class Constuctor {
    public static void main(String[] args) {
        Tringle tringle1=new Tringle();
        Tringle tringle2=new Tringle();

        /*We made two instance of same class but in this we already define there values in constructor*/
        tringle1.valueme();
        tringle2.valueme();;
        tringle2.base=100;
        tringle2.base=200;
        tringle2.valueme();
        /*From above we conclude that when we set independetly then it ignore the constuctor value*/
    }
}
class Tringle{
    int base;
    int height;

    Tringle (){
        base=14;
        height=20;
    }
    void valueme(){
        System.out.println((base*height)/2);
    }
}
