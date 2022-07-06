package InterfaceSegregation.WithPrinciple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientService implements IGetCreateUpdate<Client>{

    @Override
    public String getAll() {
        return "Getting all the clients" ;
    }

    @Override
    public String create(Client entity) {
        return "Client was created";
    }

    @Override
    public String Update(Client entity) {
        return "Client was updated";
    }
}
