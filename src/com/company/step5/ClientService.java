package com.company.step5;

public class ClientService {
    private Client client;

    public ClientService(){

        client = new Client();
        client.setDependency(new DataManager());
    }

    public void getClientDetails(int id){
        client.getClientDetails(id);
    }
}
