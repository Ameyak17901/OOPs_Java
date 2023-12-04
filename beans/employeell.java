package com.demo.beans;

public class employeell {
    node  top;
    class node{
        employee data;
        node next=null;

        public node(employee val) {
           data=val;
           next=null;
        }

    }
    public employeell(){
        top=null;
    }

    public boolean isempty(){
       return top==null;
    }
    public void push(employee e){
        node temp=new node(e);
        if(isempty()){
            top=temp;
            top.next=null;

        }
        else{
            temp.next=top;
            top=temp;

        }


    }

    public employee pop(){
        node temp=top;
        top.next=top;
        temp.next=null;
        return temp.data;

    }
    public void didplayll(){
        if(isempty()){
            System.out.println("empty");

        }
        node temp=top;
        while(temp.next!=null){
            System.out.println(temp.data);
        }
    }



}
