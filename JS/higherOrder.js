const radiusArr = [1,2,3,4];
const calculateCircum = function (radius) {
	return 2 * Math.PI * radius;
}
const calculateArea = function(radius) {
	return Math.PI * radius * radius;
}

const calculate = function(radiusArr, op){
	const output = [];
	for(let i = 0; i<radiusArr.length;i++){
		output.push(op(radiusArr[i]));
	}
	return output;
}


console.log(calculate(radiusArr, calculateArea));
console.log(calculate(radiusArr, calculateCircum));