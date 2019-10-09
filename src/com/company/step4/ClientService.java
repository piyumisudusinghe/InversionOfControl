package com.company.step4;

public class ClientService {

    private Client client;

    public ClientService(){
        client = new Client(new DataManager());
    }

    public void getClientDetails(int id){
        client.getClientDetails(id);
    }

}
