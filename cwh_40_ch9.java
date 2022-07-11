package com.Learn;

class MyEmployee
{
    private int id;
   private  String name;

   public String getName()
   {
       return name;
   }
   public void setName(String n){
       name=n;
   }
   public int getId()
   {
       return id;
   }
   public void setId(int i)
   {
       id=i;
   }
}
public class cwh_40_ch9 {
    public static void main(String[] args) {
        MyEmployee shivam=new MyEmployee();
//        shivam.id=45;
//        shivam.name="Shivam vishwakarma"; // throws an error due to private access modifier
        shivam.setName("Shivam vishwakarma");
        System.out.println(shivam.getName());
        shivam.setId(158);
        System.out.println(shivam.getId());

    }
}
