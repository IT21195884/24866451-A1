public class GeneralPractitioner extends HealthProfessional {
    private String specialty;

    //Default constructor featuring super class(HealthProfessional.java)
    public GeneralPractitioner() {
        super();
        this.specialty = "General Health";
    }

    //Parametarized Constructor
    public GeneralPractitioner(String id, String name, String clinicLocation, String specialty) {
        super(id, name, clinicLocation);
        this.specialty = specialty;
    }

    // Method to print general practitioner details
    @Override
    public void printDetails() {
        System.out.println("--- General Practitioner ---");
        super.printDetails();
        System.out.println("Specialty: " + specialty);
    }
}