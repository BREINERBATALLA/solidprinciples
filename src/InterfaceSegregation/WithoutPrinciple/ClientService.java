package InterfaceSegregation.WithoutPrinciple;

import java.lang.UnsupportedOperationException;

public class ClientService implements ICrud<Client> {


    @Override
    public String delete(Client entity){
         return "Client doesn't implement this operation";
    }

    @Override
    public String getAll() {
        return "User was deleted";
    }

    @Override
    public String create(Client entity) {
        return null;
    }

    @Override
    public String Update(Client entity) {
        return null;
    }
}
