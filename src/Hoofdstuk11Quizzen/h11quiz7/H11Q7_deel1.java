
public class H11Q7_deel1 {

}
package _11_overerving.qz07;

public class Subklasse extends Superklasse
{
  Subklasse(String naam)
  {
    super(naam);
    System.out.print(naam);
  }
  public static void main(String[] args)
  {
    Subklasse sk = new Subklasse("x");
  }
}
