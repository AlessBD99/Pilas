package lista_tipo_pila;
import javax.swing.JOptionPane;
/**
 *
 * @author Alessandro
 */

public class Pila {
    ////////////////////////////////  Atributos /////////////////////////////// 
    private Nodo ultimo;
    int tamanio;
    String Lista="";
    
    ///////////////////////////////// Constructor /////////////////////////////
    public Pila() {
        this.ultimo = null;
        this.tamanio = 0;
    }
    
    //////////////////////////////// Metodos ////////////////////////////////
    
    //Verifica si la Pila esta vacia o no
    public boolean PilaVacia(){
        if (ultimo == null)
            return(true);
        else {
            return (false);
        }
    }
    
    //Agrega elemntos a la pila
    public void InsertarElemento(int num){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.setDato(num);
        nuevo_nodo.setNext(ultimo);
        ultimo=nuevo_nodo;
        tamanio++;
    }
    
    //Retorna el ultimo elemento ingresado de la pila
    public int Tope(){
        if (PilaVacia() == false)
            return (ultimo.getDato());
        else return (0);
    }
    
    //Elimina el ultimo elemento de la pila
    public void EliminarNodo(){
        if(PilaVacia() == false){
            ultimo = ultimo.getNext();
            tamanio--;
        }
    }
    
    //Muestra la pila completa
    public void MostrarPila(){
        Nodo recorrido = ultimo;
        
        while(recorrido!= null){
             Lista += recorrido.getDato() + "\n";
             recorrido = recorrido.getNext();
        }
        JOptionPane.showMessageDialog(null,Lista);
        Lista="";
    }
    
    //Vaciar Pila
    public void VaciarPila(){
        ultimo=null;
    }
    

}
