package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        
        Konto konto1 = new Konto();
        output("-------------------------------------------------------------");
        output(String.valueOf("Konto Nr. 1 " + konto1.getKontostand()));
        konto1.kontostand = konto1.kontostand * 2;
        


        Konto konto2 = new Konto();
        
        output(String.valueOf("Konto Nr. 2 " + konto2.getKontostand()));
        konto2.kontostand = konto2.kontostand * 3;
        


        Konto konto3 = new Konto();
        
        output(String.valueOf("Konto Nr. 3 " + konto3.getKontostand()));
        konto3.kontostand = konto3.kontostand * 10;
        
        output("-------------------------------------------------------------");
        output(String.valueOf("Konto Nr. 1 nach der Dividende " + konto1.getKontostand()));
        output(String.valueOf("Konto Nr. 2 nach der Dividende " + konto2.getKontostand()));
        output(String.valueOf("Konto Nr. 3 nach der Dividende " + konto3.getKontostand()));
        output("-------------------------------------------------------------");
        
    }


   
    public static void output(String outputStr) {
        System.out.println(outputStr);
    } 


    
}







