package InterfaceSegregation.WithoutPrinciple;

public interface ICrud<T> {
    String delete(T entity);
    String getAll();
    String create(T entity);
    String Update(T entity);
}
