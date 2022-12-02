package Oops.ClassAndObject;

public class SimpleClass {
    public static void main(String[] args) {
        double val;
        Box newbox=new Box();// we make a new instance of box class.
        // Below we addint the value to the instance of newbox;
        newbox.width=10;
        newbox.height=20;
        newbox.depth=15;

        Box newbox1=new Box();
        // Below we declaring the value to the newbox1 instance
        newbox1.width=3;
        newbox1.height=6;
        newbox1.depth=9;

        newbox.display();// calling display method for newbox
        newbox1.display();// calling display method for newbox1

    }
}
class Box{   //we create a new class wich is variable is width,depth and height;
    double width;
    double height;
    double depth;

    /* we can add method in the class
      so lets add method to the class */

    void display() {
        System.out.println("Valuem is ");
        System.out.println(width * height * depth);

    }

     /* Now we see the constructor here. constructor is used to initialize all the variable in a class
     each time the object is created.
     */
        Box () {
        width=10;
        height=20;
        depth=30;
        }


}
