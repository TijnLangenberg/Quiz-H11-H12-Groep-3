
import java.util.Scanner;

public class Opdrachth11 {

	public static void main(String[] args) {
		Scanner tafelinvoer = new Scanner(System.in);
		System.out.println("Welke tafel wilt u weten?");
		int tafel = tafelinvoer.nextInt();
		
		Scanner herhaling = new Scanner(System.in);
		System.out.println("Hoe vaak wil je de tafel vermenigvuldigen?");
		int aantal = herhaling.nextInt();
		
		int loop = 0;
		
		while (loop <= aantal) {
			loop++;
			System.out.println(loop + "x" +tafel + "=" +tafel * loop);
		}
		tafelinvoer.close();
		herhaling.close();
	}
}