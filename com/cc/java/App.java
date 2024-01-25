package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        


        



        Konto konto1 = new Konto("Geringverdiener", 10000);
        output("-------------------------------------------------------------");
        output(String.valueOf("Konto Nr. 1 " + konto1.getKontostand() + konto1.eu));
        konto1.kontostand = konto1.kontostand * 2;
        


        Konto konto2 = new Konto("Kleinuntnernehmer", 10000);
        output("-------------------------------------------------------------");
        output(String.valueOf("Konto Nr. 2 " + konto2.getKontostand() + konto2.eu));
        konto2.kontostand = konto2.kontostand * 3;
        
        

        Konto konto3 = new Konto("Richkid", 10000);
        output("-------------------------------------------------------------");
        output(String.valueOf("Konto Nr. 3 " + konto3.getKontostand() + konto3.eu));
        konto3.kontostand = konto3.kontostand * 10;
        
        output("-------------------------------------------------------------");
        output(String.valueOf(konto1.kontoInhaber));
        output(String.valueOf("hat auf Konto Nr. 1 nach der Dividende " + konto1.getKontostand() + konto1.eu));
        output("-------------------------------------------------------------");
        output(String.valueOf(konto2.kontoInhaber));
        output(String.valueOf("hat auf Konto Nr. 2 nach der Dividende " + konto2.getKontostand() + konto1.eu));
        output("-------------------------------------------------------------");
        output(String.valueOf(konto3.kontoInhaber));
        output(String.valueOf("hat auf Konto Nr. 3 nach der Dividende " + konto3.getKontostand() + konto1.eu));
        output("-------------------------------------------------------------");
        
    }


   
    public static void output(String outputStr) {
        System.out.println(outputStr);
    } 


    
}







