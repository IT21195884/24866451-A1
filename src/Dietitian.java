public class Dietitian extends HealthProfessional {
    private String certification;

    //Default constructor featuring super class(HealthProfessional.java)
    public Dietitian() {
        super();
        this.certification = "Registered Dietitian";    //Special Attribute for the Dietition class
    }

    // Parametarized Constructor
    public Dietitian(String id, String name, String clinicLocation, String certification) {
        super(id, name, clinicLocation);
        this.certification = certification;
    }


    // Method to print dietitian details
    @Override
    public void printDetails() {
        System.out.println(toString());
    }

    // toString method for dietitian
    @Override
    public String toString() {
        return "--- Dietitian ---\n" + super.toString() + "\nCertification: " + certification;
    }
}