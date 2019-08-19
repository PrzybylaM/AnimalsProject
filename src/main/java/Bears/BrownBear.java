package Bears;

import Animals.Animal;
import Helpers.IDateProvider;

public class BrownBear extends Bear {

    public BrownBear(IDateProvider dateProvider){
        super(dateProvider);
        setWeight(100);
        setMsgToShow("I am a Brown Bear!");
    }


    public void cosTam(Animal creature){
        creature.eat();
    }

    protected void jump() {
        System.out.println("I jump 0,75 meter high!");
    }
}
