package src.Hoofdstuk11Quizzen.h11quiz4;

public class Subklasse extends SuperA {
//h11quiz4 gemaakt door: Fahd.
  public Subklasse()
  {
    x += 2;  
    y += 3;
    System.out.print(" x" + x);
    System.out.print(" y" + y);
  }
  public static void main(String[] args)
  {
    Subklasse subK = new Subklasse();
  }
}