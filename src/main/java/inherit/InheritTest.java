package inherit;

/**
 * Created by asus on 2018/12/5.
 */
public class InheritTest {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape.name);
        shape.printType();
        shape.printName();
        shape.printInt();
    }

}
class Shape {
    public static int name = 9;

    public Shape(){
        System.out.println("shape constructor");
    }

    public void printType() {
        System.out.println("this is shape");
    }

    public static void printName() {
        System.out.println("name");
    }

    public  void printInt(){
        System.out.println(name);
    }

}

class Circle extends Shape {
    public static int name = 10;

    public Circle() {
        System.out.println("circle constructor");
    }

    public void printType() {
        System.out.println("this is circle");
    }

    public static void printName() {
        System.out.println("circle");
    }
    public  void printInt(){
        System.out.println(name);
    }
}
