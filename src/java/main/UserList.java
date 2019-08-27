import java.util.ArrayList;
import java.util.UUID;


public class UserList extends ArrayList<User> {
    public User user;


    public User set(int index, User element) {
        user.userName="PellaPer";
        user.id=UUID.randomUUID();
        user.secutyTabId="ABC123";
        user.appartment="A1";
        return super.set(index, element);
    }
}


