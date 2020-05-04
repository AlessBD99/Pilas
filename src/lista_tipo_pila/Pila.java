package lista_tipo_pila;

import javax.swing.JOptionPane;

/**
 *
 * @author Alessandro
 */
public class Pila {
    
    private Nodo ultimo;
    int tamanio;
    String Lista="";

    public Pila() {
        this.ultimo = null;
        this.tamanio = 0;
    }

    public boolean PilaVacia(){
        if (ultimo == null)
            return(true);
        else {
            return (false);
        }
    }
    
    public void InsertarElemento(int num){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.setDato(num);
        nuevo_nodo.setNext(ultimo);
        ultimo=nuevo_nodo;
        tamanio++;
    }
    
    public int Tope(){
        if (PilaVacia() == false)
            return (ultimo.getDato());
        else return (0);
    }
    
    public void EliminarNodo(){
        if(PilaVacia() == false){
            ultimo = ultimo.getNext();
            tamanio--;
        }
    }
    
    public void MostrarPila(){
        Nodo recorrido = ultimo;
        
        while(recorrido!= null){
             Lista += recorrido.getDato() + "\n";
             recorrido = recorrido.getNext();
        }
        JOptionPane.showMessageDialog(null,Lista);
        Lista="";
    }
}
