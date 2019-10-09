package com.company.step4;

import java.util.HashMap;

public class Client {

    public DataManagerInterface dataManager;

    /*
     Dependency Injection - Constructor Injection
     Here Client class not creates a class of DataManager using new keyword or Factory class, it means Client class and DataManager class becomes loosly coupled class
    * */

    public Client(DataManagerInterface dataManager){
        this.dataManager = dataManager;
    }

    public void getClientDetails(int id){
        System.out.println("Asking the details of the client");
        HashMap<String,String> clientDetails = dataManager.getClientDetails(id);
        System.out.println("Retrieved the details of the Client");
    }
}
