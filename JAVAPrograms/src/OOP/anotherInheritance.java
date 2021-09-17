package OOP;

import java.sql.SQLOutput;

class Animal{
     String aName;
     String aColor;
     int aNumber;

     public String getaName() {
         return aName;
     }

     public void setaName(String aName) {
         this.aName = aName;
     }

     public String getaColor() {
         return aColor;
     }

     public void setaColor(String aColor) {
         this.aColor = aColor;
     }

     public int getaNumber() {
         return aNumber;
     }

     public void setaNumber(int aNumber) {
         this.aNumber = aNumber;
     }
     public void  Print()
     {
         System.out.println("Welcome to ZOO");
     }
 }
public class anotherInheritance {
    public static void main(String[] args) {
        System.out.println("Excercise on Inheritance");
    }
}
