package com.company.step3;

import java.util.HashMap;

public class Client {

    public DataManagerInterface dataManager;

    /*
    Use DIP principle
    High-level modules should not depend on low-level modules. Both should depend on the abstraction.
    Abstractions should not depend on details. Details should depend on abstractions.
    High level module - Client
    Low level module - DataManager
    * */

    public Client(){
        dataManager = DataManagerFactory.getDataManagerObject();
    }

    public void getClientDetails(int id){
        System.out.println("Asking the details of the client");
        HashMap<String,String> clientDetails = dataManager.getClientDetails(id);
        System.out.println("Retrieved the details of the Client");
    }

}
