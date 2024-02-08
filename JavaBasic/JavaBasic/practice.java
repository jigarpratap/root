package JavaBasic;

import java.util.Scanner;

import oops.staticImplements;

public class practice {
    public static String name;
    public static int serve;
    public static String ingredients;
    public static String res;
    public static int min;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to the Interactive Recipe Planner!");
        practice.name=scanner.nextLine();
        System.out.println("How many servings do you want to make? ");
        practice.serve=scanner.nextInt();
        scanner.nextLine();
        System.out.println("What are the main ingredients for the dish? ");
        practice.ingredients=scanner.nextLine();
        System.out.println("Do you have any dietary restrictions or preferences? ");
        practice.res=scanner.nextLine();
        System.out.println("What is the estimated cooking time for the dish? ");
        practice.min=scanner.nextInt();
        System.out.println("Thank you for planning your recipe!");
        System.out.println(name);
        System.out.println(serve);
        System.out.println(ingredients);
        System.out.println(res);
        System.out.println(min);
        scanner.close();

        
    }
}
