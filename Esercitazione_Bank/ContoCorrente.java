package Esercitazione_Bank;
import java.io.*;

public class ContoCorrente {
    float saldo; 
    String nome;

    public ContoCorrente(float saldo, String nome){
        this.saldo=saldo;
        this.nome = nome;
        printLog("Conto di" + nome + " creato");
    }

    public ContoCorrente(String nome){
        this(0, nome);
    }

    public void versamento(float vers){
        if (vers<=0) {
            System.out.println("Versamento non valido");
            return;
        }
        this.saldo+=vers;
        printLog("Conto di " + nome + " - Versamento: " + vers);
    }

    public void prelievo(float prel){
        if (prel<=0) {
            System.out.println("Prelievo non valido");
            return;
        }
        if (prel > this.saldo) {
            System.out.println("Saldo insufficiente");
            return;
        }
        this.saldo-=prel;
        printLog("Conto di " + nome + " - Prelievo: " + prel);
    }

    public void calcInteresse(){
        saldo-=(saldo*10)/100;
        printLog("Applicato interesse del 10%");
    }
    
    private void printLog(String movim){
        File f = new File("Esercitazione_Bank/log.txt");
        try {
            FileWriter filePrinter = new FileWriter(f, true);
            filePrinter.write(movim+"\n");
            filePrinter.close();
        } catch (IOException e) {
            System.out.println("Messaggio: " + e.getMessage());
        }
    }

    public String toString() {
        return "Conto di " + nome + "\nSaldo: " + saldo;
    }
}
