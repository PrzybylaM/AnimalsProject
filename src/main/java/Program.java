import Animals.*;
import Bears.Bear;
import Bears.BlackBear;
import Bears.PolarBear;
import Bears.TeddyBear;
import Helpers.DateProvider;
import Helpers.IDateProvider;

public class Program {
    public static void main(String []args){
        System.out.println("yo");

        IDateProvider provider = new DateProvider();

        Bear bear = new BlackBear(provider);
        bear.eat();

        boolean isAlive = bear.isAlive();

        IToyBear bear2 = new TeddyBear();
        ILivingBear bear3 = new PolarBear(provider);

        bear3.isAlive();

        bear3.getWeight();
        bear3.display();
        bear3.attack();

        bear.inspect();

        System.out.println();
    }
}