public class PartTimeStaffHire  extends StaffHire {

    private int workingHour;
    private double wagesPerHour;
    private String shifts;
    private boolean terminated;

    public PartTimeStaffHire(int vacancyNumber,
                             String designation,
                             String jobType,
                             String staffName,
                             String joiningDate,
                             String qualification,
                             String appointedBy,
                             boolean joined,
                             int workingHour,
                             double wagesPerHour,
                             String shifts,
                             boolean terminated)
    {
        super(vacancyNumber, designation, jobType, staffName, joiningDate, qualification, appointedBy, joined);
        workingHour = workingHour;
        wagesPerHour = wagesPerHour;
        shifts = shifts;
        terminated = false;
    }

    public int getWorkingHour()
    {
        return workingHour;
    }

    public double getWagesPerHour()
    {
        return wagesPerHour;
    }

    public String getShifts()
    {
        return shifts;
    }

    public boolean getTerminated()
    {
        return terminated;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Working Hour: " + workingHour);
        System.out.println("Wages Per Hour: " + wagesPerHour);
        System.out.println("Shifts: " + shifts);
        System.out.println("Terminated: " + terminated);
    }
}

