/**
 * Author: Edgar Reyes
 * Date: 3/1/2019
 * Title: HW02
 * Abstract: This is an example of a Strategy Pattern.
 */

package Monsters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Driver {
    public static void main(String [] args) {
        HashMap<String, Integer> items = new HashMap<>();
        items.put("gold", 5);
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Imp(15, 20, items));
        monsters.add(new Kobold(1, 5, items));

        for (Monster m : monsters) {
            System.out.println(m);
        }

        System.out.println(monsters.get(0).attackTarget(monsters.get(1)));
        System.out.println(monsters.get(1).attackTarget(monsters.get(0)));
    }
}
