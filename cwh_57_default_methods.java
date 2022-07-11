package com.Learn;

interface  MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface Mywifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellphone{
    void callNumber(int phoneNumber){
        System.out.println("calling "+phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting... ");
    }
}

class mySmartphone extends MyCellphone implements Mywifi,MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
//        public void record4KVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashant", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class cwh_57_default_methods {
    public static void main(String[] args) {
            mySmartphone ms=new mySmartphone();
            ms.record4kVideo();
            String[]  ar=ms.getNetworks();
            for(String s:ar)
            {
                System.out.println(s);
            }
    }
}
