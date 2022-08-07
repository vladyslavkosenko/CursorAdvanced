package hw1.fireDepartment;

public class Firefighter {
    private final String name;

    Firefighter(String name) {
        this.name = name;
    }

    void fightFire() {
        System.out.println(name + ": is ready to work");
    }
}
