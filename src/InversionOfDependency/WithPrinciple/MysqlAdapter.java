package InversionOfDependency.WithPrinciple;

public class MysqlAdapter implements lConexion{

    private MysqlDB mysql;

    public MysqlAdapter(MysqlDB mysql){
        this.mysql = mysql;
    }
    @Override
    public String getConnection() {
        return mysql.connection();
    }
}
