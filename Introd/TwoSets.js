const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (n) => {
  n = parseInt(n);
  if (n % 4 === 0 || n % 4 === 3) {
    let output = "YES\n";
    if (n % 2 === 0) {
      output += n / 2 + "\n";
      for (let i = 1; i <= n / 2; i += 2) {
        output += i + " " + (n + 1 - i) + " ";
      }
      output += "\n";
      output += n / 2 + "\n";
      for (let i = 2; i <= n / 2; i += 2) {
        output += i + " " + (n + 1 - i) + " ";
      }
    } else {
      output += Math.floor(n / 2) + 1 + "\n";
      for (let i = 1; i <= Math.floor(n / 2); i += 2) {
        output += i + " " + (n - i) + " ";
      }
      output += "\n";
      output += Math.floor(n / 2) + "\n";
      for (let i = 2; i <= Math.floor(n / 2); i += 2) {
        output += i + " " + (n - i) + " ";
      }
      output += n + "\n";
    }
    process.stdout.write(output);
  } else {
    console.log("NO");
  }
  rl.close();
});
