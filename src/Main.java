class Doctor {
    private static final double BONUS_RATE = 0.08;
    private String name; // masih public
    private int id;
    private double salary;
    private String specialization;

    public Doctor(String name, int id, double salary, String specialization) {
        this.setName(name);
        this.id = id;
        this.salary = salary;
        this.specialization = specialization;
    }

    public void applyBonus() {
        double bonus = salary * BONUS_RATE;
        salary += bonus;
        System.out.println("Bonus applied! New Salary: " + salary);
    }

    public void printDetails() {
        System.out.println("Doctor ID: " + id);
        System.out.println("Name: " + getName());
        System.out.println("Specialization: " + specialization);
        System.out.println("Salary: $" + salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Patient {
    public String name;
    public int recordNumber;
    public Doctor doctor;
    public String disease;

    public Patient(String name, int recordNumber, Doctor doctor, String disease) {
        this.name = name;
        this.recordNumber = recordNumber;
        this.doctor = doctor;
        this.disease = disease;
    }

    public void printPatientDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Record Number: " + recordNumber);
        System.out.println("Disease: " + disease);
        System.out.println("Doctor in Charge: " + doctor.getName()); // akses langsung ke field name
    }
}

class Hospital {
    public String hospitalName;
    public String address;
    public Patient patient;

    public Hospital(String hospitalName, String address, Patient patient) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.patient = patient;
    }

    public void printHospitalDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Address: " + address);
        patient.printPatientDetails();
    }
}
