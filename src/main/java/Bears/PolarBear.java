package Bears;

import Animals.Animal;
import Animals.IBear;
import Helpers.IDateProvider;

public class PolarBear extends Bear {

    public PolarBear(IDateProvider dateProvider){
        super(dateProvider);
        setWeight(200);
        setMsgToShow("I am a Polar Bear!");
    }

    public void attack(){
        System.out.println("Kill the target!");
    }

    public void cosTam23(Animal creature){
        creature.eat();
    }

    protected void raisePaw(){
        System.out.println("I'm raising right paw!");
    }

    protected void jump() {
        System.out.println("I jump 0,5 meter high!");
    }
}
