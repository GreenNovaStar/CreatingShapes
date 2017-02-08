import java.util.Scanner;


public class Main{

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
    char symbol;

    if(number == 1){
      symbol = '!';
    }else if(number == 2){
      symbol = '@';
    }else if(number == 3){
      symbol = '#';
    }else if(number == 4){
      symbol = '$';
    }else if(number == 5){
      symbol = '%';
    }else if(number == 6){
      symbol = '^';
    }else if(number == 7){
      symbol = '&';
    }else if(number == 8){
      symbol = '*';
    }else if(number == 9){
      symbol = '(';
    }else if(number == 0){
      symbol = ')';
    }

    //Shape


  }
}
