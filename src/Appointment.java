public class Appointment {
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional professional;

    //Default Constructor
    public Appointment() {
        this.patientName = "";
        this.patientMobile = "";
        this.timeSlot = "";
        this.professional = null;
    }

    //Parameterized Constructor
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional professional) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.professional = professional;
    }

    // Getter for patient mobile number (used for cancellation)
    public String getPatientMobile() {
        return patientMobile;
    }

    // Method to print full appointment details
    public void printAppointmentDetails() {
        System.out.println(toString());
    }

    // toString method for appointment
    @Override
    public String toString() {
        return "Patient Name: " + patientName +
                "\nMobile: " + patientMobile +
                "\nTime Slot: " + timeSlot +
                "\n" + (professional != null ? professional.toString() : "No professional assigned");
    }
}
