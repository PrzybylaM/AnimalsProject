package Bears;

import Animals.Animal;
import Animals.ILivingBear;
import Helpers.IDateProvider;

public abstract class Bear extends Animal implements ILivingBear  {
    public Bear(IDateProvider dateProvd) {
        super(dateProvd);
    }

    public void attack(){
        System.out.println("Wound the target!");
    }

    public final void inspect(){
        raisePaw();
        openMouth();
        jump();
        swim();
    }

    protected void raisePaw(){
        System.out.println("I'm raising left paw!");
    }

    private void openMouth(){
        System.out.println("I'm showing my mouth!");
    }

    protected abstract void jump();

    protected void swim(){
        System.out.println("I'm swimming!");
    }
}
