package petshop;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Appointment {
    Animal pet;
    LocalDate date;
    LocalTime time;

    Appointment() {
    }
    public Appointment(Animal pet, LocalDate date, LocalTime time) {
        this.pet = pet;
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "pet=" + pet +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}
