package com.company.step1;

import java.util.HashMap;

public class Client {

    public DataManager dataManager;

    //Class Client is responsible of creating and managing the life cycle of the instance of Class DataManager, Class Client tightly coupled with Class DataManager
    public Client(){
        dataManager = new DataManager();
    }

    public void getClientDetails(int id){
        System.out.println("Asking the details of the client");
        HashMap<String,String> clientDetails = dataManager.getClientDetails(id);
        System.out.println("Retrieved the details of the Client");
    }

}
