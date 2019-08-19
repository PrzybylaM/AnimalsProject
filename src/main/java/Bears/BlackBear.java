package Bears;

import Helpers.IDateProvider;

public class BlackBear extends Bear {

    public BlackBear(IDateProvider dateProvider){
        super(dateProvider);
        setWeight(50);
        setMsgToShow("I am a Black Bear!");
    }

    protected void jump() {
        System.out.println("I jump 1 meter high!");
    }

    protected void swim(){
        System.out.println("I'm not going, I'm afraid of water!");
    }
}
