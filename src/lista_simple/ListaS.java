
package lista_simple;


public class ListaS{
    
    protected NodoS inicio, fin; //Punteros para saber donde esta el inicio y el fin
    
    public ListaS(){
        inicio = null;
        fin = null;
    }
    
    //Metodo para agregar un nodo al inicio de la lista
    public void agregarAlInicio(int elemento){
        //Se crea al nodo
        inicio=new NodoS(elemento, inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    
    //Metodo para mostrar los datos
    public void mostrarLista(){
        NodoS recorrer = inicio;
        while(recorrer != null){
            System.out.print("[" + recorrer.dato + "]-->");
            recorrer = recorrer.siguiente;
        }
    }
}
