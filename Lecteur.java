package playlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecteur {

	public static void main(String[] args) {
		File file= new File("Ma playlist.doc");
		 BufferedReader bufferreader = null;
        try {
			FileReader fileReader=new FileReader(file);
			bufferreader = new BufferedReader(fileReader);
		} catch (FileNotFoundException e) {
			System.err.printf("le fichier %s n'a pas ?t? trouv?",file.toString());
			
		}
        try {
		try {
			bufferreader.close();
		} catch (IOException e) {
			System.err.printf("Impossible de fermer le fichier",file.toString());
		}
        } catch(NullPointerException e) {
        	System.err.printf("Impossible d'ouvrir le fichier",file.toString());}
	}
	// Fonction enregistrement de la playlist d'un utilisateur dans un autre.
	public void Enregistrement() {
		try {
		File file1= new File("Ma playlist.doc");
		File file2= new File("User playlist.doc");
		FileWriter filewriter = new FileWriter("User playlist.doc");
		PrintWriter printWriter= new PrintWriter (filewriter );
		Scanner scan = new Scanner(file1);
		while (scan.hasNextLine()) {
			String texte=scan.nextLine();
			printWriter.println(texte);}
		printWriter.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
        


        
	
	
