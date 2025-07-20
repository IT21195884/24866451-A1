public class Dietitian extends HealthProfessional {
    private String certification;

    //Default constructor featuring super class(HealthProfessional.java)
    public Dietitian() {
        super();
        this.certification = "Registered Dietitian";
    }

    //Parametarized Constructor
    public Dietitian(String id, String name, String clinicLocation, String certification) {
        super(id, name, clinicLocation);
        this.certification = certification;
    }


    // Method to print dietitian details
    @Override
    public void printDetails() {
        System.out.println("--- Dietitian ---");
        super.printDetails();
        System.out.println("Certification: " + certification);
    }
}