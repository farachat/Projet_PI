package bestdeal.esprit.util;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Verification {
	public Verification() {
	}

	public static boolean veriftel(String tel) {
		boolean etat = false;

		if (Pattern.matches("([0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9])", tel) == false) {
			etat = false;
		} else
			etat = true;

		return etat;
	}

	public static boolean verif_nb_couv(String nb) {
		boolean etat = false;

		if (Pattern.matches("([2-8])", nb) == false) {
			etat = false;
		} else
			etat = true;

		return etat;
	}

	public static boolean verif_nb_table(String nb) {
		boolean etat = false;

		if ((Pattern.matches("([1-4][0-9])", nb) == false)
				&& (Pattern.matches("([1-5][0-0])", nb) == false)) {
			etat = false;
		} else
			etat = true;

		return etat;
	}

	public static boolean verif_horaire(String hor) {
		boolean etat = false;

		if (Pattern.matches("([0-2][0-9]h-[0-5][0-9]h)", hor) == false) {
			etat = false;
		} else
			etat = true;

		return etat;
	}

	public static boolean verif_salaire(String sal) {
		boolean etat = false;

		if ((Pattern.matches("([0-9][0-9](( )*)DT)", sal) == false)
				&& (Pattern.matches("([0-9][0-9][0-9](( )*)DT)", sal) == false)
				&& (Pattern.matches("([0-9][0-9][0-9][0-9](( )*)DT)", sal) == false)) {
			etat = false;
		} else
			etat = true;

		return etat;
	}

	public static boolean verif_prix(String prix) {
		boolean etat = false;

		if ((Pattern.matches("([0-9]+).[0-9][0-9][0-9](( )*)DT", prix) == false)) {
			etat = false;
		} else
			etat = true;

		return etat;
	}

	public static boolean verif_quantite(String quan) {
		boolean etat = false;

		if ((Pattern.matches("([0-9]+)(( )*)([a-z]+)", quan) == false)) {
			etat = false;
		} else
			etat = true;

		return etat;
	}

	public boolean verfmail(String mail) {
		boolean etat = false;

		if (Pattern.matches(
				"^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$",
				mail) == false) {
			JOptionPane op3 = new JOptionPane();
			op3.showMessageDialog(null, "V�rifier Mail", "Erreur",
					JOptionPane.ERROR_MESSAGE);
			etat = false;
		} else

			etat = true;

		return etat;

	}

	public static void main(String arg[]) {
		/*boolean etat2;
		String a = "49";
		etat2 = verif_nb_table(a);
		if (etat2 == true)
			System.out.println(a);
		
		 * String s="1.300DT1.700DT1.400"; String str[]=s.split("DT");
		 * System.out.println(str[2]);
		 */
	//	System.out.println("C:\\Users\\DELL\\Desktop\\Nouveau dossier\\3id\\IMG_1162.JPG.".replaceAll("\\\\","/"));
		String backslash= System.getProperty("file.separator") ;
		String chaine = "c:"+backslash+"toto"+backslash+"titi";
		System.out.println( chaine );
		System.out.println( chaine.replace(backslash, "/") );	
	}

}
