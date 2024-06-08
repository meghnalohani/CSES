const arr = [5, 1, 3, 2, 6]; 
// Transformation logic: 
function binary(x) { 
return x.toString(2); 
} 
const binaryArr = arr.map(binary); 
// The above code can be rewritten as : 
const binaryArr = arr.map(function binary(x) { 
return x.toString(2); 
} 
// OR -> Arrow function 
const binaryArr = arr.map((x) => x.toString(2));

 const array = [5, 1, 3, 2, 6]; 
// filter odd values 
function isOdd(x) { 
return x % 2; 
} 
const oddArr = array.filter(isOdd); // [5,1,3] 
// Other way of writing the above: 
const oddArr = arr.filter((x) => x % 2); 


