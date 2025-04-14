package RmiPackage;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRmiClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		// localiser l'objet distant dans le registre des service
		MyRemoteInterface obj = (MyRemoteInterface) Naming.lookup("rmi://localhost:1099/MyRemoteObject");
		// invoquer une méthode sur l'objet distant
		String message = obj.sayHello();
		System.out.println("Message serveur: " + message);
		System.out.println("convertir 120 usd en dinars Tunisiens: " + obj.convertusd2tnd(120) );
		System.out.println("Date serveur: " + obj.getServerDate());
		

	}

}
