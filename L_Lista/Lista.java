package L_Lista;

public class Lista {

    Nodo radice;
    
    public Lista() {
        radice = null;
    }

    public boolean isEmpty() {
        return radice==null;
    }

    public void addTail( Nodo n ) {
        if (isEmpty()) {
            radice = n;
        } else {
            Nodo p = radice;
            while (p.getSuccessivo()!=null) p = p.getSuccessivo();
            p.setSuccessivo( n );
        }
    }

    public void addHead(Nodo n){
        if (isEmpty()){
            radice = n;
        } else{
            n.setSuccessivo(radice);
            radice = n;
        }
    }

    public String toString() {
        String s = "Elementi della lista: ";
        Nodo p = radice;
        while (p!=null) {
            s += p + " ";
            p = p.getSuccessivo();
        }
        s += "End!\n";
        return s;
    }
}