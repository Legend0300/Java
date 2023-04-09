public class MatchedUp {
    String email;
    String name;
    String number;


public MatchedUp(String email, String name, String number)
    {
        this.email = email;
        this.name = name;
        this.number = number;
    }


    public String toString()
    {
        return email + name + number;
    }
}
