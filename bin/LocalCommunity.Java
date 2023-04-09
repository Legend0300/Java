public class LocalCommunity()
{
    String name;
    String location;
    String description;
    DateAndTime dateandtime;


    public LocalCommunity(String name, String location, String description, DateAndTime dateandtime)
    {
        this.name = name;
        this.location = location;
        this.description = description;
        this.dateandtime = dateandtime;
    }

    public toString ()
    {
        return name + location + description + dateandtime;
    }
    
}