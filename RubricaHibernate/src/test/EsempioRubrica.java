package test;

import model.*;
import servizi.Servizi;

public class EsempioRubrica {

	static Servizi serv;
	
	public static void main(String[] args) {
		
		serv = new Servizi();
		
		/// AGGIUNGI RUBRICA
		Rubrica r1 = serv.aggiungiRubrica("rubrica");
		
		/// AGGIUNGI VOCE
		Voce v1 = serv.aggiungiVoce("Mario", "Rossi", "12345", r1);
		Voce v2 = serv.aggiungiVoce("Antonio", "Neri", "67890", r1);
		Voce v3 = serv.aggiungiVoce("Francesco", "Bianchi", "13579", r1);
		
		
		/// CERCA VOCE
		Voce voceCercata1 = serv.cercaVoce("Mario", "Rossi");
		Voce voceCercata2 = serv.cercaVoce("Antonio", "Neri");
		Voce voceCercata3 = serv.cercaVoce("Francesco", "Bianchi");
		System.out.println(voceCercata1);
		System.out.println(voceCercata2);
		System.out.println(voceCercata3);
		
		
		/// CERCA TELEFONO
		Voce telefonoCercato1 = serv.cercaTelefono("12345");
		Voce telefonoCercato2 = serv.cercaTelefono("67890");
		Voce telefonoCercato3 = serv.cercaTelefono("13579");
		System.out.println(telefonoCercato1);
		System.out.println(telefonoCercato2);
		System.out.println(telefonoCercato3);
		
		
		/// MODIFICA VOCE
		Voce v4 = new Voce("Mario", "Rossi", "123", r1);
		/*if (serv.modificaVoce(v4, v1)){
			System.out.println("Voce modificata!");
		} else {
			System.out.println("Non è stato possibile modificare la voce!");
		}
		
		if (serv.modificaVoce(v2, v1)){
			System.out.println("Voce modificata!");
		} else {
			System.out.println("Non è stato possibile modificare la voce!");
		}*/
		
		System.out.println(serv.modificaVoce(v4));
		
	}
}
