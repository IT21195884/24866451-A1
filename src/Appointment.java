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

    //Printing Appointment Details
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        professional.printDetails();
    }
}
