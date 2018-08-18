/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author sony
 */
public class history extends javax.swing.JFrame {

    public String ssd;
    public String eed;
    coneccc cn;
    int dish;
    
    public history() {
        initComponents();
        
        cn = new coneccc();
        cn.Connect();
        cn.VeiwData("select ds_nm from SK_dish");
        try {
        while(cn.rs.next()){
         a.addItem(cn.rs.getString("ds_nm"));
        }
        }
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
        
        
    }
    
    
    public void Dihes(){
     if(a.getSelectedItem().equals("Chicken Biryani")){
        dish = 1;
        }
        else if(a.getSelectedItem().equals("Beef Biryani")){
        dish = 2;
        }
        else if(a.getSelectedItem().equals("Vegetable Biryani")){
        dish = 3;
        }
        else if(a.getSelectedItem().equals("Chicken Karahi")){
        dish = 4;
        }
        else if(a.getSelectedItem().equals("Green Karahi")){
        dish = 5;
        }
        else if(a.getSelectedItem().equals("Beef Karahi")){
        dish = 6;
        }
        else if(a.getSelectedItem().equals("White Karahi")){
        dish = 7;
        }
        else if(a.getSelectedItem().equals("Beef Qorma")){
        dish = 8;
        }
        else if(a.getSelectedItem().equals("Chicken Qorma")){
        dish = 9;
        }
        else if(a.getSelectedItem().equals("Handi")){
        dish = 10;
        }
        else if(a.getSelectedItem().equals("Chiness Rice")){
        dish = 11;
        }
        else if(a.getSelectedItem().equals("Pilao")){
        dish = 12;
        }
        
        
        
        
        else if(a.getSelectedItem().equals("Chicken Burger")){
        dish = 13;
        }
        else if(a.getSelectedItem().equals("Beef Burger")){
        dish = 14;
        }
        else if(a.getSelectedItem().equals("Zinger Burger")){
        dish = 15;
        }
        else if(a.getSelectedItem().equals("Chesse Burger")){
        dish = 16;
        }
        else if(a.getSelectedItem().equals("Club Sandwich")){
        dish = 17;
        }
        else if(a.getSelectedItem().equals("Roast")){
        dish = 18;
        }
        else if(a.getSelectedItem().equals("French Fries")){
        dish = 19;
        }
        else if(a.getSelectedItem().equals("Zinger Roll")){
        dish = 20;
        }
        else if(a.getSelectedItem().equals("Mushrooms Pizza (R)")){
        dish = 21;
        }
        else if(a.getSelectedItem().equals("Mushrooms Pizza (M)")){
        dish = 22;
        }
        else if(a.getSelectedItem().equals("Mushrooms Pizza (L)")){
        dish = 23;
        }
        else if(a.getSelectedItem().equals("Suasage Pizza (R)")){
        dish = 24;
        }
        else if(a.getSelectedItem().equals("Suasage Pizza (M)")){
        dish = 25;
        }
        else if(a.getSelectedItem().equals("Suasage Pizza (L)")){
        dish = 26;
        }
        else if(a.getSelectedItem().equals("BBQ Pizza (R)")){
        dish = 27;
        }
        else if(a.getSelectedItem().equals("BBQ Pizza (M)")){
        dish = 28;
        }
        else if(a.getSelectedItem().equals("BBQ Pizza (L)")){
        dish = 29;
        }
        else if(a.getSelectedItem().equals("Vegetable Pizza (R)")){
        dish = 30;
        }
        else if(a.getSelectedItem().equals("Vegetable Pizza (M)")){
        dish = 31;
        }
        else if(a.getSelectedItem().equals("Vegetable Pizza (L)")){
        dish = 32;
        }
        
        
        
        else if(a.getSelectedItem().equals("Chicken Tikka leg")){
        dish = 33;
        }
        else if(a.getSelectedItem().equals("Chicken Tikka chest")){
        dish = 34;
        }
        else if(a.getSelectedItem().equals("Tikka Boti")){
        dish = 35;
        }
        else if(a.getSelectedItem().equals("Malayi Boti")){
        dish = 36;
        }
        else if(a.getSelectedItem().equals("Charga")){
        dish = 37;
        }
        else if(a.getSelectedItem().equals("Seekh Kabab")){
        dish = 38;
        }
        else if(a.getSelectedItem().equals("Dum Keema")){
        dish = 39;
        }
        else if(a.getSelectedItem().equals("Bihari Boti")){
        dish = 40;
        }
        else if(a.getSelectedItem().equals("Chapli Kabab")){
        dish = 41;
        }
        else if(a.getSelectedItem().equals("Chicken Boti Roll")){
        dish = 42;
        }
        else if(a.getSelectedItem().equals("Beef Boti Roll")){
        dish = 43;
        }
        else if(a.getSelectedItem().equals("Chicken Sajji")){
        dish = 44;
        }
        else if(a.getSelectedItem().equals("Rehmi Kabab")){
        dish = 45;
        }
        
        
        else if(a.getSelectedItem().equals("Single strawbery")){
        dish = 46;
        }
        else if(a.getSelectedItem().equals("Double strawbery")){
        dish = 47;
        }
        else if(a.getSelectedItem().equals("Single Choclate")){
        dish = 48;
        }
        else if(a.getSelectedItem().equals("Double Choclate")){
        dish = 49;
        }
        else if(a.getSelectedItem().equals("Single Vanila")){
        dish = 50;
        }
        else if(a.getSelectedItem().equals("Double Vanila")){
        dish = 51;
        }
        else if(a.getSelectedItem().equals("Single Pista")){
        dish = 52;
        }
        else if(a.getSelectedItem().equals("Double Pista")){
        dish = 53;
        }
        else if(a.getSelectedItem().equals("Rabri")){
        dish = 54;
        }
        else if(a.getSelectedItem().equals("Custurd")){
        dish = 55;
        }
        else if(a.getSelectedItem().equals("Normal Faloda")){
        dish = 56;
        }
        else if(a.getSelectedItem().equals("VIP Faloda")){
        dish = 57;
        }
        else if(a.getSelectedItem().equals("Banana Milkshake")){
        dish = 58;
        }
        else if(a.getSelectedItem().equals("Strawbery Milkshake")){
        dish = 59;
        }
        else if(a.getSelectedItem().equals("Choclate Milkshake")){
        dish = 60;
        }
        else if(a.getSelectedItem().equals("Zarda")){
        dish = 61;
        }
        
        
        
        else if(a.getSelectedItem().equals("7up")){
        dish = 62;
        }
        else if(a.getSelectedItem().equals("Pepsi")){
        dish = 63;
        }
        else if(a.getSelectedItem().equals("Dew")){
        dish = 64;
        }
        else if(a.getSelectedItem().equals("Sting")){
        dish = 65;
        }
        else if(a.getSelectedItem().equals("Tandoori Roti")){
        dish = 66;
        }
        else if(a.getSelectedItem().equals("Milk Roti")){
        dish = 67;
        }
        else if(a.getSelectedItem().equals("Kulche")){
        dish = 68;
        }
        else if(a.getSelectedItem().equals("Chapati")){
        dish = 69;
        }
        else if(a.getSelectedItem().equals("Pori Paratha")){
        dish = 70;
        }
        else if(a.getSelectedItem().equals("Kachori")){
        dish = 71;
        }
        else if(a.getSelectedItem().equals("Salad")){
        dish = 72;
        }
        else if(a.getSelectedItem().equals("Raita")){
        dish = 73;
        }
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sdt = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        edt = new com.toedter.calendar.JDateChooser();
        sd = new javax.swing.JTextField();
        ed = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        a = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        qun = new javax.swing.JTextField();
        amn = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Back = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Starting Date");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));
        jPanel1.add(sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ending Date");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel1.add(edt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));
        jPanel1.add(sd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 110, -1));
        jPanel1.add(ed, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 110, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 90, -1));

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tab);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 600, 390));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ending Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        a.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aItemStateChanged(evt);
            }
        });
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 220, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total of Dish");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Amount of Sale by Dish");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, 20));

        qun.setEditable(false);
        jPanel1.add(qun, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 110, -1));

        amn.setEditable(false);
        jPanel1.add(amn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 110, -1));

        jButton2.setText("test");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 90, -1));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backa.png"))); // NOI18N
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 580));

        jMenu1.setText("File                    ");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("New Recipt");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Print Recipt");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit                    ");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Log Out");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

       

        // System.out.println(Final_Recipt);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        this.hide();
        new Welcome().hide();
        new Login().show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Dihes();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        ssd = sdf.format(sdt.getDate());
        sd.setText(ssd);
        eed = sdf.format(edt.getDate());
        ed.setText(eed);

        
        
        cn = new coneccc();
        cn.Connect();
        cn.tableData("select\n" +
        "CONVERT(varchar(25), e.bil_dte_tym,103) as [Date] , e.bil_nm as [Bill Number],\n" +
        "d.ds_nm as Dish,e.dh_qt as Quantity,\n" +
        "(e.dh_qt*d.ds_pr) as Amount \n" +
        "from SK_esti e \n" +
        "inner join SK_dish d\n" +
        "on e.ds_nm=d.r_id\n" +
        "left join SK_tot t\n" +
        "on \n" +
        "e.bil_nm = t.bil_nm\n" +
        "where (e.bil_dte_tym between '"+sd.getText()+"' and '"+ed.getText()+"')   and e.bil_nm!='null'\n" +
        "AND E.ds_nm="+dish+"\n" +
        "order by e.bil_dte_tym");
        tab.setModel(DbUtils.resultSetToTableModel(cn.rs));
        
          
        
        cn.VeiwData("select\n" +
        "count (d.ds_nm) as qunatity\n" +
        "from SK_esti e \n" +
        "inner join SK_dish d\n" +
        "on e.ds_nm=d.r_id\n" +
        "left join SK_tot t\n" +
        "on \n" +
        "e.bil_nm = t.bil_nm\n" +
         "where (e.bil_dte_tym between '"+sd.getText()+"' and '"+ed.getText()+"')\n" +
        "AND E.ds_nm="+dish+"\n"
        );
        try {
        while(cn.rs.next()){
        qun.setText(cn.rs.getString("qunatity"));
        }
        }
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
        
        
        
        
        
        
        
         cn.VeiwData("select\n" +"\n" +
        "sum (e.dh_qt*d.ds_pr) as Amount \n" +
        "from SK_esti e \n" +
        "inner join SK_dish d\n" +
        "on e.ds_nm=d.r_id\n" +
        "left join SK_tot t\n" +
        "on \n" +
        "e.bil_nm = t.bil_nm\n" +
         "where (e.bil_dte_tym between '"+sd.getText()+"' and '"+ed.getText()+"')\n" +
                "AND E.ds_nm="+dish+"\n"
                );
        try {
        while(cn.rs.next()){
        amn.setText(cn.rs.getString("Amount"));
        }
        }
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
        
        
          Dihes();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        ssd = sdf.format(sdt.getDate());
        sd.setText(ssd);
        eed = sdf.format(edt.getDate());
        ed.setText(eed);
        
        
        
                 //report 
        try{
            
     
            
Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SK_bill;username=admin;password=admin");


JasperDesign jd =  JRXmlLoader.load("C:\\Users\\sony\\Documents\\NetBeansProjects\\Billing Management\\src\\main\\sk.jrxml");

//JasperDesign jd = JRXmlLoader.load("C:\\Users\\sony\\Documents\\NetBeansProjects\\Billing Management\\src\\newReport.jrxml");

String qu = "select \n" +
"qu.[amount toal],qu2.qun,\n" +
"i.res_nm as [Resturant Name],i.res_ph as [Resturant Cell #],i.res_ph2 as [Resturant Phone #],\n" +
"i.res_adr as [Resturant Adress],\n" +
"\n" +
"CONVERT(varchar(25), e.bil_dte_tym,103) as [Date] , e.bil_nm as [Bill Number],\n" +
"d.ds_nm as Dish,e.dh_qt as Quantity,\n" +
"(e.dh_qt*d.ds_pr) as Amount \n" +
"from SK_esti e \n" +
"inner join SK_dish d\n" +
"on e.ds_nm=d.r_id\n" +
"left join SK_info i \n" +
"on i.r_id = 1\n" +
"LEFT OUTER JOIN \n" +
"(\n" +
"select sum(e.dh_qt*d.ds_pr) as [amount toal]\n" +
"from SK_esti e \n" +
"inner join SK_dish d\n" +
"on e.ds_nm=d.r_id\n" +
"where (e.bil_dte_tym between '"+sd.getText()+"' and '"+ed.getText()+"') and e.bil_nm!='null' AND E.ds_nm="+dish+"\n" +
")\n" +
"as qu\n" +
"on d.r_id="+dish+"\n" +
"LEFT OUTER JOIN \n" +
"(\n" +
"select sum(e.dh_qt) as [qun]\n" +
"from SK_esti e \n" +
"inner join SK_dish d\n" +
"on e.ds_nm=d.r_id\n" +
"where (e.bil_dte_tym between '"+sd.getText()+"' and '"+ed.getText()+"') and e.bil_nm!='null' AND E.ds_nm="+dish+"\n" +
")\n" +
"as qu2\n" +
"on d.r_id="+dish+"\n" +
"\n" +
"where (e.bil_dte_tym between '"+sd.getText()+"' and '"+ed.getText()+"')  and e.bil_nm!='null'\n" +
"AND E.ds_nm="+dish+"";
JRDesignQuery jq = new JRDesignQuery();
jq.setText(qu);
jd.setQuery(jq);

JasperReport jsp = JasperCompileManager.compileReport(jd);
JasperPrint prn = JasperFillManager.fillReport(jsp,null,cn);
JasperViewer.viewReport(prn);

        
        }
        
        catch(Exception ex)
        {
                       JOptionPane.showMessageDialog(this, ex);
        }
        
          //report
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        
        
        
      
    }//GEN-LAST:event_aActionPerformed

    private void aItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aItemStateChanged
      
       

        
        
    }//GEN-LAST:event_aItemStateChanged

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
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new history().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JComboBox a;
    private javax.swing.JTextField amn;
    private javax.swing.JTextField ed;
    private com.toedter.calendar.JDateChooser edt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField qun;
    private javax.swing.JTextField sd;
    private com.toedter.calendar.JDateChooser sdt;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables
}
