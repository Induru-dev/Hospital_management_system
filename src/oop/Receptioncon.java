/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop;
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author A.I.S PERERA
 */
public class Receptioncon extends javax.swing.JFrame {

    /**
     * Creates new form Receptioncon
     */
    public Receptioncon() {
        initComponents();
        setRecordsToTable();
    }

    //create table model
    DefaultTableModel tbm1;

    //method to cheak if all data fiels are filled
    private boolean dataFilled(){
        return !name.getText().isEmpty()&&
                !namewithI.getText().isEmpty()&&
                !nic.getText().isEmpty()&&
                !address.getText().isEmpty()&&
                !email.getText().isEmpty()&&
                !chefcomp.getText().isEmpty();
    }

    //serch method
    public void search(String str){

       tbm1 = (DefaultTableModel) table.getModel();
       TableRowSorter<DefaultTableModel>obj1 = new TableRowSorter<>(tbm1);
       table.setRowSorter(obj1);
       obj1.setRowFilter(RowFilter.regexFilter(str));

    }

    //get records to table
    public void setRecordsToTable(){

        try{

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oopproject","root","");
        Statement stmt=con.createStatement();
        String sql="SElECT*FROM patients";
        ResultSet rs=stmt.executeQuery(sql);


        
        
        while (rs.next()){

            String id=String.valueOf(rs.getInt("P_id"));
            String Name=rs.getString("Name");
            String NamewI=rs.getString("Name_with_initials");
            String Age=String.valueOf(rs.getInt("Age"));
            String NIC=rs.getString("NIC");
            String pno=String.valueOf(rs.getInt("Phone_no"));
            String emaiil=rs.getString("Email");
            String addr=rs.getString("Addreess");
            String allege=rs.getString("Allergies");
            String serg=rs.getString("Surgeries");
            String cc=rs.getString("Chief_complain");
            String gen=rs.getString("Gender");
            String pres=rs.getString("Prescription");
            String mcheck=rs.getString("Med_check");
            String dname=rs.getString("Doc_name");

            String tbData[]={id,Name,NamewI,Age,NIC,pno,emaiil,addr,allege,serg,cc,gen,pres,mcheck,dname};

            tbm1=(DefaultTableModel)table.getModel();

            tbm1.addRow(tbData);


       }

        }
        
        catch(Exception e2){
          System.out.println(e2);
      }
    
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nametext = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        nametext1 = new javax.swing.JLabel();
        namewithI = new javax.swing.JTextField();
        nametext2 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        nametext3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        nametext4 = new javax.swing.JLabel();
        phoneNo = new javax.swing.JTextField();
        nametext5 = new javax.swing.JLabel();
        nic = new javax.swing.JTextField();
        nametext6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        alagiyes = new javax.swing.JCheckBox();
        nametext7 = new javax.swing.JLabel();
        female = new javax.swing.JCheckBox();
        pnts = new javax.swing.JCheckBox();
        nametext8 = new javax.swing.JLabel();
        male = new javax.swing.JCheckBox();
        alagino = new javax.swing.JCheckBox();
        nametext9 = new javax.swing.JLabel();
        seryes = new javax.swing.JCheckBox();
        serno = new javax.swing.JCheckBox();
        nametext10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        chefcomp = new javax.swing.JTextArea();
        nametext11 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        versionText3 = new javax.swing.JLabel();
        plusText3 = new javax.swing.JLabel();
        medlinkText3 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchtextfeild = new javax.swing.JTextField();
        medlinkText4 = new javax.swing.JLabel();
        nametext12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(850, 950));
        jPanel2.setMinimumSize(new java.awt.Dimension(850, 950));

        nametext.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        nametext.setForeground(new java.awt.Color(23, 107, 135));
        nametext.setText("Name");

        name.setFont(new java.awt.Font("Lexend Deca", 0, 12)); // NOI18N

        nametext1.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        nametext1.setForeground(new java.awt.Color(23, 107, 135));
        nametext1.setText("Name with initials");

        namewithI.setFont(new java.awt.Font("Lexend Deca", 0, 12)); // NOI18N

        nametext2.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        nametext2.setForeground(new java.awt.Color(23, 107, 135));
        nametext2.setText("Age");

        age.setFont(new java.awt.Font("Lexend Deca", 0, 12)); // NOI18N

        nametext3.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        nametext3.setForeground(new java.awt.Color(23, 107, 135));
        nametext3.setText("Address");

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        nametext4.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        nametext4.setForeground(new java.awt.Color(23, 107, 135));
        nametext4.setText("Phone NO");

        phoneNo.setFont(new java.awt.Font("Lexend Deca", 0, 12)); // NOI18N

        nametext5.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        nametext5.setForeground(new java.awt.Color(23, 107, 135));
        nametext5.setText("NIC");

