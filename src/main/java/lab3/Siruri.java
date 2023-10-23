package lab3;

import java.util.ArrayList;
import java.util.List;

public class Siruri {

    public static void main(String[] args) {

        String[] sir1 = {"ana", "mouse", "banane"};
        String[] sir2 = {"maria", "ioana", "ana"};

        List<String> duplicate = new ArrayList<>();

        for (String element1 : sir1) {
            for (String element2 : sir2) {
                if (element1.equals(element2)) {
                    duplicate.add(element1);
                    break;
                }
            }
        }
        System.out.println("Elementele duplicate sunt: " + duplicate);
    }
}
