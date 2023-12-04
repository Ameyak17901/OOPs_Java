package com.demo.test;

import com.demo.beans.employeell;
import com.demo.beans.employee;
import java.util.Scanner;

public class testemp {
    public static void main(String[] args) {
        employeell ob=new employeell();

        employee e1=new employee(1,"yash","male");
        ob.push(e1);
        employee e2=new employee(2,"raj","male");
        ob.push(e2);
        employee e3=new employee(3,"kavya","female");
        ob.push(e3);

        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();

        do{
            System.out.println("1.add/n2.delete/n3.displayall");
            System.out.println("enter choice");
            switch (ch){
                case 1:
                    System.out.println("entr name");
                    String name=sc.next();
                    System.out.println("enter id");
                    int id=sc.nextInt();
                    System.out.println("entr gender");
                    String gender= sc.next();
                    employee e=new employee(id,name,gender);
                    ob.push(e);

                    break;

                case 2:
                    System.out.println(ob.pop());

                    break;
                case 3:
                    ob.didplayll();

                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.print("invalid");

            }
        }while(ch!=1);

    }
}
