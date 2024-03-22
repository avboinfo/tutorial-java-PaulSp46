package Esercitazione_Bank;

public class Main {
    public static void main(String[] args){
        ContoCorrente contoDiGiulietta = new ContoCorrente(2000, "Giulietta");
        ContoCorrente contoDiRomeo = new ContoCorrente( "Romeo");

        contoDiGiulietta.prelievo(500);
        contoDiGiulietta.prelievo(400);

        contoDiRomeo.versamento(200);
        contoDiRomeo.calcInteresse();

        System.out.println(contoDiGiulietta+"\n");
        System.out.println(contoDiRomeo);
    }
}
