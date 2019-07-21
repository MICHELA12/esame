package Utility;

import Manager.CompagniManager;
import Model.Compagni;

public class Exe {

	public static void main(String[] args) {
		Compagni a = new Compagni();
		CompagniManager exe = new CompagniManager(); 
		a.setMatricola("AB1234");
		a.setNome("Annalisa");
		a.setCognome("Balena");
		
		System.out.println(exe.selectCompagnoById(a.getMatricola()).toString());		
		exe.updateCompagno(a);
		System.out.println(exe.selectCompagni().toString());
	}

}
