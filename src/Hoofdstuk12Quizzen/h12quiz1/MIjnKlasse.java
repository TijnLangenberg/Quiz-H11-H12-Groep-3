package h12quiz1;
//h12quiz1 gemaakt door: Tijn.
public class MIjnKlasse {

	final int x = 3;
	
	int bereken(int y, int z)
	{
		if(y >= z)
		{
			return y = x;
		}
		else
		{
			//y = 5;       /* 1 */
			//z += 3;      /* 2 */
			//z = x / 2;   /* 3 */
			//int x = 6;   /* 4 */
			//x ++;        /* 5 */
			return z + x;
		}
	}
	public static void main(String[] args)
	{
		MIjnKlasse mk = new MIjnKlasse();
		System.out.println(mk.bereken(4,6));
	}
}
//opdracht1: nee
//opdracht2: ja