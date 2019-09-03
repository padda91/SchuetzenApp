import java.util.Random;
import java.util.Scanner;

public class Auswertung {

	public static void main(String[] args) {
		System.out.println("willkommen beim Schützenrechner! ");
		System.out.println("Hiermit kannst du ausrechnen wie hoch deine Präzision beim Schißen ist ");
		System.out.println("Bitte gebe nun die Anzahl der Schüsse ein");

		Scanner s = new Scanner(System.in);

		int p = 0;
		p = s.nextInt();
		int[] Schussmenge = new int[p];
		Fill(Schussmenge);
		Kalk(Schussmenge);
		printArray(Schussmenge);
	}

	public static void Fill(int[] Schussmenge) {

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < Schussmenge.length; i++) {
			System.out.println("Bitte Punktzahl für Schuss Nr: " + (i + 1) + " eingeben");

			Schussmenge[i] = s.nextInt();

		}
	}

	public static void Kalk(int[] Schussmenge) {
		int maximalePunktzahl = 0;
		int erreichtePunktzahl = 0;
		double schusspraezision = 0;
		for (int i = 0; i < Schussmenge.length; i++) {
			maximalePunktzahl = maximalePunktzahl + 10;

		}
		for (int i = 0; i < Schussmenge.length; i++) {
			erreichtePunktzahl = erreichtePunktzahl + Schussmenge[i];

		}

		schusspraezision = ((double) erreichtePunktzahl / (double) maximalePunktzahl) * 100;

		if (erreichtePunktzahl > maximalePunktzahl) {
			System.err.println("Fehler bei Eingabe, erreichte Punktzahl übersteigt Maximum von " + maximalePunktzahl);
			return;
		}
		System.out.println("Maximale Punktzahl " + maximalePunktzahl);
		System.out.println("Erreichte " + erreichtePunktzahl);
		System.out.println("Treffergenauigkeit liegt bei " + schusspraezision + "%");

	}

	public static void printArray(int[] arr) {
		if (arr.length == 0) {
			System.out.println("[  ]");
			return;
		}
		System.out.print("[");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length - 1] + "]");
	}

}
