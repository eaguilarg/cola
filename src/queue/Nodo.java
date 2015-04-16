
package queue;

public class Nodo <T> {
   
//atributos
   private T elemento;
   private Nodo <T> siguiente;
   private int prioridad;
   
//constructores
   public Nodo(T elemento){
         this.elemento=elemento;
         siguiente=null;
    }
   public Nodo(){
   }
   public Nodo(T elem,int prioridad){
       this.elemento=elemento;
       siguiente=null;
       this.prioridad=prioridad;
   }
   
 //gets y sets
   public Nodo<T> getSiguiente(){
       return siguiente;
   }
   public void setSiguiente(Nodo<T> siguiente){
       this.siguiente=siguiente;
   }
   
 //toString
   public String toString(){
       StringBuilder sb=new StringBuilder();
       sb.append("Elemento: "+elemento);
       return sb.toString();
     }

    public T getElemento() {
        return elemento;
    }
    
    public void setElemento(T elemento){
            this.elemento=elemento;
      }
   }
