public class StaffHire {
    private int vacancyNumber;
    private String designation;
    private String jobType;

    public StaffHire(int vacancyNumber, String designation, String jobType) {
        this.vacancyNumber = vacancyNumber;
        this.designation = designation;
        this.jobType = jobType;
    }

    public int getVacancyNumber() { return vacancyNumber; }
    public String getDesignation() { return designation; }
    public String getJobType() { return jobType; }

    public void setDesignation(String designation) { this.designation = designation; }
    public void setJobType(String jobType) { this.jobType = jobType; }

    public void display() {
        System.out.println("Vacancy Number: " + vacancyNumber);
        System.out.println("Designation: " + designation);
        System.out.println("Job Type: " + jobType);
    }

    public String getWorkingHour() {
        return "Working Hour: ";
    }
}
