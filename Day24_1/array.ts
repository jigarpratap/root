const stringName:string[] =["A","B","C","D"];
const nValue:number[]=[100,200,300,4500,500];
for(let i=0;i<stringName.length;i++){
    console.log(`${stringName[i]} : ${nValue[i]}`)
}

function findAvg(arr){
    let sum=0;
    for(let i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    return sum/arr.length;
}

console.log("-------------------------------------------------------");
console.log(findAvg(nValue));

