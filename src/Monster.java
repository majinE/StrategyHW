import java.util.HashMap;
import java.util.Objects;

public abstract class Monster {
    private Integer hp;
    private Integer xp;
    private Integer maxHp;
    private HashMap<String, Integer> items;

    public Monster(Integer maxHp, Integer xp, HashMap<String, Integer> items) {
        this.maxHp = maxHp;
        hp = this.maxHp;
        this.xp = xp;
        this.items = items;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(hp, monster.hp) &&
                Objects.equals(xp, monster.xp) &&
                Objects.equals(maxHp, monster.maxHp) &&
                Objects.equals(items, monster.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, xp, maxHp, items);
    }

    @Override
    public String toString() {
        return "hp=" + getMaxHp() + "/" + getHp();
    }
}
