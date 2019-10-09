package com.company.step1;

import java.util.HashMap;

public class DataManager {

    public HashMap<String,String> getClientDetails(int id){
        //connect with the database and retrieve the data relevant to the given client id
        System.out.println("Getting details of the client" + id);
        HashMap<String,String>clientDetails = new HashMap<String,String>();
        clientDetails.put("id", String.valueOf(id));
        clientDetails.put("firstname","Piyumi");
        clientDetails.put("lastname","Sudusinghe");
        clientDetails.put("country","Sri Lanka");
        clientDetails.put("city","Matara");

        return clientDetails;
    }
}
