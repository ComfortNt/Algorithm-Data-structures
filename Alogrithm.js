
const List =[5,4,3,6,2,5,6,23,4,7];
// Linear search

const LinearSearch=(array , value)=>{

    for(i = 0 ; i < array.length ; i++){

        if(array[i] === value){
            return i;
        };      
    };

    return -1;
};



console.log(LinearSearch(List , 2));


//Binary Search

const Sorted = [1,2,3,4,5,6,7,8,9,10];

const BinarySearch =(array , value)=>{

    point1 = 0;
    point2 = array.length -1;

    while( point1 <= point2){

        middle =  Math.floor( point1 + (point2 - point1) / 2);
        midValue = array[middle];

        if(value < midValue){
            point2 = middle - 1;
        }else if(value > midValue){
            point1 =  middle + 1;
        }else{
            return middle;
        }
    }

    return -1;

}

console.log(BinarySearch(Sorted , 11));


// Recursion 


    const Again = (value)=>{

        if(value < 1) return;

        console.log(value);
        Again(value -1);
    };

    Again(10);


    const Factorial=(value)=>{

        if (value < 1 ) return 1;
        
       return value * Factorial( value - 1);
    };

   console.log( Factorial(9));

   // FizzBuzz

   const FizzBuzz=(num)=>{

    for(let i = 1 ; i <= num ; i++){

        if(i % 3 === 0 && i % 5 === 0){
            console.log("FizzBuzz");
            
        }else if( i % 3 === 0){
            console.log("Fizz");
            
        }else if(i % 5 === 0){
            console.log("Buzz");
            
        }else{
            console.log(i);
            
        }
    }
   }

   FizzBuzz(22);

   // Promise 

   let promise = new Promise((resolve , reject)=>{

   // const x = 0;
    const x = 1;

        x ? resolve("Success") : reject("Fail");
   });

   promise.then( (res)=>{

        console.log(res);
        
   } , (rej)=>{

        console.log(rej);
        
   });


    // const funn = async()=>{

    //     try {
    //         let wait = await axios.get("url");

    //         console.log(wait.data);
    
    //     } catch (error) {
    //         console.log(error);
            
    //     }
    // };

    // funn();