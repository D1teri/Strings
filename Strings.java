
/**
Author: D1teri or Dima K.
Version: 1.0.0
 **/
public class Strings{
    String string1 = "I am a string";
    String string2 = string1;
    String string3 = "I am also a string";
    boolean stringsEqual = string1.equals(string3);
    
    public void run(){
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(stringsEqual);
    }
    public static void main (String[] args){
        Strings sp = new Strings();
        sp.run();
    }
}