public class Appointment {
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional professional;

    public Appointment() {
        this.patientName = "";
        this.patientMobile = "";
        this.timeSlot = "";
        this.professional = null;
    }

    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional professional) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.professional = professional;
    }

    public String getPatientMobile() {
        return patientMobile;
    }

    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        professional.printDetails();
    }
}
