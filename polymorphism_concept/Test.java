package com.practice;

class SuperClass {
   // static 
    void display() {
        System.out.println("Super");
    }
}
 
class SubClass extends SuperClass {
  //  static 
    final void display() {
        System.out.println("Sub");
    }
}
 
public class Test {
    public static void main(String[] args) {
        // Prints "Super" in console
        SuperClass sup = new SubClass();
        sup.display();
 
        // Prints "Sub" in console
        SubClass sub = new SubClass();
        sub.display();
    }
}
