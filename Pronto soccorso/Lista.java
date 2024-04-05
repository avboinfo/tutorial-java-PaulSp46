//"T" parametro formale

//import L_Lista.NodoGen;

public class Lista<T> {
    Nodo<T> root;

    public Lista() {
        this.root = null;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void addTail(T v){
        Nodo<T> n = new Nodo<T>(v);     //inserisce il paziente dentro un nodo
        if(root == null){
            root = n;
        } else {
            Nodo<T> tmp = root;
            while(tmp.getSuccessivo()!=null){
                tmp = tmp.getSuccessivo();
            }
            tmp.setSuccessivo(n);
        }
    }

    public void addHead(T v){
        Nodo<T> n = new Nodo<T>(v);
        if (isEmpty()) {
            root = n;
        } else{
            n.setSuccessivo(root);
            root = n;
        }
    }

    public boolean addAfterIterator(T v, int pos){
        //aggiunge il nodo n solo dopo aver oltrepassato il nodo di indice pos
        Nodo<T> n = new Nodo<>(v);
        Nodo<T> tmp = root;
        for (int i = 0; i < pos; i++) {
            tmp = root.getSuccessivo();
        }

        for(int i=0; i<pos; i++){
            if (iter.hasNext()) {
                npos = iter.next();
            } else{
                return false;
            }
        }
        n.setSuccessivo(npos.getSuccessivo());
        npos.setSuccessivo(n);
        return true;
    }

    @Override
    public String toString() {
        String s = "Elementi della lista:\n";
        Nodo<T> tmp = root;
        while (tmp!=null) {
            s += tmp + "\n";
            tmp = tmp.getSuccessivo();
        }
        s += "End!\n";
        return s;
    }
}
