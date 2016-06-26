package ngdemo.model.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Daniel on 2015-10-14.
 */
@Entity
@Table(name = "tblplayer")
public class Player {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="SYS_UPDATE_DATE")
    private Date lastLogin;

    public Player(String id, String username, String password, Date lastLogin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.lastLogin = lastLogin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
}
