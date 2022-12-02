package Oops.ClassAndObject;

import java.awt.*;

public class ParaConstructor {

    public static void main(String args[]){

        Rectangle rect1=new Rectangle(10,20);
        Rectangle rect2=new Rectangle(20,30);

    }
}
 class Recatangle{
     /*default  constructor or non paramatrized constructor are not that usefull so here we using
    paramatrics constructor in the class  */
    int length;
    int width;

    Recatangle(int l,int w) {// parametrised constuctor taking value length
        this.length = l;
        this.width = w;
    }
    int val(){
        return length*width;
    }


}
