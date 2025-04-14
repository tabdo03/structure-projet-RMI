package RmiPackage;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteServer {

	public static void main(String[] args) throws Exception {
		// création de l'objet remote
		MyRemoteInterface obj = new MyRemoteObject();
		// création du registre rmi
		Registry registry = LocateRegistry.createRegistry(1099);
		// lier l'objet distant au registre
		Naming.bind("MyRemoteObject", obj);
		System.out.println("Serveur prêt");

	}

}
