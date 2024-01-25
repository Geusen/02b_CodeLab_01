package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        
        Konto konto1 = new Konto();
        konto1.kontostand = konto1.kontostand * 2;
        output(String.valueOf(konto1.getKontostand()));
        
        
        Konto konto2 = new Konto();
        konto2.kontostand = konto2.kontostand * 3;
        output(String.valueOf(konto2.getKontostand()));
        
        
        Konto konto3 = new Konto();
        konto3.kontostand = konto3.kontostand * 10;
        output(String.valueOf(konto3.getKontostand()));
        


    }


   
    public static void output(String outputStr) {
        System.out.println(outputStr);
    } 


    
}







