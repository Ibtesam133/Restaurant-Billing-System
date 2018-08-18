/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author sony
 */
public class Pprice {
    
    
     public String Beef_Biryani_r,Chicken_Tikka_r,Tikka_Boti_r,Chicken_Burger_r,Boti_Roll_r,
     Ice_Creame_S_scope_r,Ice_Creame_D_scope_r,Zinger_r,Basmati_Pilao_r,Regular_Pizza_r,Meduim_Pizza_r,
     Large_Pizza_r,XLarge_Pizza_r,Pori_Paratha_r,Naan_r,Milk_Roti_r,Chapati_r,Chicken_Biryani_r,
     Chicken_Burger_d,Boti_Roll_d,Salid_d,Meduim_Pizza_d,Regular_Pizza_d,Tikka_Boti_d,Chicken_Biryani_d,
     Chicken_Tikka_d
     ;
    
    coneccc cn;
    
    public void price(){
        cn = new coneccc();
        cn.Connect();
        cn.VeiwData("select log_cat from SK_dish");
        
        try{
        while(cn.rs.next()){

                 if(cn.rs.getString("ds_nm").equals("Beef Biryani")){
                 Beef_Biryani_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Chicken Tikka")){
                 Chicken_Tikka_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Tikka Boti")){
                 Tikka_Boti_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Chicken Burger")){
                 Chicken_Burger_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Boti Roll")){
                 Boti_Roll_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Ice Creame S_scope")){
                 Ice_Creame_S_scope_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Ice Creame D_scope")){
                 Ice_Creame_D_scope_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Zinger")){
                 Zinger_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Basmati Pilao")){
                 Basmati_Pilao_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Regular Pizza")){
                 Regular_Pizza_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Meduim Pizza")){
                 Meduim_Pizza_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Large Pizza")){
                 Large_Pizza_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("XLarge Pizza")){
                 XLarge_Pizza_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Pori Paratha")){
                 Pori_Paratha_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Naan")){
                 Naan_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Milk Roti")){
                 Milk_Roti_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Chapati")){
                 Chapati_r = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Chicken Biryani")){
                 Chicken_Biryani_r = cn.rs.getString("ds_pr");
                 }
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 else if(cn.rs.getString("ds_nm").equals("Chicken Burger") 
                         && cn.rs.getString("dl_nm").equals("Deal 1")){
                 Chicken_Burger_d = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Boti Roll")
                         && cn.rs.getString("dl_nm").equals("Deal 1") ){
                 Boti_Roll_d = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Salid")
                         && cn.rs.getString("dl_nm").equals("Deal 1") ){
                 Salid_d = cn.rs.getString("ds_pr");
                 }
                 else if(cn.rs.getString("ds_nm").equals("Meduim Pizza")
                         && cn.rs.getString("dl_nm").equals("Deal 2") ){
                 Meduim_Pizza_d = cn.rs.getString("ds_pr");
                 }
                  else if(cn.rs.getString("ds_nm").equals("Regular Pizza")
                         && cn.rs.getString("dl_nm").equals("Deal 2") ){
                 Regular_Pizza_d = cn.rs.getString("ds_pr");
                 }
                  else if(cn.rs.getString("ds_nm").equals("Tikka Boti")
                         && cn.rs.getString("dl_nm").equals("Deal 3") ){
                 Tikka_Boti_d = cn.rs.getString("ds_pr");
                 }
                  else if(cn.rs.getString("ds_nm").equals("Chicken Biryani")
                         && cn.rs.getString("dl_nm").equals("Deal 3") ){
                 Chicken_Biryani_d = cn.rs.getString("ds_pr");
                 }
                  else if(cn.rs.getString("ds_nm").equals("Chicken Tikka")
                         && cn.rs.getString("dl_nm").equals("Deal 4") ){
                 Chicken_Tikka_d = cn.rs.getString("ds_pr");
                 }
                 
        
        
        
        
        }
        }
        
        catch(Exception ex){
        
        }
        
        
        
        
    }
    
    
    
}
