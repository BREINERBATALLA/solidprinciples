package InversionOfDependency.WithPrinciple;

public class PostgreSqlAdapter implements lConexion{

    private PostgreSqlDB postgreSql;

    public PostgreSqlAdapter(PostgreSqlDB postgreSql){
        this.postgreSql = postgreSql;
    }

    @Override
    public String getConnection() {
        return postgreSql.turnOn();
    }
}
