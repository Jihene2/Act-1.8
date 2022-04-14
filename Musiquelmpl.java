package playlist;

import java.util.Comparator;
import java.util.Objects;

public class Musiquelmpl implements Musique {
	
	String titre;
	String autheur;
	String interprete;
	String genre;
	
	
	
	public Musiquelmpl(String titre, String autheur, String interprete, String genre) {
		super();
		this.titre = titre;
		this.autheur = autheur;
		this.interprete = interprete;
		this.genre = genre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAutheur() {
		return autheur;
	}

	public void setAutheur(String autheur) {
		this.autheur = autheur;
	}

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return " titre :" + titre + ",\n autheur:" + autheur + ",\n interprete:" + interprete + "\n genre="
				+ genre + "";
	}
	@Override
	public void AfficherMusique() {
		System.out.println(" ");
		System.out.println(toString());
		
	}

	@Override
	public boolean RessemblanceMusique(Musiquelmpl musique1, Musiquelmpl musique2) {
		boolean ressemblance=false;
		if (musique1.getTitre().equals(musique2.getTitre()) 
			& musique1.getAutheur().equals(musique2.getAutheur()) 
			& musique1.getInterprete().equals(musique2.getInterprete()) 
			& musique1.getGenre().equals(musique2.getGenre())) 
			{ressemblance=true;
		 System.out.println("la même musique");
			}
		 else 
		 {  System.out.println("c'est pas la même musique");
		 }
		 
		return ressemblance;
		
		
			
		
	
		
		
		
		  
	}
	
	}

	
	
		
		
	
