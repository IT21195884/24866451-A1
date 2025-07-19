import java.util.ArrayList;
import java.util.Iterator;

public class AssignmentOne {
    static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner("GP001", "Dr. Smith", "Central Clinic", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner("GP002", "Dr. Adams", "Westside Health", "Pediatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner("GP003", "Dr. Lee", "Northpoint", "Dermatology");

        Dietitian d1 = new Dietitian("DT001", "Dr. Green", "Central Clinic", "Sports Nutrition");
        Dietitian d2 = new Dietitian("DT002", "Dr. Stone", "Eastwell Centre", "Weight Management");

        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        d1.printDetails();
        d2.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        createAppointment("Alice", "0450000001", "09:00", gp1);
        createAppointment("Bob", "0450000002", "10:00", gp2);
        createAppointment("Cathy", "0450000003", "11:00", d1);
        createAppointment("David", "0450000004", "14:00", d2);

        printExistingAppointments();
        cancelBooking("0450000002");
        printExistingAppointments();

        System.out.println("------------------------------");
    }

    public static void createAppointment(String name, String mobile, String timeSlot, HealthProfessional professional) {
        if (name.isEmpty() || mobile.isEmpty() || timeSlot.isEmpty() || professional == null) {
            System.out.println("Invalid appointment details.");
            return;
        }
        Appointment appt = new Appointment(name, mobile, timeSlot, professional);
        appointments.add(appt);
        System.out.println("Appointment created for: " + name);
    }

    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }
        System.out.println("Existing Appointments:");
        for (Appointment appt : appointments) {
            appt.printAppointmentDetails();
            System.out.println("------------------------------");
        }
    }

    public static void cancelBooking(String mobile) {
        Iterator<Appointment> iterator = appointments.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Appointment appt = iterator.next();
            if (appt.getPatientMobile().equals(mobile)) {
                iterator.remove();
                System.out.println("Appointment with mobile " + mobile + " cancelled.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found with mobile: " + mobile);
        }
    }
}
