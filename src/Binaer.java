import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Binaer {
	static int[] datenStruktur = new int[100];
	static int gesamtZahl = 100;
	static int einmal = 0;
	static int neuerIndex;
	static int teilWert;
	static int zaehler;

	public static double logarithmusBase2(double a) {
		return Math.ceil(Math.log(a) / Math.log(2));
	}

	public static void suche(int gesZahl, int[] daten) {
		if (einmal == 0) {
			System.out.println("Die gesuchte Zahl ist: " + gesZahl);
			neuerIndex = daten.length / 2;
			teilWert = neuerIndex;
			zaehler = 0;
		}
		einmal = 1;
		zaehler++;
		if (daten[neuerIndex] > gesZahl) {
			neuerIndex = neuerIndex - teilWert / 2;
			teilWert = teilWert / 2;
			if (teilWert == 0) {
				teilWert = 2;
				zaehler--;
			}
		} else {
			neuerIndex = neuerIndex + teilWert / 2;
			teilWert = teilWert / 2;
			if (teilWert == 0) {
				teilWert = 2;
			}
		}
		if (daten[neuerIndex] != gesZahl){
			suche(gesZahl, daten);
		}
		System.out.println("die gesuchte Zahl " + daten[neuerIndex] + " wurde im Array gefunden");
		System.out.println("benötigte Schritte: " + zaehler);
	}

	public static void main(String[] args) {
		for (int i = 1; i <= gesamtZahl; i++) {
			datenStruktur[i - 1] = i;

		}
		System.out.println("Höchstanzahl der Suchdurchläufe: " + logarithmusBase2(datenStruktur.length + 1));
		suche(8, datenStruktur);
	}

}
