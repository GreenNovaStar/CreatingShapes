import java.util.Scanner;


public class Main{

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
    System.out.println("You have chosen " + symbol);

    //Size
    System.out.println("Enter the size of for the shape.");
    int size = in.nextInt();


    //Shape
    System.out.println("Choose a shape to draw.");
    System.out.println("Currently in stock is:");
    System.out.println("Square");
    String Shape = in.next();
    //Shape=drawShape(Shape);


  }
}
