class book{
    bookId;
    bookTilte;
    author;
    publishedYear;
    constructor(bookId,bookTilte,author,publishedYear){
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

let a=new book(101,"Atomic Habits","James Clear","2018");
let b=new book(102,"Compound Effect","Daren Hardy","2010");
a.displayDetails();
console.log("------------------")
b.displayDetails();