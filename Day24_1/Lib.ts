interface Person{
    id:number;
    name:String;
    displayDetails():void;
}

class Student implements Person{
    id: number;
    name: String;
    enrolledDate:String;
    enrolledCourse:String;
    constructor(id:number,name:String,enrolledDate:String,enrolledCourse:String){
        this.id=id;
        this.name=name;
        this.enrolledDate=enrolledDate;
        this.enrolledCourse=enrolledCourse;
    }
    displayDetails(): void {
        console.log(`ID: ${this.id}, Name: ${this.name}, Enrolled Date: ${this.enrolledDate}, Enrolled Course: ${this.enrolledCourse} `);
    }
    
}

class Instructor implements Person{
    id: number;
    name: String;
    hireDate:String;
    courseTaught:String;
    constructor(id:number,name:String,hireDate:String,courseTaught:String){
        this.id=id;
        this.name=name;
        this.hireDate=hireDate;
        this.courseTaught=courseTaught;

    }
    displayDetails(): void {
        console.log(`ID: ${this.id}, Name: ${this.name}, Hire Date: ${this.hireDate}, Course Taught: ${this.courseTaught} `);
    }
    
}

let s=new Student(101,"Max","2024-02-07","Cse");
s.displayDetails();
console.log("-------------------------------------------");
let i=new Instructor(501,"James Clear","2024-02-07","Computer Network");
i.displayDetails();