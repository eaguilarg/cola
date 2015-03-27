
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
           aux.getElemento();
       return peek;
       
                
   }
   
   public void enQueue(T elem, int p){
       insertaFinalR(elem);
   }
   public Queue enQueuePrioridad(T elem, int prior){
       Queue colaTotal=null,cola1 = null, cola2=null,cola3=null;
       Nodo<T>peek1=new Nodo();
       Nodo<T>peek2=new Nodo();
                   
       switch(prior){
           case(1):
               cola1.enQueue(elem, prior);
               break;
           case(2):
               cola2.enQueue(elem, prior);
               break;
           case(3):  
               cola3.enQueue(elem, prior);
               break;
        }
       Nodo<T> cabeza2=cola2.cabeza.getSiguiente(), cabeza3=cola3.cabeza.getSiguiente();
       peek1=(Nodo<T>)cola1.peek();
       peek2=(Nodo<T>)cola2.peek();
       
       colaTotal=cola1;
       peek1.setSiguiente(cabeza2);
       while(cabeza2!=null)
           cabeza2.getSiguiente();
       peek2.setSiguiente(cabeza3);
       while(cabeza3!=null)      
           cabeza3.getSiguiente();
       
       return colaTotal;
           
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
   
   
   public static void main(String args[]){
       Queue cola=new Queue();
       
       cola.enQueuePrioridad('A',3);
       cola.enQueuePrioridad('B',2);
       cola.enQueuePrioridad('C',2);
       cola.enQueuePrioridad('D',1);
       cola.enQueuePrioridad('F',2);
       cola.enQueuePrioridad('G',3);
       cola.enQueuePrioridad('H',3);
       cola.enQueuePrioridad('I',3);
       cola.enQueuePrioridad('J',2);
       cola.enQueuePrioridad('K',2);
       cola.enQueuePrioridad('L',1);
       cola.enQueuePrioridad('M',2);
       
      cola.imprimeLista();
  
        
        
       
       
   }
     
   
}
