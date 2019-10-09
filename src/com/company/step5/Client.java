package com.company.step5;

import java.util.HashMap;

public class Client implements DataManagerInterfaceDependency{

    public DataManagerInterface dataManager;

    /*
     Dependency Injection - Interface Injection
     Here Client class not creates a class of DataManager using new keyword or Factory class, it means Client class and DataManager class becomes loosly coupled class
     inject the dependency using a interface
    * */

    public Client(){

    }

    @Override
    public void setDependency(DataManagerInterface dataManager) {
         this.dataManager = dataManager;
    }

    public void getClientDetails(int id){
        System.out.println("Asking the details of the client");
        HashMap<String,String> clientDetails = dataManager.getClientDetails(id);
        System.out.println("Retrieved the details of the Client");
    }
}
