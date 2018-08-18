/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author sony
 */
public class DateClass {
       
        
        
        public String Date(){
            Calendar cal = new GregorianCalendar();
        int mon = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
            
        return( String.valueOf(mon)+"/"+String.valueOf(day)+"/"+String.valueOf(year));
        
        }
        public String Time(){
            Calendar cal = new GregorianCalendar();
        int mon = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
            
        return( String.valueOf(hour)+":"+String.valueOf(min)+":"+String.valueOf(sec));
        
        }
        
}