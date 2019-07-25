
package lab2;

public class Cola {
 NodoCola primero, ultimo;
    int length;
    public Cola(){
        primero = ultimo = null;
        length = 0;
    }
    
    public boolean isEmpty(){
        return primero == null;
    }
    /*
    public void insert(NodoCola elemento){//falta creacion de la lista enlazada
        NodoCola nuevoNodoCola = new NodoCola(elemento);
        if(isEmpty()){
            primero = nuevoNodoCola;
        }
        else{
            ultimo.siguiente = nuevoNodoCola;
        }
        ultimo = nuevoNodoCola;
        length++;
    }
    **/
    
    public Nodo remove(){
        Nodo aux = primero.dato;
        primero = primero.siguiente;
        length--;
        return aux;
    }
    
    public Nodo PrimerEleCola(){
        return primero.dato;
    }
    
    public int queueLength(){
        return length;
    }
}

