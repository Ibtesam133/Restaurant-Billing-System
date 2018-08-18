/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class coneccc  {
    
    public java.sql.Connection con;
    ResultSet rs;
    
    public void Connect(){
        
      try{  
       
     
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        
         con = 
        DriverManager.getConnection
        ("jdbc:sqlserver://localhost:1433;databaseName=SK_bill;username=admin;password=admin");
       
       
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
       
        
    }
    
    
    public void VeiwData(String que){
        
    try{
        
         PreparedStatement st = con.prepareStatement(que);
         rs = st.executeQuery();            
    }
    catch(Exception ex){
        
        System.out.println(ex);
    
    }
        
        
    }
    
    
    public void insertData(String que){
            try{
                    Statement st = con.createStatement();
                    st.execute(que);
            }
            catch(Exception ex){
                System.out.println(ex);
            }
    }
    
    
    public void tableData(String que){
    
        try{
        PreparedStatement st = con.prepareStatement(que);
        rs = st.executeQuery();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
        
    }
    
    
    
    public void jasperReport(String que, String path){
    
            try{
            
                
                
                
            JasperDesign jd = 
            JRXmlLoader.load(path);


            String qu = que;
            JRDesignQuery jq = new JRDesignQuery();
            jq.setText(qu);
            jd.setQuery(jq);

            JasperReport jsp = JasperCompileManager.compileReport(jd);
            JasperPrint prn = JasperFillManager.fillReport(jsp,null,con);
            JasperViewer.viewReport(prn);
            
            }
            
            catch(Exception ex){
             System.out.println(ex);
            }
        
    }
    
}
