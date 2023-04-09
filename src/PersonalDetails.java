public class PersonalDetails {
    String name;
    String email;
    String password;
    String MobileNumber;


    public PersonalDetails(String name, String email, String password, String MobileNumber)
    {
        this.name = name;
        this.email = email;
        this.password = password;
        this.MobileNumber = MobileNumber;
    }

    public PersonalDetails(String email, String password)
    {
        this.email = email;
        this.password = password;
    }


    public String toString()
    {
        return name + email + password + MobileNumber;
    }
}
