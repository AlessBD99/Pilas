package lista_tipo_pila;

/**
 *
 * @author Alessandro
 */
public class Nodo {
    
    ///////////////////////////// Atributos //////////////////////////////
   public int dato;
   public Nodo next;
    
   //////////////////////////// Constructores ////////////////////////////
    public Nodo() {
       
    }
    public Nodo(int dato) {
        this.dato = dato;
        this.next = null;
    }
    
    ///////////////////////// Setter and Getter /////////////////////////////
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

}
