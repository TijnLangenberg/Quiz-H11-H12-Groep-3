
public class placeholder {

}
package _11_overerving.qz08.package_01;

import _11_overerving.qz08.package_02.Superklasse;

public class Subklasse extends Superklasse
{
  public static void main(String[] args)
  {
    Superklasse supK = new Superklasse();
    Subklasse subK = new Subklasse();
    // System.out.print(supK.str1); /* 1 */
    // System.out.print(supK.str2); /* 2 */
    // System.out.print(supK.str3); /* 3 */
    // System.out.print(supK.str4); /* 4 */
    // System.out.print(subK.str2); /* 5 */
  }
}
package _11_overerving.qz08.package_02;

public class Superklasse
{
  public String str1 = "1";
  protected String str2 = "2";
  String str3 = "3";
  private String str4 = "4";
}
