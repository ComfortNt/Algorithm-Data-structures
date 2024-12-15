


// linear search in Js

const linear = [1,2,3,4,5,6,7,8,9,10];

const LinearSearch =(linear , value)=>{
    for(i = 0 ; i < linear.length ; i++){

        if(linear[i] === value){
            return i
        }
    }
    return -1;
};
    // returns the index of the number 9
    console.log(LinearSearch(linear , 9));


// Binary search : 

const Binary = [1,2,3,4,5,6,7,8,9,10];

    
    const BinarySearch =(array , value)=>{

        let first = 0;
        let last = array.length - 1;
        
        while(first <= last){

            middle = first + (last - first) / 2;
            middleValue = array[middle];

            if( middleValue < value){
                first = middle + 1;
            }else if(middleValue > value){
                last = middle - 1;
            }else{
                return middle;
            };
        }

        return -1;
    }

    console.log(BinarySearch(Binary , 90));
    
    