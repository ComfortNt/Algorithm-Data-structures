import  java.util.*;


class Algorithm{
    public static void main(String[] args) {

       
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
    
        Queue<String> shoppingLine = new PriorityQueue<>();

            shoppingLine.poll(); 
            shoppingLine.offer("item");
            shoppingLine.offer("item");
            shoppingLine.element(); 

        //////////////////////////////////////////////////////////////////////////////////

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

        int[] array1 = {9,5,3,1,6,8,2,4,7,6,10};
        
        FizzBuzz(20);
        
        
                                    
                           // System.out.println(LinearSearch(array1 , 11));
                           // BinarySearch(array1 , 22);
        }
                    
        
            private static void FizzBuzz(int num) {

                for( int i = 1; i <= num ; i++ ){

                    if( i % 3 == 0 ){
                        System.out.println(i + " " + "Fizz");
                    }else if( i % 5 == 0 ){
                        System.out.println(i + " " + "Buzz");
                    }else if( i % 3 == 0 && i % 5 == 0){
                        System.out.println(i + " " + "FizzBuzz");
                    }else{
                        System.out.println(i);
                    };
                };

            };
        
        
            private static int BinarySearch(int[] array1, int num) {
                
                int first = 0;
                int last = array1.length -1;

                while (first <= last){

                    int middle = (first + (last - first) /2);
                    int midval = array1[middle];

                    if (midval > num) {
                        first = middle + 1;
                    }else if( midval < num){
                        last = middle - 1;
                    }else{
                        return middle;
                    } 
                }

                return -1;

            }     
            private static int LinearSearch(int[] array1, int num) {
                
                for( int i = 0 ; i < array1.length ; i++){

                    if(array1[i] == num){
                        return i;
                    }
                  
                }
                 return -1;
            }

        
}


   
       



