public class FullTimeStaffHire extends StaffHire{

    private double salary;
    private int weeklyFractionalHours;

    public FullTimeStaffHire(
            int vacancyNumber,
            String designation,
            String jobType,
            String staffName,
            String joiningDate,
            String qualification,
            String appointedBy,
            boolean joined,
            double salary,
            int weeklyFractionalHours)
    {
        super(vacancyNumber,
                designation,
                jobType,
                staffName,
                joiningDate,
                qualification,
                appointedBy,
                joined);
        salary = salary;
        weeklyFractionalHours = weeklyFractionalHours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (super.getJoined()==true) {
            salary = newSalary;
            System.out.println("Salary updated to: " + salary);
        } else {
            System.out.println("No staff appointed to set the salary.");
        }
    }

    public int getWeeklyFractionalHours()
    {
        return weeklyFractionalHours;
    }

    public void setWeeklyFractionalHours(int weeklyFractionalHours)
    {
        weeklyFractionalHours = weeklyFractionalHours;
        System.out.println("Weekly Fractional Hours updated to: "
                + weeklyFractionalHours);
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Salary: " + salary);
        System.out.println("Weekly Fractional Hours:"+ weeklyFractionalHours);
    }
}
