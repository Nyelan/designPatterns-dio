package dio.projectTypes.facade;

import dio.projectTypes.subSystem1.crm.CrmService;
import dio.projectTypes.subSystem2.cep.CepApi;

public class Facade {

    public void customerMigration(String name, String cep){
        String city = CepApi.getInstance().returnCity(cep);
        String state = CepApi.getInstance().returnState(cep);

        CrmService.saveCustomer(name, cep, city, state);
    }

}
