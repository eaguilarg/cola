
package queue;

import java.util.Stack;

public class miLista<T> {
    Nodo <T> cabeza;
    int contador;
    
 //constructor
    public miLista(){
        cabeza=new Nodo();
        contador=0;
    }
   
    public void insertaInicio(Nodo <T> elem){
      Nodo<T> temporal=cabeza.getSiguiente();
      cabeza.setSiguiente(elem);
      elem.setSiguiente(temporal);
     }
    
    //iterativo
    public void insertaFinal(T elem){
     Nodo<T> nuevo=new Nodo(elem);
     Nodo<T> aux = cabeza;
        while(aux.getSiguiente()!=null){
         aux=aux.getSiguiente();
     }
         aux.setSiguiente(nuevo);
         contador++;               
    }
    //recursivo
    public void insertaFinalR(T elem){
        insertaFinal(cabeza,elem);
        contador++;
    }
    private void insertaFinal(Nodo<T> actual, T elem){
        //paso base
        if(actual.getSiguiente()==null)
            actual.setSiguiente(new Nodo(elem));
        else
            insertaFinal(actual.getSiguiente(),elem);
    }
   
    public  String borrar(Nodo<T> elem) throws Unchecked {
        Nodo<T> aux = cabeza;
        while(aux.getSiguiente()!=elem ){
         aux=aux.getSiguiente();
         if(aux.getSiguiente()==null)
              new Unchecked("No existe el elemento");
        }
        contador--;
                      
        return elem.toString();
      }
  public void imprimeLista(){
      for(Nodo<T> i=cabeza;i.getSiguiente()!=null;i=i.getSiguiente())
          System.out.println(i);
  }  
  //recursivo
  public void imprimeLista(Nodo<T> actual){
      if(actual!=null){
          System.out.print(actual.getElemento());
          imprimeLista(actual.getSiguiente());
      }
  }
  
  //insertar i-esima posicion
  public void insertarIpos(int pos, T elem) throws Unchecked{
      Nodo<T> nuevo=new Nodo(elem);
      Nodo<T> aux=cabeza;
      if(pos>contador)
          new Unchecked("No existe esa posicion");
      if(pos==0)
          insertaInicio(nuevo);
      for(int i=0;i<pos;i++)
          aux=aux.getSiguiente();
      
      nuevo.setSiguiente(aux.getSiguiente());
      aux.setSiguiente(nuevo);
  }
  
  //invertir lista(iterativo y recursivo)
  public void invertirLista(){
      Nodo<T> aux=cabeza.getSiguiente();
      Stack<T> pila=new Stack();
      while(aux!=null){
          pila.push(aux.getElemento());
          aux=aux.getSiguiente();
      }
      aux=cabeza.getSiguiente();
      while(!pila.isEmpty()){
          aux.setElemento(pila.pop());
          aux=aux.getSiguiente();
      }
    }
   //recursivo
  public Nodo<T> invertirListaR(Nodo<T> actual){
      if(actual!=null){
          
     Nodo<T> temp=invertirListaR(actual.getSiguiente()); 
      temp.setSiguiente(actual);
      actual.setSiguiente(null);
      }
      else{
          cabeza.setSiguiente(actual);
      }
      return actual;
  }
  
  //borrar todos clase
 public void borrarRep(){
     Nodo<T> actual=cabeza.getSiguiente();
     T elem=actual.getElemento();
     
     while(actual.getSiguiente()!=null){
         Nodo<T>aux=actual.getSiguiente();
         elem=actual.getElemento();
         Nodo<T> anterior=actual;
         while(aux!=null){
             if(aux.getElemento()==elem){
                 anterior.setSiguiente(aux.getSiguiente());
                 int cont--;
                 anterior=anterior.getSiguiente();
              }
             else 
                 anterior=aux;
             aux=aux.getSiguiente();
         }
     }
    }
 
 //busca elemento
 public boolean buscar(Nodo<T> elem){
     Nodo<T> actual=cabeza.getSiguiente();
     while(actual!=elem)
        actual=actual.getSiguiente();
     if(actual==null){
         return false;
     }
         return true;
 }
 
 public static void main(String[] args){
     miLista <Integer> lista=new miLista();
     lista.cabeza();
     lista.insertaFinal(3);
     lista.insertaFinal(2);
     lista.insertaFinal(1);
     
     lista.imprimeLista(cabeza.getSiguiente());
     lista.invertirListaR(int.cabeza.getSiguiente());
     }
 }
