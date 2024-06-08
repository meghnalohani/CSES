 const array = [5, 1, 3, 2, 6]; 
// Calculate sum of elements of array - Non functional programming way 
function findSum(arr) { 
let sum = 0; 
for (let i = 0; i < arr.length; i++) { 
    sum = sum + arr[i]; 
  } 
return sum; 
} 
console.log(findSum(array)); // 17 

 // reduce function way 
const sumOfElem = arr.reduce(function (accumulator, current) { 
// current represent the value of array 
// accumulator is used the result from element of array. 
// In comparison to previous code snippet, *sum* variable is *accumulator* and *arr[i]* 
//is *current* 
  accumulator = accumulator + current; 
return accumulator; 
}, 0); //In above example sum was initialized with 0, so over here accumulator also needs 
//to be initialized, so the second argument to reduce function represent the initialization 
//value. 
console.log(sumOfElem); // 17