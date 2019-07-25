
package lab2;


public class NodoCola {
    Nodo dato;
    NodoCola siguiente;

    public NodoCola(Nodo dato){
        this.dato = dato;
    }
    
    public void setSiguiente(NodoCola siguiente){
        this.siguiente = siguiente;
    }
    
    public NodoCola getSiguiente(){
        return siguiente;
    }
    
    public void setDato(Nodo dato){
        this.dato = dato;
    }
    
    public void getDato(){
        return dato;
    }
    

    
}
