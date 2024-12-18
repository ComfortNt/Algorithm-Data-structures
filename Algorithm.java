import  java.util.*;


// A stack data structure -  a stack follows a Lifo(Lastin firstout) arrangment.
// popular methods include push and pop.
// push() adds an item to the top of the stack.
// pop() removes an item from the top of the stack.
// other methods -> stack.empty() returns a boolean , stack.peek() returns item without removing it from the stack


class Algorithm{
    public static void main(String[] args) {

        // An array with a fixed size adding more than 2 items will return an error.
        int array[] = new int[2];

        ///////////////////////////////////////////////////////////////////////////////////////////
        Stack<String> mystack = new Stack<>();

        mystack.push("mystack-item-0");
        mystack.push("mystack-item-1");
        mystack.push("mystack-item-2");

        String favItem = mystack.peek();
        mystack.pop();  
        // removes index 2/(mystack-item-2) cause 2 is at the top of the stack.
        for( String i : mystack){
            System.out.println(i + favItem);
        };
        ////////////////////////////////////////////////////////////////////////////////////////////
        
        // Queue = FiFo(first in first out. eg a shopping queue at the mall).
        // the first index of the queue is the head the last is the tail.
        // enqueuing adding data at the tail 
        // dequeuing removing data from the dead 
        // queue is an interface an intance of a queue cannot be created

        Queue<String> shoppingLine = new PriorityQueue<>();

            shoppingLine.poll(); // removes data from the head since queue uses FIFO
            shoppingLine.offer("item"); // adds data at the tail of the queue
            shoppingLine.offer("item");
            shoppingLine.element(); // returns the data at the head without removing it

        //////////////////////////////////////////////////////////////////////////////////
        //LinkedList - a linkedlsit is a long chain of nodes connected to each other
        // a node is the data and its pointer
        // linkedlists are great for deleting and insertion of data because their pointers
        // a linkedlist can act like a Stack or Queue
        // Singly list( data + pointer->) - doubly list (<-previouse pointer + data + next pointer->)

        LinkedList<String> linkedlist = new LinkedList<>();

       //Linkedlist as Stack LIFO
        linkedlist.push("ONe");
        linkedlist.push("favItem");
        linkedlist.push("favItem1");
        linkedlist.push("favItem2");
        // Linkedlist as Queue FIFO

       linkedlist.offer("ONe");
       linkedlist.offer("favItem");
       linkedlist.offer("favItem1");
       linkedlist.offer("favItem2");

       System.err.println(linkedlist);


       // Big O notoation - describes the performance of an algorithm as data grows.
       
       

       // Linear Search - iterates through elemnets one at a time.
       // a linear search does not need to be sorted.
       // a linear search is good for small data sets.

    //    int[] linear = {1,2,3,4,5,6,7};
    //     System.out.println(LinearSearch(linear, 7));

        
    // Binary search - finds the position of an element in a sorted array
    // half of the array is eliminated during each step

     //    int[] binary = {1,2,3,4,5,6,7,8};

        

        //  System.out.println(BinarySearch(binary, 8));

        int[] array1 = {9,5,3,1,6,8,2,4,7,10};


        MergeSort(array1);
          
                     
                                  
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       

    private static void MergeSort(int[] array1) {

        int length = array1.length;
        if(length <= 1) return; //base case

        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int [length - middle];

        int i = 0;
        int j = 0;

        for( ; i < length; i++){

            if(i )
        }

     

}  

     private static void Merge(int[] right, int[] left , int array[] ){


     };
      
        
         
}
        
//         private static void SelectionSort(int[] array) {
                
//                 for( int i = 0 ; i < array.length - 1; i++){
//                     int min = array[i];

//                     for(int j = i + 1 ; j < array.length ; j++){
                        
//                         if(array[i] > array[j]){
//                             min = j;
//                         }   
   
//                 }       int temp = array[i];
//                         array[i] = array[min];
//                         array[min] = temp;
//             }
                
            
          
//             }       
// }

    // static int LinearSearch(int[] array, int value){
        
    //         for(int i = 0; i < array.length; i++){
    //             if(array[i] == value){
    //                 return i;
    //             };
    //         }
    //         return -1;
    // };
    
    
//         static int BinarySearch(int[] array , int value){

//         int first = 0;
//         int last = array.length -1;

//         while (first <= last) {
            
//             int middle = first + (last - first) / 2;
//             int midValue = array[middle];

//             if(value < midValue){
//                 last = middle - 1;
//             }else if( value > midValue){
//                 first = middle + 1;
//             }else{
//                 return middle;
//             }
//         }
        
//         return-1;
//     }
// }
