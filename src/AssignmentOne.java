
// Part 3 – Using classes and objects

import java.util.ArrayList;
import java.util.Iterator;


public class AssignmentOne {

    // Part 5 – Collection of appointments
    // Collection to hold all appointments
    static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {

        // Creating general practitioner class objects
        GeneralPractitioner gp1 = new GeneralPractitioner("GP001", "Dr. Smith", "Central Clinic", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner("GP002", "Dr. Adams", "Westside Health", "Pediatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner("GP003", "Dr. Lee", "Northpoint", "Dermatology");

        // Creating dietitian class objects
        Dietitian d1 = new Dietitian("DT001", "Dr. Green", "Central Clinic", "Sports Nutrition");
        Dietitian d2 = new Dietitian("DT002", "Dr. Stone", "Eastwell Centre", "Weight Management");

        // Displaying health professional details
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        d1.printDetails();
        d2.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments

        // Creating appointments
        createAppointment("Alice", "0450000001", "09:00", gp1);
        createAppointment("Bob", "0450000002", "10:00", gp2);
        createAppointment("Cathy", "0450000003", "11:00", d1);
        createAppointment("David", "0450000004", "14:00", d2);

        // Displaying all appointments
        printExistingAppointments();

        // Canceling one appointment
        cancelBooking("0450000002");

        // Displaying updated appointments
        printExistingAppointments();

        System.out.println("------------------------------");










    }

    // Method to create a new appointment
    public static void createAppointment(String name, String mobile, String timeSlot, HealthProfessional professional) {
        if (name.isEmpty() || mobile.isEmpty() || timeSlot.isEmpty() || professional == null) {
            System.out.println("Invalid appointment details.");
            return;
        }
        Appointment appt = new Appointment(name, mobile, timeSlot, professional);
        appointments.add(appt);
        System.out.println("Appointment created for: " + name);
    }

    // Method to display all existing appointments
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

    // Method to cancel an appointment using mobile number
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
