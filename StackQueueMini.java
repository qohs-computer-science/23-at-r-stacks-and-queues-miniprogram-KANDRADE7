//Katherine Andrade, 12/16/25, pd 6 
//asks user for input, creating a stack. then, every value in stack is duplicated
//asks user for input a 2nd time, creating a queue. then, rearranges queue 
//so all even numbers come before odd numbers whilst perserving order. 
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackQueueMini {
  public static void main(String[] args) {
    //PART 1 : stack 
    Stack <Integer> stack = new Stack <Integer> ();
    Scanner sheep = new Scanner(System.in);
    for(int i=0; i<5; i++){
      System.out.print("Enter a number: ");
      int val = sheep.nextInt();
      stack.push(val);
      sheep.nextLine();
    }//end for loop
    System.out.println("\nOriginal stack: bottom of stack -> " + stack + " <- top of stack");

    duplicate(stack);
    System.out.println("\nDuplicated stack: bottom of stack -> " + stack + " <- top of stack");
    System.out.println();

  //PART 2: queue
  Queue <Integer> queue = new LinkedList <Integer>();
  System.out.println();
  for(int i=0; i<10; i++){
      System.out.print("Enter a number: ");
      int val = sheep.nextInt();
      queue.add(val);
  }//end for loop

  System.out.println("\nOriginal queue: bottom of queue--> " + queue + " <-- top of queue");
    
  evenOddQueue(queue);
  System.out.println("\nNew queue:  bottom of queue --> " + queue + " <-- top of queue");
  
}// end main

  public static void duplicate(Stack<Integer> stack){
    Stack <Integer> tempStack = new Stack <Integer>();
    while(!stack.isEmpty()){
      int stored = stack.pop();
      tempStack.push(stored);
    }// end while loop

    while(!tempStack.isEmpty()){
      int dupe = tempStack.pop();
      stack.push(dupe);
      stack.push(dupe);
    }//end while loop
  }//end duplicate function

  public static void evenOddQueue (Queue <Integer> queue){
    Queue <Integer> tempQ = new LinkedList <Integer>(); 
    for(int i = 0; i< 10;i++){
      int value = queue.remove();
      if(value % 2 == 0){
        queue.add(value); 
      } else {
        tempQ.add(value);  
      }// end else 
    }//end for loop

    while(!tempQ.isEmpty()){
      int thing = tempQ.remove();
      queue.add(thing);
    }//end while
  }// end evenOddQueue function

} // end class