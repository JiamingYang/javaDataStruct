package inherit;

/**
 * Created by asus on 2018/12/6.
 */
public class InheritTest2 {
    public static void main(String[] args) {
        MidMeal meal=new MidMeal();
    }
}

class Meal {

    public Meal() {
        System.out.println("meal");
    }

    Bread bread = new Bread();
}
class MidMeal extends Meal{
    public MidMeal(){
        System.out.println("midmeal");
    }
}
class Bread {

    public Bread() {
        System.out.println("bread");
    }
}
