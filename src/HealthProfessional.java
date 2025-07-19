public class HealthProfessional {
    protected String id;
    protected String name;
    protected String clinicLocation;

    public HealthProfessional() {
        this.id = "";
        this.name = "";
        this.clinicLocation = "";
    }

    public HealthProfessional(String id, String name, String clinicLocation) {
        this.id = id;
        this.name = name;
        this.clinicLocation = clinicLocation;
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Clinic Location: " + clinicLocation);
    }
}