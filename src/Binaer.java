import java.lang.reflect.Array;
import java.util.ArrayList;

public class Binaer {
	static int[] daten = new int[100];
	static int gesamtZahl = 100;

	public static void suche() {
		int gesZahl = (int) (Math.random() * 101);
		System.out.println("Die gesuchte Zahl ist: " + gesZahl);
		int neuerIndex = daten.length / 2;
		int teilWert = neuerIndex;
		int zaehler = 0;
		while (daten[neuerIndex] != gesZahl) {
			zaehler++;
			if (daten[neuerIndex] > gesZahl) {
				neuerIndex = neuerIndex - teilWert / 2;
				teilWert = teilWert / 2;
				if (teilWert == 0) {
					teilWert = 2;
				}
			} else {
				neuerIndex = neuerIndex + teilWert / 2;
				teilWert = teilWert / 2;
				if (teilWert == 0) {
					teilWert = 2;
				}
			}
		}
		System.out.println("die gesuchte Zahl " + daten[neuerIndex] + " wurde im Array gefunden");
		System.out.println("benötigte Schritte: " + zaehler);
	}

	public static void main(String[] args) {
		for (int i = 1; i <= gesamtZahl; i++) {
			daten[i - 1] = i;

		}
		suche();
	}

}
