	import java.util.*;

/**
 * Generic version of the Queue class.
 * @param <T> the type of the value being queued
 */

class Queue <T> {
   private T[] queue;   // array for queue elements
   private int front, // one counterclockwise from front
               rear,    // array position of rear element
            capacity;   // capacity of queue array

   /**
    * Create an empty queue whose initial capacity is cap
    */
   Queue(int cap) {
      capacity = cap;
      queue = (T []) new Object [capacity];
      front = rear = 0;
   }

   /**
    * If number of elements in the queue is 0, return true else return false
    */
   boolean IsEmpty() {
   if(front == rear){
         return true; }
   else{
         return false;}
   }

   /**
    * Add x at rear of queue
    */
   void Push (T x) throws Exception {
      // if queue full, throw the following message
      if((rear+1)%capacity==front)
      throw new Exception ("Queue is Full");
      rear = (rear+1)%capacity;
      queue[rear]=x;

   }

   /**
    * Delete front element from queue
    */
   T Pop() throws Exception {
      // if queue is empty, throw the following message
      if(IsEmpty()){
         throw new Exception("Queue is empty.");}
      front = (front+1)%capacity;
      return queue[front];
   }
  
   public String toString() {
      String a = new String();

      a = "Queue : ";
      if(front <= rear){
         for(int i = front + 1; i <= rear ; i++){
            a+=queue[i]+" ";}}
      else{
         for(int i = front + 1; i < capacity; i++){
            a+=queue[i]+" ";}
         for(int i = 0; i <=rear; i++){
            a+=queue[i]+" ";}
      }
       a+=String.format("\nrear=%d, front=%d",rear,front);
      return a;
   }
};  
