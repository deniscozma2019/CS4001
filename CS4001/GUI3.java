import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public  class GUI3 implements ActionListener {
    private final JTextField vacancyNumberField;
    private final JTextField designationField;
    private final JTextField jobTypeField;
    private final JTextField staffNameField;
    private final JTextField joiningDateField;
    private final JTextField qualificationField;
    private final JTextField appointedByField;
    private final JTextField salaryField;
    private final JTextField weeklyFractionalHoursField;
    private final JTextField wagesPerHourField;
    private final JTextField shiftsField;
    private final JTextField workingHourField;
    private final JTextField terminatedField;
    private final JCheckBox joinedCheckBox;
    private final JTextField displayNumberField;
    private JButton addFullTimeButton, addWorkingHoursButton, addWeeklyFractionalHoursButton, setWagesPerHourButton, addPartTimeButton, setSalaryButton, setShiftsButton, terminateButton, displayButton, clearButton;
    private final JFrame frame;

    ArrayList <StaffHire> Item = new ArrayList<StaffHire>();
    public GUI3() {
        frame = new JFrame("Staff Hiring System");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 5, 20, 20);

        // Panel for the first column (General Staff Information)
        JPanel leftPanel = new JPanel(new GridLayout(8, 2, 10, 10));

        leftPanel.setBorder(BorderFactory.createTitledBorder("General Staff Information"));
        contentPane.add(leftPanel,gbc);

        leftPanel.add(new JLabel("Vacancy Number:"));
        vacancyNumberField = new JTextField(15);
        leftPanel.add(vacancyNumberField);

        leftPanel.add(new JLabel("Designation:"));
        designationField = new JTextField(15);
        leftPanel.add(designationField);

        leftPanel.add(new JLabel("Job Type:"));
        jobTypeField = new JTextField(15);
        leftPanel.add(jobTypeField);

        leftPanel.add(new JLabel("Staff Name:"));
        staffNameField = new JTextField(15);
        leftPanel.add(staffNameField);

        leftPanel.add(new JLabel("Joining Date:"));
        joiningDateField = new JTextField(15);
        leftPanel.add(joiningDateField);

        leftPanel.add(new JLabel("Qualification:"));
        qualificationField = new JTextField(15);
        leftPanel.add(qualificationField);

        leftPanel.add(new JLabel("Appointed By:"));
        appointedByField = new JTextField(15);
        leftPanel.add(appointedByField);

        leftPanel.add(new JLabel("Joined Date:"));
        joinedCheckBox = new JCheckBox();
        leftPanel.add(joinedCheckBox);

        // Building the Panels No2
        JPanel rightPanel = new JPanel(new GridBagLayout());
        rightPanel.setBorder(BorderFactory.createTitledBorder("Employment Details"));

        GridBagConstraints gbd = new GridBagConstraints();
        gbd.insets = new Insets(5, 3, 5, 5);
        gbd.fill = GridBagConstraints.HORIZONTAL;

        // Full-Time Panel
        JPanel fullTimePanel = new JPanel(new GridBagLayout());
        fullTimePanel.setBorder(BorderFactory.createTitledBorder("Full Time Employment Details"));

        gbd.gridx = 0;
        gbd.gridy = 0;
        fullTimePanel.add(new JLabel("Salary:"), gbd);

        gbd.gridx = 1;
        salaryField = new JTextField(15);
        fullTimePanel.add(salaryField, gbd);

        gbd.gridx = 2;
        JButton setSalaryButton = new JButton("Set Salary");
        fullTimePanel.add(setSalaryButton, gbd);

        gbd.gridx = 0;
        gbd.gridy = 1;
        fullTimePanel.add(new JLabel("Weekly Fractional Hours:"), gbd);

        gbd.gridx = 1;
        weeklyFractionalHoursField = new JTextField(15);
        fullTimePanel.add(weeklyFractionalHoursField, gbd);

        gbd.gridx = 2;
        JButton addWeeklyHoursButton = new JButton("Set Weekly Fractional Hours");
        fullTimePanel.add(addWeeklyHoursButton, gbd);

        gbd.gridx = 0;
        gbd.gridy = 3;
        gbd.gridwidth = 3;
        JButton addFullTimeStaffButton = new JButton("Add Full Time Staff");
        fullTimePanel.add(addFullTimeStaffButton, gbd);

        // Part-Time Panel
        JPanel partTimePanel = new JPanel(new GridBagLayout());
        partTimePanel.setBorder(BorderFactory.createTitledBorder("Part Time Employment Details"));

        GridBagConstraints gbs = new GridBagConstraints();
        gbs.insets = new Insets(5, 3, 5, 5);
        gbs.fill = GridBagConstraints.HORIZONTAL;

        gbs.gridx = 0;
        gbs.gridy = 0;
        partTimePanel.add(new JLabel("Working Hour:"), gbs);

        gbs.gridx = 1;
        workingHourField = new JTextField(15);
        partTimePanel.add(workingHourField, gbs);

        gbs.gridx = 2;
        JButton addWorkingHoursButton = new JButton("Number of Working Hours:");
        partTimePanel.add(addWorkingHoursButton, gbs);

        gbs.gridx = 0;
        gbs.gridy = 1;
        partTimePanel.add(new JLabel("Wage Per Hour:"), gbs);

        gbs.gridx = 1;
        wagesPerHourField = new JTextField(15);
        partTimePanel.add(wagesPerHourField, gbs);

        gbs.gridx = 2;
        JButton setWagesPerHourButton = new JButton("Wages Per Hour:");
        partTimePanel.add(setWagesPerHourButton, gbs);

        gbs.gridx = 0;
        gbs.gridy = 2;
        partTimePanel.add(new JLabel("Shifts:"), gbs);

        gbs.gridx = 1;
        shiftsField = new JTextField(15);
        partTimePanel.add(shiftsField, gbs);

        gbs.gridx = 2;
        JButton setShiftsButton = new JButton("Set Shifts");
        partTimePanel.add(setShiftsButton, gbs);

        gbs.gridx = 0;
        gbs.gridy = 3;
        partTimePanel.add(new JLabel("Terminated Number:"), gbs);

        gbs.gridx = 1;
        terminatedField = new JTextField(15);
        partTimePanel.add(terminatedField, gbs);

        gbs.gridx = 2;
        JButton terminateButton = new JButton("Terminate Staff");
        partTimePanel.add(terminateButton, gbs);

        gbs.gridx = 0;
        gbs.gridy = 4;
        gbs.gridwidth = 3;
        JButton addPartTimeStaffButton = new JButton(" Add Part Time Staff");
        partTimePanel.add(addPartTimeStaffButton, gbs);

        //Adding Panels to Right Panel
        gbd.gridx = 0;
        gbd.gridy = 0;
        gbd.gridwidth = 3;
        rightPanel.add(fullTimePanel, gbd);

        gbs.gridy = 1;
        gbs.gridwidth = 3;
        rightPanel.add(partTimePanel, gbs);

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());

        displayNumberField = new JTextField(15);
        buttonPanel.add(displayNumberField);

        displayButton = new JButton("Display Details of Staff");
        buttonPanel.add(displayButton);
        displayButton.addActionListener(this);

        clearButton = new JButton("Clear Detail from the Windows");
        buttonPanel.add(clearButton);
        clearButton.addActionListener(this);

        // Layout setup
        gbc.gridx = 0;
        gbc.gridy = 0;

        contentPane.add(leftPanel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;

        contentPane.add(rightPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;

        contentPane.add(buttonPanel, gbc);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new GUI3();
    }

    public void actionPerformed(ActionEvent event)
    {
        String command = event.getActionCommand();
        if (command.equals("Clear Detail from the Windows")) {
            clearFields();
        }

        if (command.equals("Set Salary")) {
            setSalary();
        }

         if (command.equals("Set Weekly Fractional Hours")) {
         setWeeklyHours();
         }

         if (command.equals("Full Time Staff")) {
         addFullTimeStaff();
         }

         if (command.equals("Number of Working Hours:")) {
         setWorkingHours();
         }

         if (command.equals("Wages Per Hour:")) {
         setWagesPerHour();
         }

         if (command.equals("Set Shifts")) {
             try {
                 String shiftsText = shiftsField.getText();
                 int shifts = Integer.parseInt(shiftsText);
                 System.out.println("Shifts set to: " + shifts);
             } catch (NumberFormatException e) {
                 System.out.println("Invalid input! Please enter a valid number for shifts.");
                 JOptionPane.showMessageDialog(null, "Please enter a valid number for shifts.", "Input Error", JOptionPane.ERROR_MESSAGE);
             }
         }

        if (command.equals("Terminate Part time Staff"))
        {
            terminatePartTimeStaff();
        }

        if (command.equals("Display Number"))
        {
            getDisplayNumber();
        }
    }

    private void setWorkingHours() {

    }

    private void addFullTimeStaff() {

    }

    public String getDesignation()
    {
        String aDesignation = null;
        try {
            if (designationField.getText().isEmpty()) {
                throw new Exception();
            }
            aDesignation = designationField.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Designation is not entered");
        }

        return aDesignation;
    }

    public int getDisplayNumber() {
        int getDisplayNumber = -1;
        try {
            getDisplayNumber = Integer.parseInt(displayNumberField.getText());
        }
        catch(NumberFormatException exception) {
            JOptionPane.showMessageDialog(frame, "Number Format Exception.");
        }
        return getDisplayNumber;
    }

    public void setSalary()
    {
        try {
            String salaryText = salaryField.getText();
            double salary = Double.parseDouble(salaryText); // Convert string to double
            System.out.println("Salary Set: " + salary + "$");

            // Optionally: assign to a staff object or label
            // staff.setSalary(salary);
            // salaryLabel.setText("Salary: " + salary);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid numeric salary.");
            JOptionPane.showMessageDialog(null, "Please enter a valid number for salary.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setWeeklyHours() {
        try {
            String weeklyFractionalHoursText = weeklyFractionalHoursField.getText();
            int weeklyHours = Integer.parseInt(weeklyFractionalHoursText);
            System.out.println("Weekly Fractional Hours: " + weeklyHours + " Hours");

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid value for hours.");
            JOptionPane.showMessageDialog(null, "Please enter a valid number for hours.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setWagesPerHour() {
        try {
            String wagesText = wagesPerHourField.getText();
            double wages = Double.parseDouble(wagesText);
            System.out.println("Wages per hour set to: " + wages + "$");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number for wages per hour.");
            JOptionPane.showMessageDialog(null, "Please enter a valid number for wages per hour.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    public void terminatePartTimeStaff()
    {
    int arrayNumber = getDisplayNumber();
    String name = staffNameField.getText();

    if ( arrayNumber >= Staff.size() || arrayNumber < 0 )
    {
    JOptionPane.showMessageDialog(frame, "Please enter a a valid number from the staff array.");
    }
    else
    {
    StaffHire aStaff = Staff.get(arrayNumber);

    if (aStaff instanceof PartTimeStaffHire) {
    PartTimeStaffHire aPartTimeStaff = (PartTimeStaffHire) aStaff;
    aPartTimeStaff.workTerminate(name);
    }
    }
    }

    public void storeStaff(){
      staffHire.add(new StaffHire( vacancyNumber, designation, jobType, staffName,
             joiningDate, qualification, appointedBy, joined));
    }

    public void listStaff()
    {
    int index = 1;
    for(StaffHire s : staffHire)
    {
    System.out.println(index + ": " + s.getVacancyNumber() +
    "\n" + s.getDesignation() + "\n" + s.getJobType());
    index++;
    }
    }

    private void clearFields() {
        vacancyNumberField.setText("");
        designationField.setText("");
        jobTypeField.setText("");
        staffNameField.setText("");
        joiningDateField.setText("");
        qualificationField.setText("");
        appointedByField.setText("");
        salaryField.setText("");
        weeklyFractionalHoursField.setText("");
        workingHourField.setText("");
        wagesPerHourField.setText("");
        shiftsField.setText("");
        terminatedField.setText("");
        joinedCheckBox.setSelected(false);
    }
}
    private void setShifts() {
        try {
            String shiftsText = shiftsField.getText();
            int shifts = Integer.parseInt(shiftsText);
            System.out.println("Shifts set to: " + shifts);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number for shifts.");
            JOptionPane.showMessageDialog(null, "Please enter a valid number for shifts.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

