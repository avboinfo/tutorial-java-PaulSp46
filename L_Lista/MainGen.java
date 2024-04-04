package L_Lista;

public class MainGen {
    public static void main(String[] args) {
        ListaGen<String> ls = new ListaGen<>();
        ls.addTail("juve");
        ls.addTail("milan");
        ls.addTail("bologna");
        ls.addTail("torino");

        System.out.println(ls);
    }
}
