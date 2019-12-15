package homework.hw13;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Map;

public final class Man extends Human  implements Serializable {
    Man(String name, String surname, LocalDate birthDate) {
        super(name, surname, birthDate);
    }

    Man(String name, String surname, LocalDate birthDate, int iq, Family family) {
        super(name, surname, birthDate, iq, family);
    }

    public Man(String name, String surname, LocalDate birthDate, int iq, Map<String,String> schedule) {
        super(name, surname, birthDate, iq,schedule);
    }

    public Man(String name, String surname, LocalDate birthDate, int iq, Map<String,String> schedule, Family family) {
        super(name, surname, birthDate, iq,schedule, family);
    }

    public Man(String name, String surname, LocalDate birthDate, int iq) {
        super(name, surname, birthDate, iq);
    }

    @Override
    void greetPet() {
        System.out.println("Hi");
    }
    void watchingTv(){
        System.out.println("I'm watching TV");
    }
}
