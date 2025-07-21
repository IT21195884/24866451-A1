public class HealthProfessional {
    protected String id;
    protected String name;
    protected String clinicLocation;

    //Default Constructor Initialized
    public HealthProfessional() {
        this.id = "";
        this.name = "";
        this.clinicLocation = "";  //The other variable regardeless of the Health Profession
    }

    //Parametarized Constructor
    public HealthProfessional(String id, String name, String clinicLocation) {
        this.id = id;
        this.name = name;
        this.clinicLocation = clinicLocation;
    }

    //Health Professional Details printing method
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Clinic Location: " + clinicLocation);
    }
}