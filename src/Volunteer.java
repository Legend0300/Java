public class Volunteer {
    PersonalDetails details;
    Skills skillneeded;
    Skills skilloffered;
    int MembershipNumber;
    static int counter;
    DateAndTime RegisterationDate;
    MatchedUp matchedUp;

    Volunteer(PersonalDetails details, Skills skillneeded, Skills skilloffered , DateAndTime dateAndTime , MatchedUp matchedup)
    {
        this.matchedUp = matchedup;
        this.details = details;
        this.skillneeded = skillneeded;
        this.skilloffered = skilloffered;
        this.MembershipNumber = counter++;
        this.RegisterationDate = dateAndTime;
    }


    public String toString()
    {
        return "" + details + "Skill needed: " + skillneeded + "Skill offered: " + skilloffered + MembershipNumber + RegisterationDate;
    }
    
}
