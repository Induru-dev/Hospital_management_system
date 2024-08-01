/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop;
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
public class phamcon extends javax.swing.JFrame {

    /**
     * Creates new form Receptioncon
     */
    public phamcon() {
        initComponents();
        setRecordsToDocTable();
    }

    DefaultTableModel tbm1;

    public void search(String str){

       tbm1 = (DefaultTableModel) table.getModel();
       TableRowSorter<DefaultTableModel>obj1 = new TableRowSorter<>(tbm1);
       table.setRowSorter(obj1);
       obj1.setRowFilter(RowFilter.regexFilter(str));

    }

    public void setRecordsToDocTable(){

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
            //String Age=String.valueOf(rs.getInt("Age"));
            //String NIC=rs.getString("NIC");
            //String pno=String.valueOf(rs.getInt("Phone_no"));
            //String emaiil=rs.getString("Email");
            //String addr=rs.getString("Addreess");
            String allege=rs.getString("Allergies");
            String serg=rs.getString("Surgeries");
            String cc=rs.getString("Chief_complain");
            //String gen=rs.getString("Gender");
            String pres=rs.getString("Prescription");
            String mcheck=rs.getString("Med_check");

            String tbData[]={id,Name,NamewI,allege,serg,cc,pres,mcheck};

            tbm1=(DefaultTableModel)table.getModel();

            tbm1.addRow(tbData);


       }


        }
        catch(Exception e2){
          System.out.println(e2);
      }

    }

    /*public void refresh(){

        DefaultTableModel tbm=(DefaultTableModel)table.getModel();
        tbm.setRowCount(0);
        tbm.fireTableDataChanged();

    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nametext = new javax.swing.JLabel();
        nametext1 = new javax.swing.JLabel();
        alagiyes = new javax.swing.JCheckBox();
        nametext8 = new javax.swing.JLabel();
        alagino = new javax.swing.JCheckBox();
        nametext9 = new javax.swing.JLabel();
        seryes = new javax.swing.JCheckBox();
        serno = new javax.swing.JCheckBox();
        nametext10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        chefcomp = new javax.swing.JTextArea();
        nametext11 = new javax.swing.JLabel();
        nwi = new javax.swing.JLabel();
        nameoutput = new javax.swing.JLabel();
        ccoutput = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        versionText3 = new javax.swing.JLabel();
        plusText3 = new javax.swing.JLabel();
        medlinkText3 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchtextfeild = new javax.swing.JTextField();
        medlinkText4 = new javax.swing.JLabel();
        nametext12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        prescription = new javax.swing.JTextArea();
        update = new javax.swing.JButton();
        nametext13 = new javax.swing.JLabel();
        medIssudYes = new javax.swing.JCheckBox();
        medIssudNo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setMaximumSize(new java.awt.Dimension(850, 950));
        jPanel2.setMinimumSize(new java.awt.Dimension(850, 950));

        nametext.setFont(new java.awt.Font("Lexend Deca Light", 1, 14)); // NOI18N
        nametext.setForeground(new java.awt.Color(23, 107, 135));
        nametext.setText("Name:");

        nametext1.setFont(new java.awt.Font("Lexend Deca Light", 1, 14)); // NOI18N
        nametext1.setForeground(new java.awt.Color(23, 107, 135));
        nametext1.setText("Name with initials:");

        alagiyes.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        alagiyes.setForeground(new java.awt.Color(23, 107, 135));
        alagiyes.setText("Yes");
        alagiyes.setContentAreaFilled(false);
        alagiyes.setEnabled(false);
        alagiyes.setFocusPainted(false);
        alagiyes.setFocusable(false);
        alagiyes.setRequestFocusEnabled(false);
        alagiyes.setRolloverEnabled(false);
        alagiyes.setVerifyInputWhenFocusTarget(false);

        nametext8.setFont(new java.awt.Font("Lexend Deca Light", 1, 14)); // NOI18N
        nametext8.setForeground(new java.awt.Color(23, 107, 135));
        nametext8.setText("Allergies");

        alagino.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        alagino.setForeground(new java.awt.Color(23, 107, 135));
        alagino.setText("No");
        alagino.setEnabled(false);

        nametext9.setFont(new java.awt.Font("Lexend Deca Light", 1, 14)); // NOI18N
        nametext9.setForeground(new java.awt.Color(23, 107, 135));
        nametext9.setText("Surgeries");

        seryes.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        seryes.setForeground(new java.awt.Color(23, 107, 135));
        seryes.setText("Yes");
        seryes.setEnabled(false);

        serno.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        serno.setForeground(new java.awt.Color(23, 107, 135));
        serno.setText("No");
        serno.setEnabled(false);

        nametext10.setFont(new java.awt.Font("Lexend Deca Light", 1, 14)); // NOI18N
        nametext10.setForeground(new java.awt.Color(23, 107, 135));
        nametext10.setText("Chief: ");

        chefcomp.setColumns(20);
        chefcomp.setRows(5);
        chefcomp.setBorder(null);
        chefcomp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chefcomp.setEnabled(false);
        chefcomp.setFocusable(false);
        chefcomp.setHighlighter(null);
        jScrollPane2.setViewportView(chefcomp);

        nametext11.setFont(new java.awt.Font("Lexend Deca Light", 1, 14)); // NOI18N
        nametext11.setForeground(new java.awt.Color(23, 107, 135));
        nametext11.setText("complain");

        nwi.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        nwi.setForeground(new java.awt.Color(23, 107, 135));
        nwi.setText("                                     ");

        nameoutput.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        nameoutput.setForeground(new java.awt.Color(23, 107, 135));

        ccoutput.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        ccoutput.setForeground(new java.awt.Color(23, 107, 135));
        ccoutput.setText("                                                          ");

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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(nametext)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameoutput)
                    .addComponent(ccoutput))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(alagiyes, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(alagino, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(nametext1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nwi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nametext9)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(seryes, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(serno, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(119, 119, 119)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nametext8))
                .addGap(235, 235, 235))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametext)
                    .addComponent(nametext1)
                    .addComponent(nameoutput)
                    .addComponent(nwi))
                .addGap(18, 18, 18)
                .addComponent(nametext8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alagiyes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alagino, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nametext9)
                                    .addComponent(nametext10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(seryes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(serno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nametext11)))
                            .addComponent(ccoutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
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

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Name with Initials", "Allergies", "Surgeries", "Cheaf Complain", "Preascription", "Medicine States"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
        searchtextfeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtextfeildActionPerformed(evt);
            }
        });
        searchtextfeild.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtextfeildKeyReleased(evt);
            }
        });

        medlinkText4.setFont(new java.awt.Font("Lexend Deca", 0, 18)); // NOI18N
        medlinkText4.setForeground(new java.awt.Color(23, 107, 135));
        medlinkText4.setText("Search here:");

        nametext12.setFont(new java.awt.Font("Lexend Deca Light", 1, 14)); // NOI18N
        nametext12.setForeground(new java.awt.Color(23, 107, 135));
        nametext12.setText("Prescription");

        prescription.setColumns(20);
        prescription.setFont(new java.awt.Font("Lexend Deca", 0, 12)); // NOI18N
        prescription.setForeground(new java.awt.Color(23, 107, 135));
        prescription.setRows(5);
        prescription.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prescription.setFocusable(false);
        jScrollPane4.setViewportView(prescription);

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

        nametext13.setFont(new java.awt.Font("Lexend Deca Light", 1, 14)); // NOI18N
        nametext13.setForeground(new java.awt.Color(23, 107, 135));
        nametext13.setText("Medicine Issued:");

        medIssudYes.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        medIssudYes.setForeground(new java.awt.Color(23, 107, 135));
        medIssudYes.setText("Yes");
        medIssudYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medIssudYesActionPerformed(evt);
            }
        });

        medIssudNo.setFont(new java.awt.Font("Lexend Deca Light", 0, 14)); // NOI18N
        medIssudNo.setForeground(new java.awt.Color(23, 107, 135));
        medIssudNo.setText("No");
        medIssudNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medIssudNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nametext12)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(medlinkText4)
                                        .addGap(125, 125, 125))
                                    .addComponent(searchtextfeild)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nametext13)
                                    .addComponent(medIssudYes, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(medIssudNo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nametext13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(medIssudYes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(medIssudNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(medlinkText4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(searchtextfeild, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nametext12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed

        int n=JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?");
        if(n==0){
        new Phamlogin().setVisible(true);
        dispose();
        }
        else{

        }
    }//GEN-LAST:event_backbuttonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    
 public int id;
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        id=Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        nameoutput.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
        nwi.setText(table.getValueAt(table.getSelectedRow(), 2).toString());       
        ccoutput.setText(table.getValueAt(table.getSelectedRow(), 5).toString());
        prescription.setText(table.getValueAt(table.getSelectedRow(), 6).toString());

        String mi=table.getValueAt(table.getSelectedRow(), 7).toString();
        if("Yes".equals(mi)){
        medIssudYes.setSelected(true);
        medIssudNo.setSelected(false);
        }
        else{
        medIssudYes.setSelected(false);
        medIssudNo.setSelected(true);
        }


        String al=table.getValueAt(table.getSelectedRow(), 3).toString();
        if("Yes".equals(al)){
            alagiyes.setSelected(true);
            alagino.setSelected(false);
        }
        else{
            alagino.setSelected(true);
            alagiyes.setSelected(false);
        }
        
        String su=table.getValueAt(table.getSelectedRow(), 4).toString();
        if("Yes".equals(su)){
            seryes.setSelected(true);
            serno.setSelected(false);
        }
        else{
            serno.setSelected(true);
            seryes.setSelected(false);
        }

    }//GEN-LAST:event_tableMouseClicked

    private void searchtextfeildKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtextfeildKeyReleased

        String s = searchtextfeild.getText();
        search(s);
        
    }//GEN-LAST:event_searchtextfeildKeyReleased

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        String medIssue="";

        if(medIssudYes.isSelected()){
            medIssue="Yes";
        }
        else{
            medIssue="No";
        }

        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oopproject","root","");
            Statement stmt=con.createStatement();
            stmt.execute("UPDATE patients SET Med_check='"+medIssue+"'"
                    + "WHERE P_id ="+id);
            formWindowOpened(null);
            //JOptionPane.showMessageDialog(this, "Data Updated.");
            con.close();

        }catch(Exception e){
            System.out.println(e);
        }

        medIssudYes.setSelected(false);
        medIssudNo.setSelected(false);

        tbm1.setRowCount(0);
        setRecordsToDocTable();


    }//GEN-LAST:event_updateActionPerformed

    private void searchtextfeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtextfeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtextfeildActionPerformed

    private void medIssudNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medIssudNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medIssudNoActionPerformed

    private void medIssudYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medIssudYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medIssudYesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new phamcon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alagino;
    private javax.swing.JCheckBox alagiyes;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel ccoutput;
    private javax.swing.JTextArea chefcomp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JCheckBox medIssudNo;
    private javax.swing.JCheckBox medIssudYes;
    private javax.swing.JLabel medlinkText3;
    private javax.swing.JLabel medlinkText4;
    private javax.swing.JLabel nameoutput;
    private javax.swing.JLabel nametext;
    private javax.swing.JLabel nametext1;
    private javax.swing.JLabel nametext10;
    private javax.swing.JLabel nametext11;
    private javax.swing.JLabel nametext12;
    private javax.swing.JLabel nametext13;
    private javax.swing.JLabel nametext8;
    private javax.swing.JLabel nametext9;
    private javax.swing.JLabel nwi;
    private javax.swing.JLabel plusText3;
    private javax.swing.JTextArea prescription;
    private javax.swing.JTextField searchtextfeild;
    private javax.swing.JCheckBox serno;
    private javax.swing.JCheckBox seryes;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    private javax.swing.JLabel versionText3;
    // End of variables declaration//GEN-END:variables
}