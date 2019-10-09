package com.company.step3;

public class DataManagerFactory {

    //create DataManager object and return it under the reference of DataManagerInterface
    public static DataManagerInterface getDataManagerObject(){
        return new DataManager();
    }
}
