import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

import backend.FileWorker;
import backend.Lottery;
import backend.Toys;

public class Shop {
    public static void main(String[] args) throws Exception {
        ArrayList<Toys> toysFromshop = new ArrayList<Toys>();
        for (int i = 0; i < 6; i++) {
            toysFromshop.add(new Toys(Toys.MakingID(), Toys.randName(), Toys.randQuantity(), Toys.randFrequency()));
        }
        Lottery lottery = new Lottery(toysFromshop);
        lottery.Choose3Winner();
        System.out.println("=============");
        lottery.showListOfWinners();
        System.out.println("===============");
        lottery.Get_a_toy();
    }
}