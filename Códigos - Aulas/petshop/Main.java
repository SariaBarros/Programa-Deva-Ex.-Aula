package petshop;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat = new Animal();

        dog.specie = "dog";
        dog.animalName = "Lilibet";
        dog.tutorName = "Sandy";

        cat.specie = "cat";
        cat.animalName = "nego";
        cat.tutorName = "Sandy";

        LocalDate date = LocalDate.of(2022, 10, 25);
        LocalTime time = LocalTime.of(13, 0);
        Appointment appointmentDog = new Appointment(dog, date, time);

        date = LocalDate.of(2022, 11, 1);
        time = LocalTime.of(9, 30);
        Appointment appointmentCat = new Appointment(cat, date, time);

        AppointmentBook.addAppointment(appointmentDog);
        AppointmentBook.addAppointment(appointmentCat);

        AppointmentBook.listInfo();
    }
}
