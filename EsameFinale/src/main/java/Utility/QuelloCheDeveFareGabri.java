package Utility;

public class QuelloCheDeveFareGabri {

	//1. Creare una classe con al suo interno un metodo statico di tipo Connection per la connessione al DB
		// --> nel nostro caso package Utility : DbConnection : getConnection method
	//2. Creare tante classi quante sono le classi del DB (se il db all'esame avrà tante classi dovrai creare solo 
	//		quelle con cui interagirai non è necessario crearle tutte) mettendo come variabili le colonne della tabella
	//		ricorda anche di creare i getter/setter
		// --> nel nostro caso package Model : Compagni 
	//3. Creare tanti classi Manager quante sono le model. In questa classe ci sono tutti i metodi che gestiscono i dati del db.
	//		A ogni metodo corrisponde una query per esempio select o insert 
		// --> nel nostro caso package Manager : CompagniManager : es. selectCompagnoById(String matricola)
	//4. Creazione delle jsp e dei relativi controller
	
	
	// 				GESTIONE DI ERRORI O 
	//0. Creare un simple maven project estensione war 
	// 	 Il progetto si aprirà con un errore nel pom --> aggiungere 3 properties nell'overview : 
																				// -->failOnMissingWebXml : false
																				// -->maven.compiler.source : 1.8
																				// -->maven.compiler.target : 1.8
	
	//1. Creando la connessione potrebbe dare molti errori : se da errori con la Class.forName probabilmente il problema è il Driver
	//	 controllare che sia com.mysql.cj.jdbc.Driver e aggiungere al pom la sua dipendenza (maven repository: mysql) 
	// 	 Se da errori con il resto il problema potrebbe essere la stringa di connessione (recuperabile online) 
	//	 A volte serve mettere anche ?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC nella coda
	// 	 della stringa di connessione. --> online "cercando stringa di connessione mysql jdbc": "jdbc:mysql://localhost:3306/NomeDB?user=root&password=""";
	//	 Cercando "stringa di connessione mysql jdbc con timezone" trovi : String url= "jdbc:mysql://localhost:3306/progettodatabase?
	//		 useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=CET"; 
	
	//3. A questo punto ricordati di creare un costruttore di questa classe che faccia la connessione e di creare metodi non statici in modo che
	//	 quando richiamerai i vari metodi dovrai fare un istanza della classe e quindi in automatico la connessione.
	// 	 Cercando online "select con jdbc" o cose del genere trovi metodi che assomigliano a quello che devi fare. 
	// 	 Se cerchi di capire qui cosa fa cosa, ricercare le informazioni domani non sarà difficile 
	// 	 ATTENZIONE LE QUERY E I METODI SI POSSONO FARE IN DIVERSI MODI MA LA SELECT FUNZIONA SOLO IN ALCUNI NON IN TUTTI 
	// 	 Dai un occhiata alla parte in cui c'è scritta la query e al modo in cui vengono passati i parametri con i ? +
	
	//4. Per far funzionare le jsp sono necessarie diverse cose. Inanzi tutto nel pom devi aggiungere la javaee provider e la jstl. 
	//	 Quando fal una pag jsp potrebbe creartela con in cima solo un tag <%.. cerca su internet "uri jstl" e la risposta è su stackoverflow 
	//	 <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
	// 	 Non esce sempre in automatico 
	
	//4. Per i controller devi fare webservlet --> ricordati che nella creazione la parte più importante è l'url 
	//	 Quando la crei non tutti i simpatici PC la creano come devono e a volte il tag @WebServlet("/url) manca .. scrivilo a mano
	// 	 Se da errori su quello potrebbe chiederti di fixare il progetto, fallo senza problemi che risolve il prob (se hai importato correttamente 
	//	 il provider non te lo chiede) e poi di importare la classe. 
	// 	 La parte complicata è ricordarsi come si fa un controller .. ricordati che su internet npon trovi niente di pertinente --> la struttura la 
	//	 devi ricordare. al massimo puoi trovare cose come :"fare una request" "fare una response" "inviare i dati da una webservlet a un altra" etc.
	
	
}
