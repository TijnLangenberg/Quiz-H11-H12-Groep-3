package src.Hoofdstuk12Quizzen.h12quiz3;
//h12quiz3 gemaakt door: Zinho.
public class MijnKlasse extends SuperKlasse
{
  int x = 3;
  String methodeA(String s, int i)
  {
    String str = s + ", " + i;
    //super.x ++;
    //x kan niet verhoogd worden omdat het een final attribuut is...dat is dus een contante
    return str;
  }
  public static void main(String[] args)
  {
    MijnKlasse mk = new MijnKlasse();
    System.out.print(mk.methodeA(23, "Emma"));
  }
}
//opdracht: "super.x ++;" toegevoegd, error: superklasse.k can not be assigned.  