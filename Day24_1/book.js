var book = /** @class */ (function () {
    function book(bookId, bookTilte, author, publishedYear) {
        this.bookId = bookId;
        this.bookTilte = bookTilte;
        this.author = author;
        this.publishedYear = publishedYear;
    }
    book.prototype.displayDetails = function () {
        console.log("Deatils of the Book: \n         Book ID: ".concat(this.bookId, "\n         Book Title: ").concat(this.bookTilte, "\n         Book Author:").concat(this.author, "\n         Published Year:").concat(this.publishedYear));
    };
    return book;
}());
var a = new book(101, "Harry Potter", "J K Rowling", "1997");
var b = new book(102, "Rich Dad Poor Dad", "Robert Kiyosaki", "1997");
a.displayDetails();
console.log("------------------");
b.displayDetails();