        nic.setFont(new java.awt.Font("Lexend Deca", 0, 12)); // NOI18N

        nametext6.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        nametext6.setForeground(new java.awt.Color(23, 107, 135));
        nametext6.setText("E-mail");

        email.setFont(new java.awt.Font("Lexend Deca", 0, 12)); // NOI18N

        alagiyes.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        alagiyes.setForeground(new java.awt.Color(23, 107, 135));
        alagiyes.setText("Yes");

        nametext7.setFont(new java.awt.Font("Lexend Deca Light", 1, 14)); // NOI18N
        nametext7.setForeground(new java.awt.Color(23, 107, 135));
        nametext7.setText("Gender");

        female.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        female.setForeground(new java.awt.Color(23, 107, 135));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        pnts.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        pnts.setForeground(new java.awt.Color(23, 107, 135));
        pnts.setText("Prefer not to say");
        pnts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pntsActionPerformed(evt);
            }
        });

        nametext8.setFont(new java.awt.Font("Lexend Deca Light", 1, 14)); // NOI18N
        nametext8.setForeground(new java.awt.Color(23, 107, 135));
        nametext8.setText("Allergies");

        male.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        male.setForeground(new java.awt.Color(23, 107, 135));
        male.setText("Male");

        alagino.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        alagino.setForeground(new java.awt.Color(23, 107, 135));
        alagino.setText("No");

        nametext9.setFont(new java.awt.Font("Lexend Deca Light", 1, 14)); // NOI18N
        nametext9.setForeground(new java.awt.Color(23, 107, 135));
        nametext9.setText("Surgeries");

        seryes.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        seryes.setForeground(new java.awt.Color(23, 107, 135));
        seryes.setText("Yes");

        serno.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        serno.setForeground(new java.awt.Color(23, 107, 135));
        serno.setText("No");

        nametext10.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        nametext10.setForeground(new java.awt.Color(23, 107, 135));
        nametext10.setText("Chief ");

        chefcomp.setColumns(20);
        chefcomp.setRows(5);
        jScrollPane2.setViewportView(chefcomp);

        nametext11.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        nametext11.setForeground(new java.awt.Color(23, 107, 135));
        nametext11.setText("complain");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nametext11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(nametext10))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(nametext2)
                        .addComponent(nametext3))
                    .addComponent(nametext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnts))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(seryes, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(serno, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nametext8)
                                    .addComponent(alagiyes, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alagino, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nametext9)
                            .addComponent(nametext7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nametext6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nametext1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nametext4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nametext5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(namewithI, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametext)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametext1)
                    .addComponent(namewithI, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametext2)
                    .addComponent(nametext4)
                    .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametext5)
                    .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nametext6))
                        .addGap(38, 38, 38)
                        .addComponent(nametext7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnts, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametext3))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nametext10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nametext11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nametext8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alagiyes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alagino, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(nametext9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seryes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2)))
        );

        kGradientPanel4.setkEndColor(new java.awt.Color(5, 59, 80));
        kGradientPanel4.setkStartColor(new java.awt.Color(23, 107, 135));

        versionText3.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        versionText3.setForeground(new java.awt.Color(100, 204, 197));
        versionText3.setText("v1.0");

        plusText3.setFont(new java.awt.Font("Lexend Deca SemiBold", 0, 24)); // NOI18N
        plusText3.setForeground(new java.awt.Color(238, 238, 238));
        plusText3.setText("Plus");

        medlinkText3.setFont(new java.awt.Font("Lexend Deca SemiBold", 0, 24)); // NOI18N
        medlinkText3.setForeground(new java.awt.Color(100, 204, 197));
        medlinkText3.setText("MediLink");

        backbutton.setBackground(new java.awt.Color(23, 107, 135));
        backbutton.setFont(new java.awt.Font("Lexend Deca SemiBold", 0, 14)); // NOI18N
        backbutton.setForeground(new java.awt.Color(238, 238, 238));
        backbutton.setText("LOG OUT");
        backbutton.setBorder(null);
        backbutton.setContentAreaFilled(false);
        backbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(medlinkText3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plusText3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(versionText3)
                .addGap(406, 406, 406))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(backbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addComponent(medlinkText3)
                .addComponent(plusText3)
                .addComponent(versionText3))
        );

        add.setBackground(new java.awt.Color(23, 107, 135));
        add.setFont(new java.awt.Font("Lexend Deca SemiBold", 0, 24)); // NOI18N
        add.setForeground(new java.awt.Color(238, 238, 238));
        add.setText("ADD");
        add.setBorder(null);
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.setFocusPainted(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(23, 107, 135));
        update.setFont(new java.awt.Font("Lexend Deca SemiBold", 0, 24)); // NOI18N
        update.setForeground(new java.awt.Color(238, 238, 238));
        update.setText("UPDATE");
        update.setBorder(null);
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.setFocusPainted(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(23, 107, 135));
        delete.setFont(new java.awt.Font("Lexend Deca SemiBold", 0, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(238, 238, 238));
        delete.setText("DELETE");
        delete.setBorder(null);
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.setFocusPainted(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Name With Initials", "Age", "NIC", "Phone_no", "Email", "Addreess", "Allergies", "Surgeries", "Chief Complain", "Gender", "Prescription", "Med Check", "Docters Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(30);
        table.setShowGrid(true);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table);

        searchtextfeild.setFont(new java.awt.Font("Lexend Deca", 0, 12)); // NOI18N
        searchtextfeild.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtextfeildKeyReleased(evt);
            }
        });

        medlinkText4.setFont(new java.awt.Font("Lexend Deca", 0, 18)); // NOI18N
        medlinkText4.setForeground(new java.awt.Color(23, 107, 135));
        medlinkText4.setText("Search here:");

        nametext12.setFont(new java.awt.Font("Lexend Deca Light", 0, 12)); // NOI18N
        nametext12.setForeground(new java.awt.Color(23, 107, 135));
        nametext12.setText("Clear");
        nametext12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nametext12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nametext12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nametext12)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(medlinkText4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(searchtextfeild))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nametext12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(medlinkText4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchtextfeild, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void pntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pntsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pntsActionPerformed

    //logoutbutton action
    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        int n=JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?");
        if(n==0){
        new receplogin().setVisible(true);
        dispose();
        }
        else{
            
        }

    }//GEN-LAST:event_backbuttonActionPerformed

    //adding data to data base
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        //cheaking number validations
        try{
            NumberCheak(phoneNo.getText());
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Phone number should be 10 digits and starts with 0");
            phoneNo.setText("");
        }


        //cheaking email validations
        try{
            emailCheak(email.getText());
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Email should have one @ sign");
            email.setText("");
        }



        //set up tick boxes
        String Allerg="";
        String surge="";
        String gend="";

        if(male.isSelected()){
            gend="Male";
        }
        else if(female.isSelected()){
            gend="Female";
        }
        else {
            gend="Prefer not to say";
        }
        

        if(alagiyes.isSelected()){
            Allerg="Yes";
        }
        else{
            Allerg="No";
        }

        if(seryes.isSelected()){
            surge="Yes";
        }
        else{
            surge="No";
        }

        //cheak if all data fiels are filled
        if(dataFilled()){

                //adding data to database
                try{

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oopproject","root","");
                    Statement stmt=con.createStatement();
                    stmt.execute("INSERT INTO patients (Name,Name_with_initials,Age,NIC,Phone_no,Email,Addreess,Allergies,Surgeries,Chief_complain,Gender) VALUES ('"+name.getText()+"','"+namewithI.getText()+"','"+age.getText()+"','"+nic.getText()+"','"+phoneNo.getText()+"','"+email.getText()+"','"+address.getText()+"','"+Allerg+"','"+surge+"','"+chefcomp.getText()+"','"+gend+"')");
                    JOptionPane.showMessageDialog(this, "Data Inserted.");
                    con.close();

                }catch(Exception e){
                    System.out.println(e);
                    JOptionPane.showMessageDialog(null, "Enter correct values to relevent fields");
                }
        }
        else{
                JOptionPane.showMessageDialog(null,"Insert data to all fields!! ");
        }
                tbm1.setRowCount(0);
                setRecordsToTable();

    }//GEN-LAST:event_addActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

