package Esercitazione_Bank;

public class Main {
    public static void main(String[] args){
        ContoCorrente contoDiGiulietta = new ContoCorrente(2000, "Giulietta");
        ContoCorrente contoDiRomeo = new ContoCorrente( "Romeo");

        contoDiGiulietta.prelievo(500, false);
        contoDiGiulietta.prelievo(400, false);

        contoDiGiulietta.bonifico(contoDiRomeo, 200);

        System.out.println(contoDiGiulietta+"\n");
        System.out.println(contoDiRomeo);
    }
}
