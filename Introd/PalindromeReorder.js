const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (word) => {
  let arr = Array.from({ length: 26 }).fill(0);
  let output;
  for(const char of word){
  const asciiA = 'A'.charCodeAt(0);
  const position = char.charCodeAt(0) - asciiA;
  arr[position]=arr[position]+1;
  }
  //console.log('Frequency map ',arr);
  //find off freq map
  const oddNumbers = arr.filter(num => num%2!=0);
  if (oddNumbers.length>1){
    output="NO SOLUTION";
    return;
  }
  if(oddNumbers.length==1){
    output = 
  } else {

  }
  rl.close();


});
