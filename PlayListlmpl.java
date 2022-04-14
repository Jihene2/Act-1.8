package playlist;

import java.util.ArrayList;

public class PlayListlmpl implements PlayListe {
	String nom;
	String genre;
	int nbreTitre;
	final int MAX_MUSIQUES=1;
	ArrayList<Musiquelmpl> list = new ArrayList<Musiquelmpl>();
	
	public PlayListlmpl(String nom, String genre, int nbreTitre,ArrayList<Musiquelmpl> list) {
		super();
		this.nom = nom;
		this.genre = genre;
		this.nbreTitre = nbreTitre;
		this.list = list;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getNbreTitre() {
		return nbreTitre;
	}
	public void setNbreTitre(int nbreTitre) {
		this.nbreTitre = nbreTitre;
	}
	
	
	public int getMAX_MUSIQUES() {
		return MAX_MUSIQUES;
	}		
		
		@Override
		public String toString() {
		return "PlayListeImpl list=" + list + "";
				
		}
	@Override
	public void AfficherPlaylist() {
	System.out.println(list.toString());
		}

	
	@Override
	public void AjouterMusique(Musiquelmpl musique) {
	if (list.size() < MAX_MUSIQUES)
	{
	list.add(musique);
	}
	else {
	System.out.println("La playliste est saturée");
	}
	}
}
	
	
	


