import java.util.*;


 class Shape{
   Character s;

/*
  private String shape = new String();

  Shape(String s){
    shape = s;

  }

  public void setWidth(int s){
    //this.size = s;
  }

/*
  public int getSize(){
    //return this.size;
  }
*/

  public void  draw(){
  }

}

class Rectangle extends Shape{
  double width;
  public Rectangle(Character c)
  {
    System.out.println("enter width");
    width=new Scanner(System.in).nextDouble();

    s=c;


  }

  @Override
  public void  draw(){

  }


}
