public abstract class HealthProfessional {
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

    // Method to print professional details
    public void printDetails() {
        System.out.println(toString());
    }

    // toString method for base class
    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nClinic Location: " + clinicLocation;
    }
}