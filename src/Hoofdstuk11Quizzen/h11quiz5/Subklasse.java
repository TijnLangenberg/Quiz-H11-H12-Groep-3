package src.Hoofdstuk11Quizzen.h11quiz5;

public class Subklasse extends Superklasse {
//h11quiz5 gemaakt door: Fahd.
  int mijnMethode(int i, int i2)
  {
    return mijnMethode(i) + x + i2;
  }
  public static void main(String[] args)
  {
    Subklasse subK = new Subklasse();
    System.out.print(subK.mijnMethode(3, 6));
  }
}
