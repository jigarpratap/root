class movie{
    constructor(title,genre,rating){
        this.title=title;
        this.genre=genre;
        this.rating=rating;
    }
}

const arr=[];
function rating(){
    return Math.floor(Math.random()*10)+1;
}

const m1=new movie("Naruto","Action",rating());
const m2=new movie("James Bond","Thriller",rating());
const m3=new movie("Hera pheri","Comedy",rating());
const m4=new movie("Koi mil gya","Romance",rating());
const m5=new movie("Sachin the god of cricket","biograhpy",rating());

arr.push(m1);
arr.push(m2);
arr.push(m3);
arr.push(m4);
arr.push(m5);

var order=function(arr){
   return  arr.sort((m1,m2)=>{
        const A=m1.title.toUpperCase();
        const B=m2.title.toUpperCase();

        if(A<B){
            return -1;
        }
        if(A>B){
            return 1;
        }
        return 0;

    });
}

var mfilter=arr.filter((e)=>{return e.rating>5})


console.log("-----Sorted elements by title--------");

let sorted=order(arr);
sorted.forEach(element => {
    console.log(element.title+" "+element.genre+" "+element.rating);
});

console.log("----filter elements -------------");
mfilter.forEach(element=>{
    console.log(element.title+" "+element.genre+" "+element.rating);
})