//Katherine Andrade, 12/16/25, pd 6 cp3
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackQueueMini {
  public static void main(String[] args) {
    Stack <Integer> stack = new Stack <Integer> ();
    Scanner sheep = new Scanner(System.in);
    for(int i=0; i<5; i++){
      System.out.print("Enter a number: ");
      int val = sheep.nextInt();
      stack.push(val);
      sheep.nextLine();
    }//end for loop
    System.out.println("\nOriginal stack: ");
    System.out.println("bottom of stack " + stack + " top of stack");

    //duplicating
    //new one to reverse then remove and add 2x
    Stack <Integer> tempStack = new Stack <Integer>();
    while(!stack.isEmpty()){
      int stored = stack.pop();
      tempStack.push(stored);
    }// end while loop
    System.out.println("\nReversed stack: ");
    System.out.println("bottom of stack " + tempStack + " top of stack");

    while(!tempStack.isEmpty()){
      int dupe = tempStack.pop();
      stack.push(dupe);
      stack.push(dupe);
    }//end while loop

    System.out.println("\nDuplicated stack: ");
    System.out.println("bottom of stack " + stack + " top of stack");


  //PART 2
  Queue <Integer> queue = new LinkedList <Integer>();
  for(int i=0; i<10; i++){
      System.out.print("Enter a number: ");
      int val = sheep.nextInt();
      queue.add(val);
      sheep.nextLine();
    }//end for loop

    System.out.println("\nOriginal queue: ");
    System.out.println("bottom of queue " + queue + " top of queue");
  } // end main
} // end class