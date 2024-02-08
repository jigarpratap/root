class book{
    bookId:number;
    bookTilte:String;
    author:String;
    publishedYear:String;
    constructor(bookId:number,bookTilte:String,author:String,publishedYear:String){
        this.bookId=bookId;
        this.bookTilte=bookTilte;
        this.author=author;
        this.publishedYear=publishedYear;
    }
     displayDetails(){
        console.log(`Deatils of the Book: 
         Book ID: ${this.bookId}
         Book Title: ${this.bookTilte}
         Book Author:${this.author}
         Published Year:${this.publishedYear}`);
    }

}

let a=new book(101,"Harry Potter","J K Rowling","1997");
let b=new book(102,"Rich Dad Poor Dad","Robert Kiyosaki","1997");
a.displayDetails();
console.log("------------------")
b.displayDetails();