public class PartTimeStaffHire extends StaffHire {
    private int workingHour;
    private int wagesPerHour;
    private String shifts;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    private boolean terminated;

    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts) {
        super(vacancyNumber, designation, jobType);
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        this.joined = false;
        this.terminated = false;
    }

    public void hirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy) {
        if (!joined) {
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
            this.terminated = false;
        } else {
            System.out.println("Staff already hired.");
        }
    }

    public void terminateStaff() {
        if (!terminated) {
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
            joined = false;
            terminated = true;
        } else {
            System.out.println("Already terminated.");
        }
    }

    // în PartTimeStaffHire.java

    public String getStaffName() {
        return staffName;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public String getQualification() {
        return qualification;
    }

    public String getAppointedBy() {
        return appointedBy;
    }

    public boolean isTerminated() {
        return terminated;
    }


    @Override
    public void display() {
        super.display();
        System.out.println("Working Hour: " + workingHour);
        System.out.println("Wages Per Hour: " + wagesPerHour);
        System.out.println("Shift: " + shifts);
        if (joined) {
            System.out.println("Staff Name: " + staffName);
            System.out.println("Joining Date: " + joiningDate);
            System.out.println("Qualification: " + qualification);
            System.out.println("Appointed By: " + appointedBy);
        }
    }

    public boolean isJoined() {
        return joined;
    }

    public String getWagesPerHour() {
        return String.valueOf(wagesPerHour);
    }

    public String getShifts() {
        return shifts;
    }
}
