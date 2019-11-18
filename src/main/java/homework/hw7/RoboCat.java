package homework.hw7;

public class RoboCat extends Pet {
    RoboCat(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    void respond() {
        System.out.println("I'm a robocat");
    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void foul() {
        super.foul();
    }
}