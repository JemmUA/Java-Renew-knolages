package codeBro.swing.aps.loginSystem;

import java.util.HashMap;

public class IdPassword {
    HashMap<String, String> loginInfo ;

    IdPassword() {
        loginInfo = new HashMap<>();
        loginInfo.put("Bob", "pizza");
        loginInfo.put("Dem", "cars");
        loginInfo.put("Helen", "dogs");
        loginInfo.put("1", "1");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }

}
