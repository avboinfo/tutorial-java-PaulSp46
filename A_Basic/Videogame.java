public class Videogame {
    String nome, marca;
    float costo;
    int anno;

    public Videogame(String nome, String marca, float costo, int anno){
        this.nome=nome;
        this.marca=marca;
        this.costo=costo;
        this.anno=anno;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Marca: " + marca + " | Prezzo: " + costo + " € | Pubblicato nel " + anno;
    }
}
