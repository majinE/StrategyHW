package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public abstract class Monster {
    private Integer hp;
    private Integer xp;
    private Integer maxHp;
    Integer agi = 5;
    Integer def = 5;
    Integer str = 5;
    Attack attack;
    private HashMap<String, Integer> items;

    public Monster(Integer maxHp, Integer xp, HashMap<String, Integer> items) {
        this.maxHp = maxHp;
        hp = this.maxHp;
        this.xp = xp;
        this.items = items;
    }
    public Integer attackTarget(Monster monster) {
        return attack.attack(monster);
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public Integer getMaxHp() {
        return maxHp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getAgi() {
        return agi;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getStr() {
        return str;
    }

    public Attack getAttack() {
        return attack;
    }

    Integer getAttribute(Integer min, Integer max) {
        Random rand = new Random();
        if(min > max) {
            Integer temp = min;
            min = max;
            max = temp;
        }

        return rand.nextInt(max-min)+ min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(hp, monster.hp) &&
                Objects.equals(xp, monster.xp) &&
                Objects.equals(maxHp, monster.maxHp) &&
                Objects.equals(agi, monster.agi) &&
                Objects.equals(def, monster.def) &&
                Objects.equals(str, monster.str) &&
                Objects.equals(attack, monster.attack) &&
                Objects.equals(items, monster.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, xp, maxHp, agi, def, str, attack, items);
    }

    @Override
    public String toString() {
        return "hp=" + getMaxHp() + "/" + getHp();
    }
}
