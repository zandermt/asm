package com.poly.py00023.truongminhtien.lab6;

public class Thongtin {
    public Boolean isEmail(String str){        
        Stg pattern = "\\w+@\\w+(\\.\\w+){1,2}";
        return str.matches(pattern);            
    }
    
    public Boolean isPhone(String str){
        String pattern = "0\\d{9}";
        return str.matches(pattern);
    }
    
    public Boolean isCMND(String str){
        String pattern = "\\d{12}";
        return str.matches(pattern);
    }
}
