import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI3 implements ActionListener {
    private final JTextField vacancyNumberField, designationField, jobTypeField, staffNameField, joiningDateField;
    private final JTextField qualificationField, appointedByField, salaryField, weeklyFractionalHoursField;
    private final JTextField wagesPerHourField, shiftsField, workingHourField, terminatedField, displayNumberField;
    private final JCheckBox joinedCheckBox;
    private final JFrame frame;

    private final JButton setSalaryButton, addWeeklyHoursButton, addFullTimeStaffButton;
    private final JButton addWorkingHoursButton, setWagesPerHourButton, setShiftsButton;
    private final JButton terminateButton, addPartTimeStaffButton, displayButton, clearButton;

    private final ArrayList<StaffHire> staffList = new ArrayList<>();

    public GUI3() {
        frame = new JFrame("Staff Hiring System");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 5, 20, 20);

        // General Staff Information Panel
        JPanel leftPanel = new JPanel(new GridLayout(8, 2, 10, 10));
        leftPanel.setBorder(BorderFactory.createTitledBorder("General Staff Information"));

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

        leftPanel.add(new JLabel("Joined:"));
        joinedCheckBox = new JCheckBox();
        leftPanel.add(joinedCheckBox);

        // Right Panel for Employment Details
        JPanel rightPanel = new JPanel(new GridBagLayout());
        rightPanel.setBorder(BorderFactory.createTitledBorder("Employment Details"));
        GridBagConstraints gbd = new GridBagConstraints();
        gbd.insets = new Insets(5, 3, 5, 5);
        gbd.fill = GridBagConstraints.HORIZONTAL;

        // Full-Time Employment Details
        JPanel fullTimePanel = new JPanel(new GridBagLayout());
        fullTimePanel.setBorder(BorderFactory.createTitledBorder("Full Time Employment Details"));

        gbd.gridx = 0; gbd.gridy = 0;
        fullTimePanel.add(new JLabel("Salary:"), gbd);

        gbd.gridx = 1;
        salaryField = new JTextField(15);
        fullTimePanel.add(salaryField, gbd);

        gbd.gridx = 2;
        setSalaryButton = new JButton("Set Salary");
        setSalaryButton.addActionListener(this);
        fullTimePanel.add(setSalaryButton, gbd);

        gbd.gridx = 0; gbd.gridy = 1;
        fullTimePanel.add(new JLabel("Weekly Fractional Hours:"), gbd);

        gbd.gridx = 1;
        weeklyFractionalHoursField = new JTextField(15);
        fullTimePanel.add(weeklyFractionalHoursField, gbd);

        gbd.gridx = 2;
        addWeeklyHoursButton = new JButton("Set Weekly Fractional Hours");
        addWeeklyHoursButton.addActionListener(this);
        fullTimePanel.add(addWeeklyHoursButton, gbd);

        gbd.gridx = 0; gbd.gridy = 3; gbd.gridwidth = 3;
        addFullTimeStaffButton = new JButton("Add Full Time Staff");
        addFullTimeStaffButton.addActionListener(this);
        fullTimePanel.add(addFullTimeStaffButton, gbd);

        // Part-Time Employment Details
        JPanel partTimePanel = new JPanel(new GridBagLayout());
        partTimePanel.setBorder(BorderFactory.createTitledBorder("Part Time Employment Details"));
        GridBagConstraints gbs = new GridBagConstraints();
        gbs.insets = new Insets(5, 3, 5, 5);
        gbs.fill = GridBagConstraints.HORIZONTAL;

        gbs.gridx = 0; gbs.gridy = 0;
        partTimePanel.add(new JLabel("Working Hour:"), gbs);

        gbs.gridx = 1;
        workingHourField = new JTextField(15);
        partTimePanel.add(workingHourField, gbs);

        gbs.gridx = 2;
        addWorkingHoursButton = new JButton("Number of Working Hours:");
        addWorkingHoursButton.addActionListener(this);
        partTimePanel.add(addWorkingHoursButton, gbs);

        gbs.gridx = 0; gbs.gridy = 1;
        partTimePanel.add(new JLabel("Wage Per Hour:"), gbs);

        gbs.gridx = 1;
        wagesPerHourField = new JTextField(15);
        partTimePanel.add(wagesPerHourField, gbs);

        gbs.gridx = 2;
        setWagesPerHourButton = new JButton("Wages Per Hour:");
        setWagesPerHourButton.addActionListener(this);
        partTimePanel.add(setWagesPerHourButton, gbs);

        gbs.gridx = 0; gbs.gridy = 2;
        partTimePanel.add(new JLabel("Shifts:"), gbs);

        gbs.gridx = 1;
        shiftsField = new JTextField(15);
        partTimePanel.add(shiftsField, gbs);

        gbs.gridx = 2;
        setShiftsButton = new JButton("Set Shifts");
        setShiftsButton.addActionListener(this);
        partTimePanel.add(setShiftsButton, gbs);

        gbs.gridx = 0; gbs.gridy = 3;
        partTimePanel.add(new JLabel("Terminated Number:"), gbs);

        gbs.gridx = 1;
        terminatedField = new JTextField(15);
        partTimePanel.add(terminatedField, gbs);

        gbs.gridx = 2;
        terminateButton = new JButton("Terminate Staff");
        terminateButton.addActionListener(this);
        partTimePanel.add(terminateButton, gbs);

        gbs.gridx = 0; gbs.gridy = 4; gbs.gridwidth = 3;
        addPartTimeStaffButton = new JButton("Add Part Time Staff");
        addPartTimeStaffButton.addActionListener(this);
        partTimePanel.add(addPartTimeStaffButton, gbs);

        // Add Panels to Right Side
        gbd.gridx = 0; gbd.gridy = 0; gbd.gridwidth = 3;
        rightPanel.add(fullTimePanel, gbd);
        gbd.gridy = 1;
        rightPanel.add(partTimePanel, gbd);

        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        displayNumberField = new JTextField(15);
        buttonPanel.add(displayNumberField);

        displayButton = new JButton("Display Details of Staff");
        displayButton.addActionListener(this);
        buttonPanel.add(displayButton);

        clearButton = new JButton("Clear Detail from the Windows");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        // Add to Content Pane
        gbc.gridx = 0; gbc.gridy = 0;
        contentPane.add(leftPanel, gbc);

        gbc.gridx = 1;
        contentPane.add(rightPanel, gbc);

        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 2;
        contentPane.add(buttonPanel, gbc);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GUI3::new);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        switch (command) {
            case "Clear Detail from the Windows":
                clearFields();
                break;
            case "Set Salary":
                setSalary();
                break;
            case "Set Weekly Fractional Hours":
                setWeeklyHours();
                break;
            case "Add Full Time Staff":
                addFullTimeStaff();
                break;
            case "Number of Working Hours:":
                setWorkingHours();
                break;
            case "Wages Per Hour:":
                setWagesPerHour();
                break;
            case "Set Shifts":
                setShifts();
                break;
            case "Terminate Staff":
                terminatePartTimeStaff();
                break;
            case "Add Part Time Staff":
                addPartTimeStaff();
                break;
            case "Display Details of Staff":
                displayStaffDetails();
                break;
            default:
                break;
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
        wagesPerHourField.setText("");
        shiftsField.setText("");
        workingHourField.setText("");
        terminatedField.setText("");
        displayNumberField.setText("");
        joinedCheckBox.setSelected(false);
    }

    private void setSalary() {
        try {
            double salary = Double.parseDouble(salaryField.getText());
            System.out.println("Salary set: " + salary);
            // staffList logic here.
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid number for salary.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setWeeklyHours() {
        try {
            int weeklyHours = Integer.parseInt(weeklyFractionalHoursField.getText());
            System.out.println("Weekly Hours set: " + weeklyHours);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid number for weekly hours.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addFullTimeStaff() {
        // Placeholder: implement your object creation here.
        System.out.println("Full Time Staff added!");
    }

    private void setWorkingHours() {
        try {
            int hours = Integer.parseInt(workingHourField.getText());
            System.out.println("Working Hours set: " + hours);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter valid working hours.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setWagesPerHour() {
        try {
            double wage = Double.parseDouble(wagesPerHourField.getText());
            System.out.println("Wage Per Hour set: " + wage);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid wage.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setShifts() {
        try {
            int shifts = Integer.parseInt(shiftsField.getText());
            System.out.println("Shifts set to: " + shifts);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid number for shifts.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void terminatePartTimeStaff() {
        System.out.println("Terminated part-time staff logic here.");
    }

    private void addPartTimeStaff() {
        System.out.println("Part Time Staff added!");
    }

    private void displayStaffDetails() {
        System.out.println("Displaying staff details...");
    }
}