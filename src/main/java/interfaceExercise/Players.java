package interfaceExercise;

import java.util.ArrayList;
import java.util.List;

public class Players implements Savable {

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", healthPoints=" + healthPoints +
                ", strength=" + strength +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getStrength() {
        return strength;
    }

    private String name;
    private String weapon;
    private int healthPoints;
    private int strength;

    public Players(String name, String weapon, int healthPoints, int strength) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoints = healthPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, this.weapon);
        values.add(2, "" + this.healthPoints);
        values.add(3, "" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.weapon = savedValues.get(1);
            this.healthPoints = Integer.parseInt(savedValues.get(2));
            this.strength = Integer.parseInt(savedValues.get(3));
        }
    }

}
