

import java.util.*;

public class IDandPasswords {


    HashMap<String,String> Logininfo = new HashMap<String,String>();
    
    IDandPasswords()
    {
        Logininfo.put("Bro","pizza");
        Logininfo.put("Brometheus","PASSWORD");
        Logininfo.put("BroCode","abc123");
    }

    protected HashMap getLogininfo() {
        return Logininfo;
    }




    
}

