
package MiniProject;

import chap9.MySQLDB;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JTable;

import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

/**
 * @author LENOVO
 */
public class EmployeeBonus extends javax.swing.JFrame {
    DefaultTableModel model;
    MySQLDB myDB;


    public EmployeeBonus() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        myDB = new MySQLDB();
        loadStudentData();
    }

    void loadStudentData() {
        try {
//            System.out.println("Hello");
            String sql = "SELECT * FROM `employeebonus`";
            ArrayList<Employee> List = myDB.selectQuery2(sql);
            for (Employee i : List
            ) {
                String[] rowData = {String.valueOf(i.getEmployeeId()), i.getName(), i.getSurname(), i.getPosition(), String.valueOf(i.getSalary()), String.valueOf(i.getBonus())};
//                String[] rowData = {id, name, surname};
                model.addRow(rowData);
                jTable1.setModel(model);
            }

        } catch (Exception e) {
            System.out.println("5555555" + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmID = new javax.swing.JTextField();
        txtEmSurname = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBonus = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxPosition = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        dsfds = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        rdoExcel = new javax.swing.JRadioButton();
        rdoPDF = new javax.swing.JRadioButton();
        btnCreate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "ID", "Name", "Surname", "Position", "Salary", "Bonus"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(204, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Profile", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Employee ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Employee Name");

        txtEmName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("surname");

        txtEmID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEmID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmIDKeyTyped(evt);
            }
        });

        txtEmSurname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtEmName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtEmID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(2, 2, 2)
                                                                .addComponent(txtEmSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(56, 56, 56))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(txtEmID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtEmName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(txtEmSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compute Bonus", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Bonus");

        txtSalary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalaryKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Position");

        txtBonus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBonus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBonusKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("บาท");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Salary");

        cbxPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3"}));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(50, 50, 50)
                                                        .addComponent(jLabel5)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtBonus)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel10)))
                                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(cbxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel10)
                                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addContainerGap(80, Short.MAX_VALUE))
        );

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        dsfds.setBackground(new java.awt.Color(204, 255, 51));
        dsfds.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create file", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        dsfds.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Filename & location");

        txtLocation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        txtLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLocationKeyTyped(evt);
            }
        });

        buttonGroup3.add(rdoExcel);
        rdoExcel.setText("ExcelFile");

        buttonGroup3.add(rdoPDF);
        rdoPDF.setText("PDF File");

        btnCreate.setText("Create File");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dsfdsLayout = new javax.swing.GroupLayout(dsfds);
        dsfds.setLayout(dsfdsLayout);
        dsfdsLayout.setHorizontalGroup(
                dsfdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dsfdsLayout.createSequentialGroup()
                                .addGroup(dsfdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(dsfdsLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel20)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCreate))
                                        .addGroup(dsfdsLayout.createSequentialGroup()
                                                .addGap(82, 82, 82)
                                                .addComponent(rdoExcel)
                                                .addGap(57, 57, 57)
                                                .addComponent(rdoPDF)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dsfdsLayout.setVerticalGroup(
                dsfdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dsfdsLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(dsfdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rdoExcel)
                                        .addComponent(rdoPDF))
                                .addGap(29, 29, 29)
                                .addGroup(dsfdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20)
                                        .addComponent(btnCreate))
                                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 148, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(dsfds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnAdd)
                                                        .addComponent(btnDelete)
                                                        .addComponent(btnUpdate)
                                                        .addComponent(btnExit))))
                                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(btnAdd)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDelete)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnUpdate)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnExit))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(dsfds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(86, Short.MAX_VALUE))
        );

        dsfds.getAccessibleContext().setAccessibleName("Input  ");

        pack();
    }// </editor-fold>

    private void txtSalaryKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        String employeeId = txtEmID.getText();
        String name = txtEmName.getText();
        String surname = txtEmSurname.getText();
        String position = (String) cbxPosition.getSelectedItem();
        String salary = txtSalary.getText();
        String bonus = txtBonus.getText();
        if (position == "1") {
            position = "Manager";
            if (Double.parseDouble(salary) >= 1000) {
                double v = Double.parseDouble(salary) * 0.10;
                bonus = "" + v;
                System.out.println(bonus);

            } else {
                double v = Double.parseDouble(salary) * 0.05;
                bonus = "" + v;
                System.out.println(bonus);
            }
            String[] rowData = {employeeId, name, surname, position, salary, bonus};
            String sql = "INSERT INTO `employeebonus`(`employee_id`, `name`, `surname`, `position`, `salary`, `bonus`) VALUES " +
                    "('" + employeeId + "','" + name + "','" + surname + "','" + position + "','" + salary + "','" + bonus + "')";
            int row = myDB.creatUpdateDelete(sql);
            model.addRow(rowData);
            txtBonus.setText(bonus);
            System.out.println(row);
        } else if (position == "2") {
            position = "Assistant Manager";
            if (Double.parseDouble(salary) >= 1000) {
                double v = Double.parseDouble(salary) * 0.20;
                bonus = "" + v;
                System.out.println(bonus);

            } else {
                double v = Double.parseDouble(salary) * 0.15;
                bonus = "" + v;
                System.out.println(bonus);
            }
            String[] rowData = {employeeId, name, surname, position, salary, bonus};
            String sql = "INSERT INTO `employeebonus`(`employee_id`, `name`, `surname`, `position`, `salary`, `bonus`) VALUES " +
                    "('" + employeeId + "','" + name + "','" + surname + "','" + position + "','" + salary + "','" + bonus + "')";
            int row = myDB.creatUpdateDelete(sql);
            model.addRow(rowData);
            txtBonus.setText(bonus);
            System.out.println(row);
        } else if (position == "3") {
            position = "General";
            if (Double.parseDouble(salary) >= 1000) {
                double v = Double.parseDouble(salary) * 0.30;
                bonus = "" + v;
                System.out.println(bonus);

            } else {
                double v = Double.parseDouble(salary) * 0.25;
                bonus = "" + v;
                System.out.println(bonus);
            }
            String[] rowData = {employeeId, name, surname, position, salary, bonus};
            String sql = "INSERT INTO `employeebonus`(`employee_id`, `name`, `surname`, `position`, `salary`, `bonus`) VALUES " +
                    "('" + employeeId + "','" + name + "','" + surname + "','" + position + "','" + salary + "','" + bonus + "')";
            int row = myDB.creatUpdateDelete(sql);
            model.addRow(rowData);
            txtBonus.setText(bonus);
            System.out.println(row);
        }
        clearText();
    }

    private void clearText() {
        txtEmID.setText("");
        txtEmName.setText("");
        txtEmSurname.setText("");
        txtSalary.setText("");
        txtBonus.setText("");
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        int row = jTable1.getSelectedRow();
        String id = jTable1.getValueAt(row, 0).toString();
        String sql = "DELETE FROM EMPLOYEEBONUS WHERE `employee_id` = '" + id + "'";
        int delRow = myDB.creatUpdateDelete(sql);

        if (delRow > 0) {
            model.removeRow(row);
            clearText();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No delete");
        }
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int select = 0;
        if (jTable1.getSelectedRow() >= 0) {
            select = jTable1.getSelectedRow();
            String employeeId = txtEmID.getText();
            String name = txtEmName.getText();
            String surname = txtEmSurname.getText();
            String position = (String) cbxPosition.getSelectedItem();
            String salary = txtSalary.getText();
            String bonus = txtBonus.getText();
            if (position == "1") {
                position = "Manager";
                if (Double.parseDouble(salary) >= 1000) {
                    double v = Double.parseDouble(salary) * 0.10;
                    bonus = "" + v;
                    System.out.println(bonus);

                } else {
                    double v = Double.parseDouble(salary) * 0.05;
                    bonus = "" + v;
                    System.out.println(bonus);
                }
                String sql = "UPDATE `employeebonus` SET `name` = '" + name + "', `surname` = '" + surname + "',`position` = '" + position + "', `salary` = '" + salary + "',`bonus` = '" + bonus + "' WHERE `employeebonus`.`employee_id` = '" + employeeId + "'";
                int row = myDB.creatUpdateDelete(sql);
                if (row > 0) {
                    jTable1.setValueAt(name, select, 1);
                    jTable1.setValueAt(surname, select, 2);
                    jTable1.setValueAt(position, select, 3);
                    jTable1.setValueAt(salary, select, 4);
                    jTable1.setValueAt(bonus, select, 5);
                } else {
                    System.out.println("55555");
                }
            } else if (position == "2") {
                position = "Assistant Manager";
                if (Double.parseDouble(salary) >= 1000) {
                    double v = Double.parseDouble(salary) * 0.20;
                    bonus = "" + v;
                    System.out.println(bonus);

                } else {
                    double v = Double.parseDouble(salary) * 0.15;
                    bonus = "" + v;
                    System.out.println(bonus);
                }
                String sql = "UPDATE `employeebonus` SET `name` = '" + name + "', `surname` = '" + surname + "',`position` = '" + position + "', `salary` = '" + salary + "',`bonus` = '" + bonus + "' WHERE `employeebonus`.`employee_id` = '" + employeeId + "'";
                int Row = myDB.creatUpdateDelete(sql);
                if (Row > 0) {
                    jTable1.setValueAt(name, select, 1);
                    jTable1.setValueAt(surname, select, 2);
                    jTable1.setValueAt(position, select, 3);
                    jTable1.setValueAt(salary, select, 4);
                    jTable1.setValueAt(bonus, select, 5);
                } else {
                    System.out.println(" ");
                }
            } else if (position == "3") {
                position = "General";
                if (Double.parseDouble(salary) >= 1000) {
                    double v = Double.parseDouble(salary) * 0.30;
                    bonus = "" + v;
                    System.out.println(bonus);

                } else {
                    double v = Double.parseDouble(salary) * 0.25;
                    bonus = "" + v;
                    System.out.println(bonus);
                }
                String sql = "UPDATE `employeebonus` SET `name` = '" + name + "', `surname` = '" + surname + "',`position` = '" + position + "', `salary` = '" + salary + "',`bonus` = '" + bonus + "' WHERE `employeebonus`.`employee_id` = '" + employeeId + "'";
                int Row = myDB.creatUpdateDelete(sql);
                if (Row > 0) {
                    jTable1.setValueAt(name, select, 1);
                    jTable1.setValueAt(surname, select, 2);
                    jTable1.setValueAt(position, select, 3);
                    jTable1.setValueAt(salary, select, 4);
                    jTable1.setValueAt(bonus, select, 5);
                } else {
                    System.out.println(" ");
                }
            }
        } else {
            System.out.println(" ");
        }
        clearText();
    }

    private void txtLocationKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
    }

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        int row = jTable1.getSelectedRow();
        if (row >= 0) {
            String employeeId = (String) jTable1.getValueAt(row, 0);
            String name = (String) jTable1.getValueAt(row, 1);
            String surname = (String) jTable1.getValueAt(row, 2);
            String position = (String) jTable1.getValueAt(row, 3);
            String salary = (String) jTable1.getValueAt(row, 4);
            String bonus = (String) jTable1.getValueAt(row, 5);
            txtEmID.setText(employeeId);
            txtEmName.setText(name);
            txtEmSurname.setText(surname);
//            cbxPosition.set(position);
            txtSalary.setText(salary);
            txtBonus.setText(bonus);
        }
    }

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
            Document doc = new Document();
        try {
            String path = "";
            JFileChooser j = new JFileChooser();
            j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int x = j.showSaveDialog(this);
            if (x == JFileChooser.APPROVE_OPTION) {
                path = j.getSelectedFile().getPath();
            }
            PdfWriter.getInstance(doc, new FileOutputStream(path + "kim.pdf"));
            doc.open();
            Paragraph para = new Paragraph("filepdf");
            doc.add(para);
            String sql = "SELECT * FROM `employeebonus`";
            PdfPTable tbl = new PdfPTable(jTable1.getColumnCount());
            ArrayList<Employee> List = myDB.selectQuery2(sql);
            for (Employee i : List
            ) {
                String[] rowData = {String.valueOf(i.getEmployeeId()), i.getName(), i.getSurname(), i.getPosition(), String.valueOf(i.getSalary()), String.valueOf(i.getBonus())};
//                String[] rowData = {id, name, surname};
//                tbl.addCell(String.valueOf(jTable1));//
//                tbl.addCell(Arrays.toString();//
                System.out.println(Arrays.toString(rowData));
//                tbl.addCell(Arrays.toString(rowData));
                tbl.addCell(String.valueOf(i.getEmployeeId()));
                tbl.addCell(i.getName());
                tbl.addCell(i.getName());
                tbl.addCell(i.getPosition());
                tbl.addCell(String.valueOf(i.getSalary()));
                tbl.addCell(String.valueOf(i.getBonus()));

                txtLocation.setText(path);
                System.out.println(path);


            }
            doc.add(tbl);
        } catch (Exception e) {
            System.out.println("what" + e.getMessage());
        }

        doc.close();
    }

    private void txtEmIDKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }

    private void txtBonusKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeBonus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeBonus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeBonus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeBonus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeBonus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cbxPosition;
    private javax.swing.JPanel dsfds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdoExcel;
    private javax.swing.JRadioButton rdoPDF;
    private javax.swing.JTextField txtBonus;
    private javax.swing.JTextField txtEmID;
    private javax.swing.JTextField txtEmName;
    private javax.swing.JTextField txtEmSurname;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration
}
