var stringName = ["A", "B", "C", "D"];
var nValue = [100, 200, 300, 4500, 500];
for (var i = 0; i < stringName.length; i++) {
    console.log("".concat(stringName[i], " : ").concat(nValue[i]));
}
function findAvg(arr) {
    var sum = 0;
    for (var i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum / arr.length;
}
console.log("-------------------------------------------------------");
console.log(findAvg(nValue));
