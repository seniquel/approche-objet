package sets;

import fr.diginamic.testenumeration.Continent;

public class Pays implements Comparable<Pays> {
	private String nom;
	private int nbHab;
	private double PIBhab;
	private Continent continent;
	
	/** Constructeur
	 * @param nom
	 * @param nbHab Nombre d'habitants
	 * @param pIBhab PIB par habitant
	 */
	public Pays(String nom, int nbHab, double pIBhab) {
		this.nom = nom;
		this.nbHab = nbHab;
		this.PIBhab = pIBhab;
		this.continent = Continent.INCONNU;
	}
	/** Constructeur
	 * @param nom
	 * @param nbHab Nombre d'habitants
	 * @param pIBhab PIB par habitant
	 * @param continent
	 */
	public Pays(String nom, int nbHab, double pIBhab, Continent continent) {
		this.nom = nom;
		this.nbHab = nbHab;
		this.PIBhab = pIBhab;
		this.continent = continent;
	}
	
	public double PIBtot() {
		return nbHab*PIBhab;
	}
	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Getter
	 * @return the nbHab
	 */
	public int getNbHab() {
		return nbHab;
	}
	/** Setter
	 * @param nbHab the nbHab to set
	 */
	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}
	/** Getter
	 * @return the pIBhab
	 */
	public double getPIBhab() {
		return PIBhab;
	}
	/** Setter
	 * @param pIBhab the pIBhab to set
	 */
	public void setPIBhab(double pIBhab) {
		PIBhab = pIBhab;
	}
	/** Getter
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}
	/** Setter
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	@Override
	public String toString() {
		return nom + " ("+this.continent.getNom()+") "+ ": Nb habitants = " + nbHab + ", Pib/Hab = "+ PIBhab + ", PIB total = " + this.PIBtot()+"\n";
	}

	/** Compare deux pays en fonction de leur PIB par habitant
	 */
	@Override
	public int compareTo(Pays pays) {
		Double d1 = this.PIBhab;
		Double d2 = pays.PIBhab;
		return d1.compareTo(d2);
	}
	

}
