package accountService;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
    private  final HashMap<String,String> user;
    public AccountService() {
       user = new HashMap<>();

    }
    public  void  addUser(String login, String password){
        user.put(login,password);
    }

    public HashMap<String, String> getUser() {
        return user;
    }
}
