public class MonthlyReport {
    Skills skillneeded;
    Skills skilloffered;
    Volunteer[] volunteers;
    
    MonthlyReport(Skills skillneeded, Skills skilloffered, Volunteer[] volunteers)
    {
        this.skillneeded = skillneeded;
        this.skilloffered = skilloffered;
        this.volunteers = volunteers;
    }


    public String toString()
    {
        return "" + skillneeded + skilloffered + volunteers;
    }
}
