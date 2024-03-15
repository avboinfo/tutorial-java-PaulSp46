package L_Lista;

import java.util.Iterator;

public class Lista {

    class Iteratore{
        private Nodo nodo;
        
        private Iteratore(Nodo nodo){
            this.nodo = nodo;
        }

        public boolean hasNext(){
            return nodo!=null;
        }

        public Nodo next(){
            if (nodo==null) {
                return null;
            }
            Nodo result = new Nodo(nodo.getValore(), nodo.getSuccessivo());
            return result;
        }
    }

    public Iteratore getIterator(){
        Iteratore i = new Iteratore(radice);
        return i;
    }

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

    public void addSorted(Nodo n){
        if (isEmpty()) {
            radice = n;
            return;
        } 

        Nodo p1 = radice;
        Nodo p2 = radice.getSuccessivo();
        int vN = n.getValore();

        if (p1.getValore()>vN) {
            n.setSuccessivo(radice);
            radice = n;
            return;
        }
        
        while (vN>p1.getValore() && p2!=null && vN>p2.getValore()) {
            p1=p2;
            p2=p1.getSuccessivo();
        }
        n.setSuccessivo(p2);
        p1.setSuccessivo(n);
    }

    public boolean addAfter(Nodo n, int pos){
        if (isEmpty()) {
            return false;    
        }

        Nodo counter = radice;
        Nodo next = radice.getSuccessivo();
        Nodo temp = null;
        while (counter!=null) {
            if (counter.getValore() == pos) {
                counter.setSuccessivo(n);
                temp = next.getSuccessivo();
                next = n;
                n.setSuccessivo(temp);
                return true;
            }
            
            counter = next;
            next = counter.getSuccessivo();
        }
        return false;
    }

    public boolean removePos(int pos){
        if (isEmpty()) {
            return false;
        }
        if (pos == 0) {
            radice = radice.getSuccessivo();
            return true;
        }

        Nodo counter = radice;
        Nodo next = radice.getSuccessivo();
        while (counter!=null) {
            if (next.getValore() == pos) {
                counter.setSuccessivo(next.getSuccessivo());
                return true;
            }
            counter = next;
            next = counter.getSuccessivo();
        }
        return false;
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