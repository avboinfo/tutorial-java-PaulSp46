package L_Lista;

//possiamo passargli qualsiasi tipo di dato
public class NodoGen<T> {   //classe generics
    private T valore;
    private NodoGen<T> successivo;

    public NodoGen(T valore){
        this.valore = valore;
        successivo = null;
    }

    public void setValore( T nValore){
        valore = nValore;
    }

    public T getValore(){
        return valore;
    }

    public NodoGen<T> getSuccessivo() {
        return successivo;
    }

    public void setSuccessivo(NodoGen<T> successivo) {
        this.successivo = successivo;
    }

    public String toString(){
        return "Il mio valore è: " + valore;
    }
}
