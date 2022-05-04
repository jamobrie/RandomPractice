package interfaceExercise;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Monsters implements Savable {

    private String monsterName;
    private String monsterDifficulty;
    private int numberOfWeapons;
    private double health;
    private int intelligence;

    @Override
    public List<String> write() {
        ArrayList<String> monster = new ArrayList<>();
        monster.add(0, this.monsterName);
        monster.add(1, this.monsterDifficulty);
        monster.add(2, "" + this.numberOfWeapons);
        monster.add(3, "" + this.health);
        monster.add(4, "" + this.intelligence);
        return monster;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.monsterName = savedValues.get(0);
            this.monsterDifficulty = savedValues.get(1);
            this.numberOfWeapons = numberOfWeapons;
            this.health = health;
            this.intelligence = intelligence;
        }
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "monsterName='" + monsterName + '\'' +
                ", monsterDifficulty='" + monsterDifficulty + '\'' +
                ", numberOfWeapons=" + numberOfWeapons +
                ", health=" + health +
                ", intelligence=" + intelligence +
                '}';
    }


}
