var Student = /** @class */ (function () {
    function Student(id, name, enrolledDate, enrolledCourse) {
        this.id = id;
        this.name = name;
        this.enrolledDate = enrolledDate;
        this.enrolledCourse = enrolledCourse;
    }
    Student.prototype.displayDetails = function () {
        console.log("ID: ".concat(this.id, ", Name: ").concat(this.name, ", Enrolled Date: ").concat(this.enrolledDate, ", Enrolled Course: ").concat(this.enrolledCourse, " "));
    };
    return Student;
}());
var Instructor = /** @class */ (function () {
    function Instructor(id, name, hireDate, courseTaught) {
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
        this.courseTaught = courseTaught;
    }
    Instructor.prototype.displayDetails = function () {
        console.log("ID: ".concat(this.id, ", Name: ").concat(this.name, ", Hire Date: ").concat(this.hireDate, ", Course Taught: ").concat(this.courseTaught, " "));
    };
    return Instructor;
}());
var s = new Student(101, "Max", "2024-02-07", "Cse");
s.displayDetails();
console.log("-------------------------------------------");
var i = new Instructor(501, "James Clear", "2024-02-07", "Computer Network");
i.displayDetails();
