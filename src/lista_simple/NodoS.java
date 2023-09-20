
package lista_simple;


public class NodoS {
    public int dato;
    public NodoS siguiente; //Puntero enlace
    
    //Constructor para insertar al final
    public NodoS(int d){
        this.dato = d;
    }
    
    //Constructor para insertar al inicio
    public NodoS(int d, NodoS n){
        dato = d;
        siguiente = n;
    }
}
