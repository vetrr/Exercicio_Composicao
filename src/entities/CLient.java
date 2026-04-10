package entities;

import java.util.Date;

public class CLient {
    String name;
    String email;
    Date birthDate;

    public CLient(){
    }
    public CLient(String name, String email, Date birthDate){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String toString(){
        return "Client: " + name + "(" + birthDate + ")" + "-" + email;
    }

}
