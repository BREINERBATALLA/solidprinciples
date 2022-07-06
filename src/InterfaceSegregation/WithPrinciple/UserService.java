package InterfaceSegregation.WithPrinciple;

public class UserService implements IGetCreateUpdate<User>, Idelete<User>{

    @Override
    public String getAll() {
        return "Getting all the users";
    }

    @Override
    public String create(User entity) {
        return "User was created";
    }

    @Override
    public String Update(User entity) {
        return "User was updated";
    }

    @Override
    public String delete(User entity) {
        return "User was deleted";
    }
}
