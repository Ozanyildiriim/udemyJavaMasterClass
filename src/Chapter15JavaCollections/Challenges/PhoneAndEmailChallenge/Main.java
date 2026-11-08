package Chapter15JavaCollections.Challenges.PhoneAndEmailChallenge;

import java.util.HashSet;
import java.util.Set;

public class Main {

    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> phones = new HashSet<>();

    public Main(String name) {
        this(name,null) ;
    }

    public Main(String name, String email) {
        this(name,email,0) ;
    }

    public Main(String name, long phone) {
        this(name,null,phone) ;
    }

    public Main(String name,String email, long phone) {
        this.name = name;
        if(email != null){
            emails.add(email);
        }
        if(phone > 0){
            String p = String.valueOf(phone);
            p = "(%s) %s-%s".formatted(p.substring(0, 3), p.substring(3, 6),
                    p.substring(6));
            phones.add(p);
        }
    }

}
