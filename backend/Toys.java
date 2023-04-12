package backend;

import java.util.concurrent.ThreadLocalRandom;

public class Toys implements Comparable<Toys> {
    protected int id;
    protected String name;
    protected int quantity;
    protected int frequency;

    public Toys(int id, String name, int quantity, int frequency) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public static int MakingID() {
        int randomNum = ThreadLocalRandom.current().nextInt(100, 998);
        return randomNum;
    }

    public static String randName() {
        int index = ThreadLocalRandom.current().nextInt(0, 10);
        String[] names = { "Bear", "Car", "Barbi", "Rabbit", "Flower", "Transformer", "Bionicle", "Lizzard",
                "BlueTruck", "Ken" };
        return names[index];
    }

    public static int randQuantity() {
        int quantity = ThreadLocalRandom.current().nextInt(1, 41);
        return quantity;
    }

    public static int randFrequency() {
        int freq = ThreadLocalRandom.current().nextInt(1, 101);
        return freq;
    }

    public void ChangeFreq(Toys toy, int newFreq) {
        this.frequency = newFreq;
    }

    public void ShowToy(Toys toy) {
        System.out.format("id:%d, name:%s, Quantity:%d, Frequency:%d\n", this.id, this.name, this.quantity,
                this.frequency);
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public int compareTo(Toys obj) {
        return obj.getFrequency() - this.getFrequency();
    }

    public void minusQuantity() {
        this.quantity = this.quantity - 1;
    }

    @Override
    public String toString() {
        return "id: " + this.id + ", name:" + this.name + ", Quantity:" + 1 + ", Frequency:"
                + this.frequency;
    }

}
