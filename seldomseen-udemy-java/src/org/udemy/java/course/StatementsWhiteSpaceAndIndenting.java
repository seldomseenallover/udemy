package org.udemy.java.course;
//Sec 5 | Lec 27
public class StatementsWhiteSpaceAndIndenting {
    
    public static void main(String[] args) {
        int myVariable=50; //valid java statement
        myVariable++;
        myVariable--;
        System.out.println("This is a java statment w/ a method call. need ';' to complete a statement");
        
        System.out.println("This is " +
                " another" +
                " still more.");
        
        int anotherVariable1 = 50;myVariable--; //recommend not to put statements on same line, although they can be.
        int anotherVariable2 = 60;
        myVariable--;
        System.out.println("This is another one");
        
      /* whitespace can be between not best practice
        good to use spaces between operators, variables etc*/
       
      /* indentation*/
      int myVariable2=50;
      if(myVariable2 == 50){
        System.out.println("Printed");
      }

    }
}
