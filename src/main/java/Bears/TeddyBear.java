package Bears;

import Animals.IBear;
import Animals.IToyBear;
import Animals.Toys;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TeddyBear extends Toys implements IToyBear {

    public TeddyBear(){
        setWeight(1);
    }

    public void display(){
        System.out.println("I am a Teddy Bear!");
    }
}
