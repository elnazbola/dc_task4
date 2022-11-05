package com.dctask4;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Service extends Remote {
    Integer get() throws RemoteException;
    void send(int num) throws RemoteException;
    void storeCalculated(int num) throws RemoteException;
}
