package InterfaceSegregation.WithPrinciple;

public class User {
    private String email;
    private String password;
    private String rol;
    private String code;

    public User(String email, String password, String rol, String code) {
        this.email = email;
        this.password = password;
        this.rol = rol;
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