//get data from table to textfields
 public int id;
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        id=Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        name.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
        namewithI.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
        age.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
        nic.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
        phoneNo.setText(table.getValueAt(table.getSelectedRow(), 5).toString());
        email.setText(table.getValueAt(table.getSelectedRow(), 6).toString());
        address.setText(table.getValueAt(table.getSelectedRow(), 7).toString());
        chefcomp.setText(table.getValueAt(table.getSelectedRow(), 10).toString());

        String g=table.getValueAt(table.getSelectedRow(), 11).toString();
        if("Male".equals(g)){
            male.setSelected(true);
            female.setSelected(false);
            pnts.setSelected(false);
        }
        else if("Female".equals(g)){
            female.setSelected(true);
            male.setSelected(false);
            pnts.setSelected(false);
        }else{
            pnts.setSelected(true);
            male.setSelected(false);
            female.setSelected(false);
        }

        String al=table.getValueAt(table.getSelectedRow(), 8).toString();
        if("Yes".equals(al)){
            alagiyes.setSelected(true);
            alagino.setSelected(false);
        }
        else{
            alagino.setSelected(true);
            alagiyes.setSelected(false);
        }
        
        String su=table.getValueAt(table.getSelectedRow(), 9).toString();
        if("Yes".equals(su)){
            seryes.setSelected(true);
            serno.setSelected(false);
        }
        else{
            serno.setSelected(true);
            seryes.setSelected(false);
        }

    }//GEN-LAST:event_tableMouseClicked


    //delete record
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oopproject","root","");
        Statement stmt=con.createStatement();

        int n=JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?");
        if(n==0){
            stmt.execute("DELETE FROM patients WHERE P_id ="+id);
            formWindowOpened(null);
            System.out.println("oop.Receptioncon.deleteActionPerformed()");
        }
        else{
            
        }

        }
        catch(Exception e4){
            System.out.println(e4);
        }

        tbm1.setRowCount(0);
        setRecordsToTable();
    }//GEN-LAST:event_deleteActionPerformed

    //search data
    private void searchtextfeildKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtextfeildKeyReleased

        String s = searchtextfeild.getText();
        search(s);
        
    }//GEN-LAST:event_searchtextfeildKeyReleased


    //update record
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        String Allerg="";
        String surge="";
        String gend="";

        if(male.isSelected()){
            gend="Male";
        }
        else if(female.isSelected()){
            gend="Female";
        }
        else if(pnts.isSelected()){
            gend="Prefer not to say";
        }
        else{
            gend="";
        }

        if(alagiyes.isSelected()){
            Allerg="Yes";
        }
        else{
            Allerg="No";
        }

        if(seryes.isSelected()){
            surge="Yes";
        }
        else{
            surge="No";
        }



        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oopproject","root","");
            Statement stmt=con.createStatement();
            stmt.execute("UPDATE patients SET Name='"+name.getText()+"',Name_with_initials='"+namewithI.getText()+"',Age='"+age.getText()+"',NIC='"+nic.getText()+"',Phone_no='"+phoneNo.getText()+"',Email='"+email.getText()+"',Addreess='"+address.getText()+"',Allergies='"+Allerg+"',Surgeries='"+surge+"',Chief_complain='"+chefcomp.getText()+"',Gender='"+gend+"'"
                    + "WHERE P_id ="+id);
            formWindowOpened(null);
            JOptionPane.showMessageDialog(this, "Data Updated.");
            con.close();

        }catch(Exception e){
            System.out.println(e);
        }

        tbm1.setRowCount(0);
        setRecordsToTable();


    }//GEN-LAST:event_updateActionPerformed

    private void nametext12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nametext12MouseClicked
        name.setText("");
        namewithI.setText("");
        age.setText("");
        phoneNo.setText("");
        email.setText("");
        address.setText("");
        email.setText("");
        chefcomp.setText("");
    }//GEN-LAST:event_nametext12MouseClicked

    //number cheaking validation
    public static void NumberCheak(String num)throws EnterVaidations{

        if(num.charAt(0)!=0 && num.length()!=10){
            throw new EnterVaidations("Number should be 10 digits and starts with 0");
        }

    }

    //emailcheak validation
    public static void emailCheak(String email)throws EnterVaidations{

        int count=0;
        for(int i=0;i<email.length();++i){

            if(email.charAt(i)=='@'){
                count++;
            }

        }

        if(count!=1){
            throw new EnterVaidations("Email should only have one @ sign");
        }

    }

    //main method
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receptioncon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField age;
    private javax.swing.JCheckBox alagino;
    private javax.swing.JCheckBox alagiyes;
    private javax.swing.JButton backbutton;
    private javax.swing.JTextArea chefcomp;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JCheckBox female;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JCheckBox male;
    private javax.swing.JLabel medlinkText3;
    private javax.swing.JLabel medlinkText4;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nametext;
    private javax.swing.JLabel nametext1;
    private javax.swing.JLabel nametext10;
    private javax.swing.JLabel nametext11;
    private javax.swing.JLabel nametext12;
    private javax.swing.JLabel nametext2;
    private javax.swing.JLabel nametext3;
    private javax.swing.JLabel nametext4;
    private javax.swing.JLabel nametext5;
    private javax.swing.JLabel nametext6;
    private javax.swing.JLabel nametext7;
    private javax.swing.JLabel nametext8;
    private javax.swing.JLabel nametext9;
    private javax.swing.JTextField namewithI;
    private javax.swing.JTextField nic;
    private javax.swing.JTextField phoneNo;
    private javax.swing.JLabel plusText3;
    private javax.swing.JCheckBox pnts;
    private javax.swing.JTextField searchtextfeild;
    private javax.swing.JCheckBox serno;
    private javax.swing.JCheckBox seryes;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    private javax.swing.JLabel versionText3;
    // End of variables declaration//GEN-END:variables
}