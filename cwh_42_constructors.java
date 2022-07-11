package com.Learn;
class MyMainEmployee
{
    private int id;
    private  String name;

//    default constructor
    public MyMainEmployee(){
        id=45;
        name="your-name-here";
    }

    // parameterized constructor
    public MyMainEmployee(String myName,int myId){
        id=myId;
        name=myName;
    }
    public MyMainEmployee(String myName){
        id=1;
        name=myName;
    }

    public String getName() { return name;}
    public void setName(String n){name=n;}
    public int getId() {return id;}
    public void setId(int i) {id=i;}
}
public class cwh_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee shivam = new MyMainEmployee("Shivam");
        //harry.setName("CodeWithHarry");
        //harry.setId(34);
        System.out.println(shivam.getId());
        System.out.println(shivam.getName());
    }
}
