package models.api.reqres;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "Users")
public class Users {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    @XmlElement(name = "user")
    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "users{" +
                "users=" + users +
                '}';
    }
}
