package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
	public static void main(String args[]) {
		
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		//Cr�er en utilisant des boucles une liste appel�e liste3 et qui contient l�ensemble des
		//donn�es des 2 listes pr�c�dentes.
		
		List<String> liste3 = new ArrayList<String>();
		for ( String i : liste1 ) {
			liste3.add(i);
		}
		for ( String i : liste2 ) {
			liste3.add(i);
		}
	}
}