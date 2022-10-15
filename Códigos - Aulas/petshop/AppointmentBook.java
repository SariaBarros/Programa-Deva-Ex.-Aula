package petshop;

import java.util.ArrayList;
import java.util.List;

public class AppointmentBook {
    static List<Appointment> records = new ArrayList<>();

    public static void addAppointment(Appointment newAppointment){
        records.add(newAppointment);
    }

    public static void listInfo(){
       for (Appointment a: records){
           System.out.println(a);
       }

    }
}
