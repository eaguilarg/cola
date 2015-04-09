

package queue;

import java.lang.reflect.Array;

public class Queue <T> extends miLista<T>{

 //atributos
   private Nodo<T> front;
   private int tamanoQueue;
      
   //constructor
   public Queue(){
       front=new Nodo();
       tamanoQueue=0;
   }
   
   public T peek(){
       T peek = null;
       Nodo<T> aux=cabeza.getSiguiente();
       while(aux.getSiguiente()!=null)
           aux=aux.getSiguiente();           
       if(aux.getSiguiente()==null)
           peek=aux.getElemento();
       return peek;
         
   }
   
 
   
    public void enQueue(T elem,int prio) {
        Nodo<T> recorredor=cabeza;
        Nodo<T> nuevo=new Nodo(elem,prio);
        Nodo<T> aux=null;
        
        while(recorredor.getSiguiente()!=(null) && recorredor.getSiguiente().compareTo(nuevo)<=0){
            recorredor=recorredor.getSiguiente();
        }
        aux=recorredor.getSiguiente();
        recorredor.setSiguiente(nuevo);
        nuevo.setSiguiente(aux);
        cont++;
        }

   
   public T deQueue(){
       Nodo<T>aux=cabeza.getSiguiente();
       T a=aux.getElemento();
       
       aux=aux.getSiguiente();
       cabeza.setSiguiente(aux);
       return a;
   }
   
   public boolean isEmpty(){
       boolean resp=true;
       if(front.getSiguiente()==null)
           resp=true;
       else
           resp=false;
       return resp;
   }
     
   
}

