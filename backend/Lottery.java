package backend;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import backend.Toys;

public class Lottery {
    protected ArrayList<Toys> ListToys;
    protected ArrayDeque<Toys> ListOfWinners;

    public Lottery(ArrayList<Toys> list) {
        this.ListToys = list;
    };

    public void ShowList() {
        for (Toys toys : ListToys) {
            toys.ShowToy(toys);
        }
    }

    public void Choose3Winner() {
        Collections.sort(this.ListToys);
        ListOfWinners = new ArrayDeque<>();
        ListOfWinners.addFirst(ListToys.get(2));
        ListOfWinners.addFirst(ListToys.get(1));
        ListOfWinners.addFirst(ListToys.get(0));
    }

    public void showListOfWinners() {
        for (Toys toys : ListOfWinners) {
            toys.ShowToy(toys);
        }
    }

    public void Get_a_toy() throws Exception {
        Toys win = this.ListOfWinners.pop();
        win.minusQuantity();
        win.ShowToy(win);
        FileWorker.WriteToFile(win.toString());
    }

}
