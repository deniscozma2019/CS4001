import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;

public class GUI3 implements ActionListener {
    private JTextField vacancyNumberField, designationField, jobTypeField, staffNameField, joiningDateField, qualificationField, appointedByField;
    private JTextField salaryField, weeklyFractionalHoursField;
    private JTextField wagesPerHourField, displayNumberField, shiftsField, workingHourField, terminatedField;
    private JCheckBox joinedCheckBox;
    private JButton addFullTimeButton, addWorkingHoursButton, addWeeklyFractionalHoursButton, setWagesPerHourButton, addPartTimeButton, setSalaryButton, setShiftsButton, terminateButton, displayButton, clearButton;
    private JFrame frame;
    private JTextArea displayArea;
    private JScrollPane scrollPane;


    private JComboBox shiftsVariety;
    private JTextField displayFild;
    private ArrayList <StaffHire> staffList;

    public GUI3() {

        staffList= new ArrayList<StaffHire>();

        frame = new JFrame("Staff Hiring System");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(30, 30, 30, 30);

        // Panel for the first column (General Staff Information)
        JPanel leftPanel = new JPanel(new GridLayout(10, 10, 10, 10));

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

        leftPanel.add(new JLabel("Joined"));
        joinedCheckBox = new JCheckBox();
        leftPanel.add(joinedCheckBox);

        // Building the Panels No2
        JPanel rightPanel = new JPanel(new GridBagLayout());
        rightPanel.setBorder(BorderFactory.createTitledBorder("Employment Details"));

        GridBagConstraints gbd = new GridBagConstraints();
        gbd.insets = new Insets(5, 5, 5, 5);
        gbd.fill = GridBagConstraints.HORIZONTAL;

        // Full-Time Panel
        JPanel fullTimePanel = new JPanel(new GridBagLayout());
        fullTimePanel.setBorder(BorderFactory.createTitledBorder("Full Time Employment Details"));

        gbd.gridx = 0;
        gbd.gridy = 0;
        fullTimePanel.add(new JLabel("Weekly Fractional Hours:"), gbd);

        gbd.gridx = 1;
        weeklyFractionalHoursField = new JTextField(15);
        fullTimePanel.add(weeklyFractionalHoursField, gbd);

        gbd.gridx = 0;
        gbd.gridy = 1;
        fullTimePanel.add(new JLabel("Salary:"), gbd);

        gbd.gridx = 1;
        salaryField = new JTextField(15);
        fullTimePanel.add(salaryField, gbd);

        gbd.gridx = 2;
        JButton setSalaryButton = new JButton("Set Salary");
        fullTimePanel.add(setSalaryButton, gbd);
        setSalaryButton.addActionListener(this);

        gbd.gridx = 1;
        gbd.gridy = 3;
        gbd.gridwidth = 1;
        JButton addFullTimeStaffButton = new JButton("Add Full Time Staff");
        fullTimePanel.add(addFullTimeStaffButton, gbd);
        addFullTimeStaffButton.addActionListener(this);

        // Part-Time Panel
        JPanel partTimePanel = new JPanel(new GridBagLayout());
        partTimePanel.setBorder(BorderFactory.createTitledBorder("Part Time Employment Details"));

        GridBagConstraints gbs = new GridBagConstraints();
        gbs.insets = new Insets(5, 5, 5, 5);
        gbs.fill = GridBagConstraints.HORIZONTAL;

        gbs.gridx = 0;
        gbs.gridy = 0;
        partTimePanel.add(new JLabel("Working Hour:"), gbs);

        gbs.gridx = 1;
        workingHourField = new JTextField(15);
        partTimePanel.add(workingHourField, gbs);

        gbs.gridx = 0;
        gbs.gridy = 1;
        partTimePanel.add(new JLabel("Wage Per Hour:"), gbs);

        gbs.gridx = 1;
        wagesPerHourField = new JTextField(15);
        partTimePanel.add(wagesPerHourField, gbs);

        gbs.gridx = 0;
        gbs.gridy = 2;
        partTimePanel.add(new JLabel("Shifts:"), gbs);

        // Create JComboBox
        String[] shift = {"08:00-11:00", "11:00-14:00", "14:00-17:00"};
        shiftsVariety = new JComboBox<>(shift);

        // Add JComboBox to panel
        gbs.gridx = 1;  // Shift
        partTimePanel.add(shiftsVariety, gbs);

        gbs.gridx = 1;
        gbs.gridy = 3;
        gbs.gridwidth = 1;
        JButton addPartTimeStaffButton = new JButton(" Add Part Time Staff");
        partTimePanel.add(addPartTimeStaffButton, gbs);

        gbs.gridx = 0;
        gbs.gridy = 4;
        partTimePanel.add(new JLabel("Terminate Number:"), gbs);

        gbs.gridx = 1;
        terminatedField = new JTextField(10);
        partTimePanel.add(terminatedField, gbs);

        gbs.gridx = 2;
        JButton terminateButton = new JButton("Terminate");
        partTimePanel.add(terminateButton, gbs);

        //Adding Right Panels
        gbd.gridx = 0;
        gbd.gridy = 0;
        gbd.gridwidth = 3;
        rightPanel.add(fullTimePanel, gbd);

        gbs.gridy = 1;
        gbs.gridwidth = 3;
        rightPanel.add(partTimePanel, gbs);

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setBorder(BorderFactory.createTitledBorder("Display & Cleanup Operations"));
        GridBagConstraints gbm = new GridBagConstraints();
        gbm.insets = new Insets(5, 5, 5, 5);
        gbm.fill = GridBagConstraints.HORIZONTAL;

        //contentPane.add(buttonPanel,gbm);

        gbm.gridx = 0;
        gbm.gridy = 0;
        buttonPanel.add(new JLabel("Id Number:"), gbm);

        gbm.gridx = 1;
        displayNumberField = new JTextField(15);
        buttonPanel.add(displayNumberField);

        gbm.gridx = 2;
        displayButton = new JButton("Display Details");
        buttonPanel.add(displayButton,gbm);
        displayButton.addActionListener(this);

        gbm.gridx = 1;
        gbm.gridy = 1;
        gbm.gridwidth = 1;
        clearButton = new JButton("Clean Fields");
        buttonPanel.add(clearButton,gbm);
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


        displayArea = new JTextArea();
        displayArea.setEditable(false); // să nu poată fi editat
        displayArea.setBounds(20, 550, 600, 200); // Ajustează dimensiunile și poziția după nevoie

        scrollPane = new JScrollPane(displayArea);
        scrollPane.setBounds(20, 550, 600, 200);
        frame.getContentPane().add(scrollPane);


        JButton displayButton = new JButton("Display Staff");
        displayButton.setBounds(650, 550, 150, 30);
        frame.getContentPane().add(displayButton);

// Adaugă acțiunea butonului
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayStaffList();
            }
        });

    }

    public void displayStaffList() {
        displayArea.setText(""); // Golește înainte să afișeze
        for (StaffHire staff : staffList) {
            displayArea.append("==============================\n");
            if (staff instanceof FullTimeStaffHire) {
                FullTimeStaffHire fullTime = (FullTimeStaffHire) staff;
                displayArea.append("Full-Time Staff\n");
                displayArea.append("Vacancy Number: " + fullTime.getVacancyNumber() + "\n");
                displayArea.append("Designation: " + fullTime.getDesignation() + "\n");
                displayArea.append("Job Type: " + fullTime.getJobType() + "\n");
                displayArea.append("Salary: " + fullTime.getSalary() + "\n");
                displayArea.append("Weekly Hours: " + fullTime.getWeeklyHours() + "\n");
                if (fullTime.isJoined()) {
                    displayArea.append("Staff Name: " + fullTime.getStaffName() + "\n");
                    displayArea.append("Joining Date: " + fullTime.getJoiningDate() + "\n");
                    displayArea.append("Qualification: " + fullTime.getQualification() + "\n");
                    displayArea.append("Appointed By: " + fullTime.getAppointedBy() + "\n");
                }
            } else if (staff instanceof PartTimeStaffHire) {
                PartTimeStaffHire partTime = (PartTimeStaffHire) staff;
                displayArea.append("Part-Time Staff\n");
                displayArea.append("Vacancy Number: " + partTime.getVacancyNumber() + "\n");
                displayArea.append("Designation: " + partTime.getDesignation() + "\n");
                displayArea.append("Job Type: " + partTime.getJobType() + "\n");
                displayArea.append("Working Hour: " + partTime.getWorkingHour() + "\n");
                displayArea.append("Wages per Hour: " + partTime.getWagesPerHour() + "\n");
                displayArea.append("Shift: " + partTime.getShifts() + "\n");
                if (partTime.isJoined()) {
                    displayArea.append("Staff Name: " + partTime.getStaffName() + "\n");
                    displayArea.append("Joining Date: " + partTime.getJoiningDate() + "\n");
                    displayArea.append("Qualification: " + partTime.getQualification() + "\n");
                    displayArea.append("Appointed By: " + partTime.getAppointedBy() + "\n");
                }
                if (partTime.isTerminated()) {
                    displayArea.append("Status: Terminated\n");
                } else {
                    displayArea.append("Status: Active\n");
                }
            }
            displayArea.append("==============================\n\n");
        }

        if (staffList.isEmpty()) {
            displayArea.setText("No staff to display.");
        }
    }


    public static void main(String[] args)
    {
        new GUI3();
    }

    public void actionPerformed(ActionEvent event)
    {
        String command = event.getActionCommand();
        if (command.equals("Clean Fields")) {
            clearFields();
        }

        if (command.equals("Set Salary")) {
            setSalary();
        }
        if (command.equals("Add Full Time Staff")) {
            addFullTimeStaff();
        }

        if (command.equals("Add Part Time Staff")) {
            addPartTimeStaff();
        }

        if (command.equals("Terminate")) {
            terminatePartTimeStaff();
        }


        if (command.equals("Full Time Staff")) {
            addFullTimeStaff();
        }

        if (command.equals("Display Details"))
        {
            getDisplayNumber();
        }
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





    public void addFullTimeStaff() {
        try {
            int vacancyNumber = Integer.parseInt(vacancyNumberField.getText());
            String designation = designationField.getText();
            String jobType = jobTypeField.getText();
            int salary = Integer.parseInt(salaryField.getText());
            int weeklyHours = Integer.parseInt(weeklyFractionalHoursField.getText());

            FullTimeStaffHire fullTime = new FullTimeStaffHire(vacancyNumber, designation, jobType, salary, weeklyHours);

            if (joinedCheckBox.isSelected()) {
                String staffName = staffNameField.getText();
                String joiningDate = joiningDateField.getText();
                String qualification = qualificationField.getText();
                String appointedBy = appointedByField.getText();
                fullTime.hireFullTimeStaff(staffName, joiningDate, qualification, appointedBy);
            }

            staffList.add(fullTime);
            JOptionPane.showMessageDialog(frame, "Full Time Staff Added Successfully.");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid number format in fields!");
        }
    }

    public void addPartTimeStaff() {
        try {
            int vacancyNumber = Integer.parseInt(vacancyNumberField.getText());
            String designation = designationField.getText();
            String jobType = jobTypeField.getText();
            int workingHour = Integer.parseInt(workingHourField.getText());
            int wagesPerHour = Integer.parseInt(wagesPerHourField.getText());
            String shifts = (String) shiftsVariety.getSelectedItem();

            PartTimeStaffHire partTime = new PartTimeStaffHire(vacancyNumber, designation, jobType, workingHour, wagesPerHour, shifts);

            if (joinedCheckBox.isSelected()) {
                String staffName = staffNameField.getText();
                String joiningDate = joiningDateField.getText();
                String qualification = qualificationField.getText();
                String appointedBy = appointedByField.getText();
                partTime.hirePartTimeStaff(staffName, joiningDate, qualification, appointedBy);
            }

            staffList.add(partTime);
            JOptionPane.showMessageDialog(frame, "Part Time Staff Added Successfully.");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid number format in fields!");
        }
    }

    public void terminatePartTimeStaff() {
        try {
            int vacancyNumber = Integer.parseInt(terminatedField.getText());
            boolean found = false;

            for (StaffHire staff : staffList) {
                if (staff instanceof PartTimeStaffHire) {
                    PartTimeStaffHire partTime = (PartTimeStaffHire) staff;
                    if (partTime.getVacancyNumber() == vacancyNumber) {
                        partTime.terminateStaff();
                        JOptionPane.showMessageDialog(frame, "Staff Terminated Successfully.");
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(frame, "No Part Time Staff Found with the given Vacancy Number.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid Number Format!");
        }
    }

    public void clearFields() {
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
        workingHourField.setText("");
        terminatedField.setText("");
        displayNumberField.setText("");
        joinedCheckBox.setSelected(false);
    }







}