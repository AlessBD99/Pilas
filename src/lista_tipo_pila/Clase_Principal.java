/*https://www.youtube.com/watch?v=8kSS_wypmjw*/
package lista_tipo_pila;
import javax.swing.JOptionPane;

/**
 *
 * @author Alessandro
 */

public class Clase_Principal {
    
   
    
   //Menu Principal
    public static void main (String[] args){
         int Opcion =0;
         int nodo =0;
         Pila pila = new Pila();
        
        do {
            
            try{
                
                Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        
                        "Menu de Opciones \n\n"
                                + "1: Insertar un elemnto\n"
                                + "2: Eliminar un elemento\n"
                                + "3: ¿ La pila esta vacia ?\n"
                                + "4: ¿ Cual es el ultimo elemento ?\n"
                                + "5: Contar elementos\n "
                                + "6: Vaciar Pila\n"
                                + "7: Mostrar Pila\n"
                                + "8: Salir\n\n"));
                
                switch(Opcion){
                    
                    case 1:
                        nodo = Integer.parseInt( JOptionPane.showInputDialog(null , "Ingresar elemento"));
                        pila.InsertarElemento(nodo);
                        break;
                    case 2:
                        pila.EliminarNodo();
                        break;
                    case 3:
                        if ( pila.PilaVacia() == false ){
                            JOptionPane.showMessageDialog(null, "La pila posee elementos");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "La pila se encuentra vacia");
                        }
                        break;
                    case 4:
                        if (pila.PilaVacia() == false){
                            JOptionPane.showMessageDialog(null, "El ultimo elemento es"+ pila.Tope());
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "La pila se encuentra vacia");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene"+ pila.tamanio +"elementos");
                        break;
                    case 6:
                        if (pila.PilaVacia() == false){
                            pila.VaciarPila();
                             JOptionPane.showMessageDialog(null, "Elementos eliminados");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "La pila se encuentra vacia");
                        }
                        
                        break;
                    case 7:
                        pila.MostrarPila();
                        break;
                    case 8:
                        break;
                    
                    default:
                        Opcion = 8;
                        break;
                }
                
            }catch(NumberFormatException e){
            
            }
            
        }while( Opcion != 8 );
    }
}
