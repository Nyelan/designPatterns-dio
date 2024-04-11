package dio.projectTypes.subSystem2.cep;

import dio.projectTypes.singleton.SingletonEager;

public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi(){}

    public static CepApi getInstance(){
        return instance;
    }

    public String returnCity(String cep){
        return "Porto Alegre";
    }

    public String returnState(String cep){
        return "Rio Grande do Sul";
    }

}
