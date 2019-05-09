package h12quiz3;
//h12quiz3 gemaakt door: Zinho.
public class MijnKlasse extends SuperKlasse
{
  int x = 3;
  String methodeA(String s, int i)
  {
    String str = s + ", " + i;
    super.x ++;
    return str;
  }
  public static void main(String[] args)
  {
    MijnKlasse mk = new MijnKlasse();
    System.out.print(mk.methodeA(23, "Emma"));
  }
}
//opdracht: "super.x ++;" toegevoegd, error: superklasse.k can not be assigned.  