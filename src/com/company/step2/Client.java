package com.company.step2;


import java.util.HashMap;

public class Client {

    public DataManager dataManager;

    /*Class Client not creates an object of Class DataManager, it gets an object of DataManager through Factory class
      Since method in Factory class is static Class Client doesn't  need to create a class of Factory
      Now Class Client is free from the Class DataManager object creation
      But it still depends on the DataManager, Still Client Class uses concrete class of DataManager
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
