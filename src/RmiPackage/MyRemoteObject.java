package RmiPackage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class MyRemoteObject extends UnicastRemoteObject implements MyRemoteInterface{

	public MyRemoteObject() throws RemoteException {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return "Hello World";
	}

	@Override
	public double convertusd2tnd(double montantusd) throws RemoteException {
		// TODO Auto-generated method stub
		return montantusd * 3.09;
	}

	@Override
	public Date getServerDate() throws RemoteException {
		// TODO Auto-generated method stub
		return new Date();
	}

}
