package src.Hoofdstuk11Quizzen.h11quiz2;

public class Subklasse extends Superklasse{
//h11quiz2 gemaakt door: Fahd.
  Subklasse(int y)
  {
    x += y;
  }
  public static void main(String[] args)
  {
    Subklasse sk = new Subklasse(4);
    System.out.print(sk.x);
  }
}