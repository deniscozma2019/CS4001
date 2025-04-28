public class FullTimeStaffHire extends StaffHire {
    private int salary;
    private int weeklyHours;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;

    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int weeklyHours) {
        super(vacancyNumber, designation, jobType);
        this.salary = salary;
        this.weeklyHours = weeklyHours;
        this.joined = false;
    }

    public void hireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy) {
        if (!joined) {
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
        } else {
            System.out.println("Staff already hired.");
        }
    }

    public void setSalary(int salary) {
        if (!joined) {
            this.salary = salary;
        } else {
            System.out.println("Cannot change salary after hiring.");
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
        System.out.println("Weekly Hours: " + weeklyHours);
        if (joined) {
            System.out.println("Staff Name: " + staffName);
            System.out.println("Joining Date: " + joiningDate);
            System.out.println("Qualification: " + qualification);
            System.out.println("Appointed By: " + appointedBy);
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


    public String getSalary() {
        return String.valueOf(salary);
    }

    public String getWeeklyHours() {
        return weeklyHours + " hours";
    }

    public boolean isJoined() {
        return false;
    }
}
