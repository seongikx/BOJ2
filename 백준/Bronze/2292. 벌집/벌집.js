let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');

let n = Number(input[0]);

let i = 1;
let cnt = 1;
let plus = 6;
while (1) {
  if (n <= i) break;
  i += plus;
  plus += 6;
  cnt++;
}

console.log(cnt);