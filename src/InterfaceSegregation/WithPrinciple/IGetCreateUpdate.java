package InterfaceSegregation.WithPrinciple;

import java.util.List;

public interface IGetCreateUpdate<T> {
    String getAll();
    String create(T entity);
    String Update(T entity);
}
