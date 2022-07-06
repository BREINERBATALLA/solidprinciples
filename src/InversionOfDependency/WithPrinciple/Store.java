package InversionOfDependency.WithPrinciple;

public class Store {

    private lConexion conexion;

    public Store(lConexion conexion){
        this.conexion=conexion;
    }

    public String toConnect(){
        return conexion.getConnection();
    }
/*
    public void setConexion(lConexion conexion) { //Other way to do dependency injection.
        this.conexion=conexion;
    }

*/
}
