public class GeneralPractitioner extends HealthProfessional {
    private String specialty;

    public GeneralPractitioner() {
        super();
        this.specialty = "General Health";
    }

    public GeneralPractitioner(String id, String name, String clinicLocation, String specialty) {
        super(id, name, clinicLocation);
        this.specialty = specialty;
    }

    @Override
    public void printDetails() {
        System.out.println("--- General Practitioner ---");
        super.printDetails();
        System.out.println("Specialty: " + specialty);
    }
}