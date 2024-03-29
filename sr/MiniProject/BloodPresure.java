/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MiniProject;

import chap9.MySQLDB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * @author LENOVO
 */
public class BloodPresure extends javax.swing.JFrame {
    DefaultTableModel model;
    MySQLDB myDB;

    /**
     * Creates new form BloodPresure
     */
    public BloodPresure() {
        initComponents();
        model = (DefaultTableModel) tblData.getModel();
        myDB = new MySQLDB();
        loadStudentData();
    }

    void loadStudentData() {
        try {
//            System.out.println("Hello");
            String sql = "SELECT * FROM `blood`";
            ArrayList<MyPatient> List = myDB.selectQuery4(sql);
            for (MyPatient i : List
            ) {
                String[] rowData = {String.valueOf(i.getId()), i.getName(), i.getSurname(), String.valueOf(i.getUpper()), String.valueOf(i.getLower()), i.getDanger(), i.getAdvice()};
//                String[] rowData = {id, name, surname};
                model.addRow(rowData);
                tblData.setModel(model);
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

        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName2 = new javax.swing.JTextField();
        txtSurname2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUpper = new javax.swing.JTextField();
        txtLower = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tarResult = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Customer Profile", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText(" ID :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText(" Name :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setText(" Surname :");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        txtName2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtName2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtName2KeyTyped(evt);
            }
        });

        txtSurname2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtSurname2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSurname2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                        .addComponent(txtName2)
                                        .addComponent(txtSurname2))
                                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(txtSurname2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Anakotmai Bold", 0, 12)); // NOI18N
        jLabel1.setText("วัดวคามดัน");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Customer Profile", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Anakotmai Medium", 1, 16)); // NOI18N
        jLabel7.setText("ค่าบน");

        jLabel8.setFont(new java.awt.Font("Anakotmai Medium", 1, 16)); // NOI18N
        jLabel8.setText("ค่าล่าง");

        txtUpper.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtUpper.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUpperKeyTyped(evt);
            }
        });

        txtLower.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtLower.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLowerKeyTyped(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUpper, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLower, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(txtUpper, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(txtLower, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAdd)
                                        .addComponent(btnClear))
                                .addGap(33, 33, 33))
        );

        tblData.setBackground(new java.awt.Color(213, 247, 213));
        tblData.setFont(new java.awt.Font("Anakotmai Medium", 0, 12)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "ID", "Name ", "Surname", "upper value", "lower value ", "danger", "advice"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnExit1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit1.setText("Exit");
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tarResult.setEditable(false);
        tarResult.setColumns(20);
        tarResult.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tarResult.setRows(5);
        jScrollPane2.setViewportView(tarResult);

        jLabel9.setFont(new java.awt.Font("Anakotmai Medium", 1, 16)); // NOI18N
        jLabel9.setText("ความอันตราย");

        jLabel10.setFont(new java.awt.Font("Anakotmai Medium", 1, 16)); // NOI18N
        jLabel10.setText("ผลของการวัดความดัน/ข้อแนะนำ");

        lblResult.setFont(new java.awt.Font("Anakotmai Medium", 1, 16)); // NOI18N
        lblResult.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(338, 338, 338)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(45, 45, 45)
                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.LEADING))))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(35, 35, 35)
                                                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(92, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(433, Short.MAX_VALUE)
                                        .addComponent(jLabel10)
                                        .addGap(359, 359, 359)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnDelete)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnUpdate)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnExit1))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(94, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(544, Short.MAX_VALUE)
                                        .addComponent(jLabel10)
                                        .addGap(249, 249, 249)))
        );

        pack();
    }// </editor-fold>

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }

    private void txtName2KeyTyped(java.awt.event.KeyEvent evt) {

    }

    private void txtSurname2KeyTyped(java.awt.event.KeyEvent evt) {

    }

    private void txtUpperKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
    }

    private void txtLowerKeyTyped(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
    }

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {
        int row = tblData.getSelectedRow();
        if (row >= 0) {
            String id = (String) tblData.getValueAt(row, 0);
            String name = (String) tblData.getValueAt(row, 1);
            String surname = (String) tblData.getValueAt(row, 2);
            String upper = (String) tblData.getValueAt(row, 3);
            String lower = (String) tblData.getValueAt(row, 4);
            String danger = (String) tblData.getValueAt(row, 5);
            String advice = (String) tblData.getValueAt(row, 6);
            txtId.setText(id);
            txtName2.setText(name);
            txtSurname2.setText(surname);
            txtUpper.setText(upper);
            txtLower.setText(lower);
            tarResult.setText(advice);
            switch (danger) {
                case "ปกติ":
                    lblResult.setText(danger);

                    lblResult.setBackground(Color.GREEN);
                    break;
                case "ค่อนข้างสูง":
                    lblResult.setText(danger);

                    lblResult.setBackground(Color.YELLOW);
                    break;
                case "สูง":
                    lblResult.setText(danger);

                    lblResult.setBackground(Color.PINK);
                    break;
                case "สูงมาก":
                    lblResult.setText(danger);

                    lblResult.setBackground(Color.RED);
                    break;
            }
        }

    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        String id = txtId.getText(), name = txtName2.getText(), surname = txtSurname2.getText(), danger = "", advice = "";
        String upper = txtUpper.getText();
        String lower = txtLower.getText();
        if (upper.length() > 0 && lower.length() > 0 && id.length() > 0 && surname.length() > 0 && name.length() > 0) {
            int upper1 = Integer.parseInt(upper);
            int lower1 = Integer.parseInt(lower);
            if (upper1 < 120 && lower1 < 80) {
                danger = "ปกติ";
                advice = "ตรวจเช็คความดันโลหิตสม่ำเสมอ";
                lblResult.setText(danger);
                lblResult.setBackground(Color.GREEN);
                tarResult.setText(advice);
            } else if ((upper1 >= 120 && upper1 <= 139) || (lower1 >= 80 && lower1 <= 89)) {
                danger = "ค่อนข้างสูง";
                advice = "ปรึกษาแพทย์";
                lblResult.setText(danger);
                lblResult.setBackground(Color.YELLOW);
                tarResult.setText(advice);

            } else if ((upper1 >= 140 && upper1 <= 159) || (lower1 >= 90 && lower1 <= 99)) {
                danger = "สูง";
                advice = "พบแพทย์";
                lblResult.setText(danger);
                lblResult.setBackground(Color.PINK);
                tarResult.setText(advice);

            } else if (upper1 >= 160 || lower1 >= 100) {
                danger = "สูงมาก";
                advice = "พบแพทย์ด่วน";
                lblResult.setText(danger);
                lblResult.setBackground(Color.RED);
                tarResult.setText(advice);

            } else {
//                lblResult.setText("สูงมาก");
//                lblResult.setBackground(Color.RED);
//                txtResult.setText("พบแพทย์ด่วน");
            }
            String[] rowData = {id, name, surname, upper, lower, danger, advice};
            model.addRow(rowData);
            String sql = "INSERT INTO `blood`(`id`, `name`, `surname`, `upper`, `lower`, `danger`, `advice`) VALUES " +
                    "('" + id + "','" + name + "','" + surname + "','" + upper + "','" + lower + "','" + danger + "','" + advice + "')";
            int row = myDB.creatUpdateDelete(sql);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please complete the information first.");

        }
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        int select = 0;
        String id, name, surname, upper, lower, danger, advice;
        if (tblData.getSelectedRow() >= 0) {
            select = tblData.getSelectedRow();
            id = tblData.getValueAt(select, 0).toString();
            name = txtName2.getText();
            surname = txtSurname2.getText();
            danger = "";
            advice = "";
            upper = txtUpper.getText();
            lower = txtLower.getText();
            if (upper.length() > 0 && lower.length() > 0 && id.length() > 0 && surname.length() > 0 && name.length() > 0) {
                int upper1 = Integer.parseInt(upper);
                int lower1 = Integer.parseInt(lower);
                if (upper1 < 120 && lower1 < 80) {
                    danger = "ปกติ";
                    advice = "ตรวจเช็คความดันโลหิตสม่ำเสมอ";
                    lblResult.setText(danger);
                    lblResult.setBackground(Color.GREEN);
                    tarResult.setText(advice);
                    String sql = "UPDATE `blood` SET `name` = '" + name + "', `surname` = '" + surname + "',`upper` = '" + upper + "', `lower` = '" + lower + "',`danger` = '" + danger + "', `advice` = '" + advice + "' WHERE `blood`.`id` = '" + id + "'";
                    int Row = myDB.creatUpdateDelete(sql);
                    if (Row > 0) {
                        tblData.setValueAt(name, select, 1);
                        tblData.setValueAt(surname, select, 2);
                        tblData.setValueAt(upper, select, 3);
                        tblData.setValueAt(lower, select, 4);
                        tblData.setValueAt(upper, select, 5);
                        tblData.setValueAt(danger, select, 6);
                        tblData.setValueAt(advice, select, 7);
                    } else {
                        System.out.println(Row);
                    }
                } else if ((upper1 >= 120 && upper1 <= 139) || (lower1 >= 80 && lower1 <= 89)) {
                    danger = "ค่อนข้างสูง";
                    advice = "ปรึกษาแพทย์";
                    lblResult.setText(danger);
                    lblResult.setBackground(Color.YELLOW);
                    tarResult.setText(advice);
                    String sql = "UPDATE `blood` SET `name` = '" + name + "', `surname` = '" + surname + "',`upper` = '" + upper + "', `lower` = '" + lower + "',`danger` = '" + danger + "', `advice` = '" + advice + "' WHERE `blood`.`id` = '" + id + "'";
                    int Row = myDB.creatUpdateDelete(sql);
                    if (Row > 0) {
                        tblData.setValueAt(name, select, 1);
                        tblData.setValueAt(surname, select, 2);
                        tblData.setValueAt(upper, select, 3);
                        tblData.setValueAt(lower, select, 4);
                        tblData.setValueAt(danger, select, 5);
                        tblData.setValueAt(advice, select, 6);
                    } else {
                        System.out.println(Row);
                    }
                } else if ((upper1 >= 140 && upper1 <= 159) || (lower1 >= 90 && lower1 <= 99)) {
                    danger = "สูง";
                    advice = "พบแพทย์";
                    lblResult.setText(danger);
                    lblResult.setBackground(Color.PINK);
                    tarResult.setText(advice);
                    String sql = "UPDATE `blood` SET `name` = '" + name + "', `surname` = '" + surname + "',`upper` = '" + upper + "', `lower` = '" + lower + "',`danger` = '" + danger + "', `advice` = '" + advice + "' WHERE `blood`.`id` = '" + id + "'";
                    int Row = myDB.creatUpdateDelete(sql);
                    if (Row > 0) {
                        tblData.setValueAt(name, select, 1);
                        tblData.setValueAt(surname, select, 2);
                        tblData.setValueAt(upper, select, 3);
                        tblData.setValueAt(lower, select, 4);
                        tblData.setValueAt(upper, select, 5);
                        tblData.setValueAt(danger, select, 6);
                        tblData.setValueAt(advice, select, 7);
                    } else {
                        System.out.println(Row);
                    }
                } else if (upper1 >= 160 || lower1 >= 100) {
                    danger = "สูงมาก";
                    advice = "พบแพทย์ด่วน";
                    lblResult.setText(danger);
                    lblResult.setBackground(Color.RED);
                    tarResult.setText(advice);
                    String sql = "UPDATE `blood` SET `name` = '" + name + "', `surname` = '" + surname + "',`upper` = '" + upper + "', `lower` = '" + lower + "',`danger` = '" + danger + "', `advice` = '" + advice + "' WHERE `blood`.`id` = '" + id + "'";
                    int Row = myDB.creatUpdateDelete(sql);
                    if (Row > 0) {
                        tblData.setValueAt(name, select, 1);
                        tblData.setValueAt(surname, select, 2);
                        tblData.setValueAt(upper, select, 3);
                        tblData.setValueAt(lower, select, 4);
                        tblData.setValueAt(upper, select, 5);
                        tblData.setValueAt(danger, select, 6);
                        tblData.setValueAt(advice, select, 7);
                    } else {
                        System.out.println(Row);
                    }
                } else {
//                lblResult.setText("สูงมาก");
//                lblResult.setBackground(Color.RED);
//                txtResult.setText("พบแพทย์ด่วน");
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Please complete the information first.");

            }
        } else {
            System.out.println("");
        }


    }

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {
        txtLower.setText("");
        txtUpper.setText("");
        txtName2.setText("");
        txtSurname2.setText("");
        txtId.setText("");
        tarResult.setText("");
        lblResult.setText("");
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        int row = tblData.getSelectedRow();
        String id = tblData.getValueAt(row, 0).toString();
        String sql = "DELETE FROM blood WHERE `id` = '" + id + "'";
        int delRow = myDB.creatUpdateDelete(sql);

        if (delRow > 0) {
            model.removeRow(row);
//            clearText();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No delete");
        }
    }

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {

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
            java.util.logging.Logger.getLogger(BloodPresure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodPresure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodPresure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodPresure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodPresure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextArea tarResult;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLower;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtSurname2;
    private javax.swing.JTextField txtUpper;
    // End of variables declaration
}
