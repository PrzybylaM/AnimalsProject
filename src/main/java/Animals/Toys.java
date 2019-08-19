package Animals;

public abstract class Toys {
    private int weight;
    private String msgToShow;

    public int getWeight() {
        return 1;
    }

    protected void setWeight(int newWeight){
        weight = newWeight;
    }

    protected void setMsgToShow(String newMsg){
        msgToShow = newMsg;
    }

    public void display(){
        System.out.println(msgToShow);
    }
}
