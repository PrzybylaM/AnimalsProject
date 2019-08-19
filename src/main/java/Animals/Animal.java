package Animals;

import Helpers.DateUtils;
import Helpers.IDateProvider;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class Animal implements IAnimal {
    private Date lastEatTime;
    private int weight;
    private String msgToShow;

    private Date currentDate;

    public Animal(IDateProvider dateProvd){
        currentDate = dateProvd.getDate();
    }

    public void eat(){

        this.lastEatTime = currentDate;
    }
    public boolean isAlive(){
        return lastEatTime == null
                ? false
                : TimeUnit.DAYS.convert(DateUtils.getDateDiff(currentDate, lastEatTime), TimeUnit.MILLISECONDS) < 10;
    }

    protected void setWeight(int newWeight){
        weight = newWeight;
    }

    protected void setMsgToShow(String newMsg){
        msgToShow = newMsg;
    }

    public int getWeight(){
        return weight;
    }

    public void display(){
        System.out.println(msgToShow);
    }
}
