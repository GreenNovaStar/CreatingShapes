import java.awt.Rectangle;
import java.util.Scanner;
public class Main{
/*
import java.awt.Rectangle;
import java.util.Scanner;
*/
  //Symbol Method (Start)
  public static char symbolm(int a,char b){
    if(a == 1){
      b = '!';
    }else if(a == 2){
      b = '@';
    }else if(a == 3){
      b = '#';
    }else if(a == 4){
      b = '$';
    }else if(a == 5){
      b = '%';
    }else if(a == 6){
      b = '^';
    }else if(a == 7){
      b = '&';
    }else if(a == 8){
      b = '*';
    }else if(a == 9){
      b = '(';
    }else if(a == 0){
      b = ')';
    }
  return b;
  }
  //Symbol Method (End)

  //drawShape Method (Start)
  //public static String drawShape()



  public static void main(String[] args) {

    System.out.println("Hello and welcome to shape generator.");
    Scanner in = new Scanner(System.in);

    //Symbol
    System.out.println("Choose a symbol.");
    System.out.println("1 is for !");
    System.out.println("2 is for @");
    System.out.println("3 is for #");
    System.out.println("4 is for $");
    System.out.println("5 is for %");
    System.out.println("6 is for ^");
    System.out.println("7 is for &");
    System.out.println("8 is for *");
    System.out.println("9 is for (");
    System.out.println("0 is for )");
    int number = in.nextInt();
    char symbol = 'a';
    symbol = symbolm(number,symbol);
    System.out.println("You have chosen the symbol " + symbol);

    //Size
    /*S
    System.out.println("Enter a length for the shape.");
    int length = in.nextInt();
    System.out.println("Enter a width for the shape.");
    int width = in.nextInt();
    */

    //Shape
    System.out.println("Choose a shape to draw.");
    System.out.println("Currently in stock is:");
    System.out.println("Enter 1 for a Square");
    //System.out.println("Enter 3 for a Equilateral Triangle");
    System.out.println("Enter 4 for a Rectangle");

    Scanner in2 = new Scanner(System.in);
    int Shape = in2.nextInt();
    int size2 = 0;


    if(Shape == 1){
      System.out.println("Enter the length of the sides for the SQUARE.");
      int length = in.nextInt();
      Square(length, symbol, size2);
    }else if(Shape == 2){
      int length = in.nextInt();
      rightTriangle(length, symbol);
    }else if(Shape == 3){
      System.out.println("Enter the length of the sides for the EQUILATERAL TRIANGLE.");
      int length = in.nextInt();
      equilTriangle(length, symbol);
    }else if(Shape == 4){
      System.out.println("Enter the length of the RECTANGLE");
      int length = in.nextInt();
      System.out.println("Enter the width of the RECTANGLE");
      int width = in.nextInt();
      Rectangle(length, width, symbol);
    }




  }
}

//Rectangle asdfa = new Rectangle(symbol)
