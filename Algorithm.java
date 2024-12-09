import  java.util.*;


// A stack data structure -  a stack follows a Lifo(Lastin firstout) arrangment.
// popular methods include push and pop.
// push() adds an item to the top of the stack.
// pop() removes an item from the top of the stack.
// other methods -> stack.empty() , stack.peek()


class Algorithm{
    public static void main(String[] args) {

        Stack<String> mystack = new Stack<>();

        mystack.push("mystack-item-0");
        mystack.push("mystack-item-1");
        mystack.push("mystack-item-2");

        
        mystack.peek();
        // removes index 2/(mystack-item-2) cause 2 is at the top of the stack.
        for( String i : mystack){
            System.out.println(i);
        };



    }

}