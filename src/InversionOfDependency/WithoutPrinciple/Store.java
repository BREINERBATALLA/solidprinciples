package InversionOfDependency.WithoutPrinciple;

public class Store {
    private MysqlDB mysql;

    //High coupling, we'll have a trouble if we change the DB,
    //We must to have a low coupling for the external libraries and frameworks,
    //because ours system must not depends on low level modules
    public Store(MysqlDB mysql){
        this.mysql = mysql;
    }

    public String toConnect(){
        return mysql.connection();
    }
}
