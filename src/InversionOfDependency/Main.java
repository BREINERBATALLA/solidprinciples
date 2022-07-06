package InversionOfDependency;

import InversionOfDependency.WithPrinciple.*;

public class Main {
    public static void main(String[] args) {
        PostgreSqlAdapter postgreSql = new PostgreSqlAdapter(new PostgreSqlDB());
        MysqlAdapter mysqlAdapter = new MysqlAdapter(new MysqlDB());
        Store store = new Store(postgreSql);

        System.out.println(store.toConnect());


    }
}
