
package lista_simple;

import javax.swing.JOptionPane;


public class Lista_simple {

   
    public static void main(String[] args) {
        
        int opcion = 0;
        ListaS lista = new ListaS();
        
        do{
           try{
               opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar un elemento al inicio\n"
                       + "2. Mostrar los datos de la lista\n" + "3. Salir", "Menu de opciones", 3));
               
               switch(opcion){
                   case 1:
                       try{
                   int el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento:",
                           "Insertando al inicio", 3));
                           
                           //Se agrega al nodo
                           lista.agregarAlInicio(el);
                       }catch(NumberFormatException n){
                           JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                       }
                       break;
                   
                   case 2:
                       lista.mostrarLista();
                       break;
                   
                   case 3:
                       break;
                   
                   default:
                       JOptionPane.showMessageDialog(null, "Opcion incorrecta");
               }
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
           }
        }while(opcion != 3);
    }
    
}
