package InterfaceSegregation.WithoutPrinciple;



public class UserService implements ICrud<User> {


    @Override
    public String delete(User entity) {
        return "User was deleted";
    }

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
}
