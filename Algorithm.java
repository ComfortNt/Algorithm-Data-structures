import java.util.Stack;
import java.util.LinkedList;

class Algorithm {

    //Stack data Structure - A stack is a Lifo arrangement
    // popular methods -> pop and push
    // Stack.pop (removes item from the top of the stack)
    // Stack.push (adds item to the top of the stack)
    
    public static void main(String[] args) {

        Stack<String> bro = new Stack<>();

        bro.push("Groove");
        bro.push("Groove");
        bro.add(0, "snow");

        for(String i : bro){
            System.out.println(i);
        }
        
    }
}