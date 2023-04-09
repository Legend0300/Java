public class Staff {
    public String matchUp()
    {
        return "Match Up";
    }
    String email;
    String password;

    PersonalDetails staffDetails;

    

    public Staff(String email, String password)
    {
        this.staffDetails = new PersonalDetails(email, password);
    }

    public static String Matchup(Volunteer[] volunteers)
    {
        for (int i = 0; i < volunteers.length; i++)
        {
            if(volunteers[i] != null)
            {
                for(int j = 0; j < volunteers.length; j++)
                {
                    if(volunteers[i] != null)
                    {
                        if(volunteers[i].skillneeded.name == volunteers[j].skilloffered.name && volunteers[j].skillneeded.name == volunteers[i].skilloffered.name)
                        {
                            System.out.println("skill matched");
                            volunteers[i].matchedUp = new MatchedUp(volunteers[i].details.name, volunteers[j].details.name, volunteers[i].skillneeded.name);
                            volunteers[j].matchedUp = new MatchedUp(volunteers[j].details.name, volunteers[i].details.name, volunteers[j].skillneeded.name);
                            return "skill matched";
                        }
                    }
                }
            }
            else
            {
                System.out.println("no skill matched");
                return "no skill matched";
            }

        }
        return "no skill matched";
    }


    public String toString()
    {
        return staffDetails.toString();
    }

}
