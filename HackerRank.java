public class HackerRank {


    public static void main(String[] args) {
        

        int[] arry ={1,2,3,4,5};
      //  System.out.println( "Answer is" +" "+ Sum(arry));

        int[] jump = {0,1,0,0,0,1,0};
        
     //   System.out.println( "Answer" +" "+ JumpClouds(jump));

        Drawhashes(4);

        String p = "Comfort Ntiwane";

        Reverse(p);
                                
}       
            private static void Reverse(String p) {
                
                int l = p.length() - 1;

                for(; l >= 0 ; l-- ){
                    System.out.print(p.charAt(l));
                };
                

            };
            private static void Drawhashes(int n) {
               
                for(int i = 1; i <= n ; i++){

                    for(int j = 0; j < n - i; j++){
                        System.out.print(" ");
                    };

                    for(int k = 0 ; k < i ; k++){
                        System.out.print("#");
                    }

                    System.out.println();
                };
            };
               
            private static int JumpClouds(int[] jump) {
               
                int jumper = 0;
                int i = 0;

                while (i < jump.length-1) {
                    if(jump[i + 2] == 1 || jump[i + 2] == jump.length){
                        jumper++;
                        i++;
                    }else{
                        i +=2;
                        jumper+=2;
                    }

                }

                return jumper;
            }
           
            private static int Sum(int[] arry) {

                int sum = 0;   
                for(int i = 0 ; i < arry.length ; i++){
                    sum += arry[i];
                }
                return sum;

            }


    
};

abstract class wee {

    
};