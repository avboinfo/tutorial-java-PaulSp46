public class Nodo<T> {   //classe generics
    private T valore;
    private Nodo<T> successivo;

    public Nodo(T valore){
        this.valore = valore;
        successivo = null;
    }

    public void setValore( T nValore){
        valore = nValore;
    }

    public T getValore(){
        return valore;
    }

    public Nodo<T> getSuccessivo() {
        return successivo;
    }

    public void setSuccessivo(Nodo<T> successivo) {
        this.successivo = successivo;
    }

    public String toString(){
        return valore.toString();
    }
}