package Concu_chapter02_02.t23;

/**
 * Created by jamesmsw on 17-1-4.
 */
public class Userinfo {
    private String username;
    private String password;
    public Userinfo(String username,String password){
        super();
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
