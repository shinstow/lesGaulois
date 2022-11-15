package lesGaulois;

public class Table {
	//definir un type d'obj
	private String couleur;
	
	public Table(String couleur) {
		//attribuer une caracteristique a un type d'obj
		this.couleur = couleur;
	}
	
	public String getCouleur() {
		//recuperer la couleur 
		return this.couleur;
	}
	
	public void setCouleur(String couleur) {
		//define couleur
		this.couleur = couleur;
	}
	
	public static void main(String[] args) {
		//manipuler les trucs en haut
		int i = 0;
		int a = i;
		Table table1 = new Table("grise");
		Table table2 = table1;
		System.out.println(table1.getCouleur());
		System.out.println(table2.getCouleur());
		table2.setCouleur("noire");
		System.out.println(table1.getCouleur());
		System.out.println(table2.getCouleur());
	}
}
