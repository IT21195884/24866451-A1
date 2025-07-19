public class Dietitian extends HealthProfessional {
    private String certification;

    public Dietitian() {
        super();
        this.certification = "Registered Dietitian";
    }

    public Dietitian(String id, String name, String clinicLocation, String certification) {
        super(id, name, clinicLocation);
        this.certification = certification;
    }

    @Override
    public void printDetails() {
        System.out.println("--- Dietitian ---");
        super.printDetails();
        System.out.println("Certification: " + certification);
    }
}