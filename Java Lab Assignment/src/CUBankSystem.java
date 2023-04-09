import java.util.Scanner;

public class CUBankSystem {
    Volunteer[] volunteers = new Volunteer[10];
    Staff[] staff = new Staff[10];
    {
        volunteers[0] = new Volunteer(new PersonalDetails("John", "hello@hello" , "pass" , "123456789"), new Skills("Java", "Java is a programming language", new DateAndTime(1, 1, 2020)), new Skills("JavaScript", "JavaScript is a programming language", new DateAndTime(1, 1, 2020)), new DateAndTime(1, 1, 2020) , new MatchedUp("", "" , ""));
        volunteers[1] = new Volunteer(new PersonalDetails("John1", "hello@hello1" , "pass11" , "1234567819"), new Skills("JavaScript", "Java is a programming language", new DateAndTime(1, 1, 2020)), new Skills("Java", "JavaScript is a programming language", new DateAndTime(1, 1, 2020)), new DateAndTime(1, 1, 2020) , new MatchedUp("", "" , ""));
        Staff.Matchup(volunteers);
    }

    public String GenerateReport()
    {
        for (int i = 0; i < volunteers.length; i++)
        {
            if(volunteers[i] != null)
            {
                System.out.println(volunteers[i].skillneeded.name + " " + volunteers[i].skilloffered.name + " " + volunteers[i].details.name);
            }
        }
        return "Generate Report";
    }

    public String StaffLogin(String email, String pass)
    {
        for (int i = 0; i < staff.length; i++)
        {
            if(staff[i] != null)
            {
                if (staff[i].staffDetails.email == email && staff[i].staffDetails.password == pass)
                {
                    System.out.println("Staff Logged In");
                    System.out.println("staff logged in" + staff[i]);
                    return "Staff Logged In";
                }
            }
        }
        return "Staff Login";
    }


    public String VolunteerLogin(String name, String pass)
    {

        for (int i = 0; i < volunteers.length; i++)
        {
            if (volunteers[i].details.name == name && volunteers[i].details.password == pass)
            {
                System.out.println("Volunteer Logged In");
                return "Volunteer Logged In";
            }
        }
        return "Volunteer Login";
    }

    public String StaffRegister(String email, String pass)
    {
        for (int i = 0; i < staff.length; i++)
        {
            if (staff[i] == null)
            {
                staff[i] = new Staff(email, pass);
                System.out.println("Staff Registered");
                return "Staff Registered";
            }
        }
        System.out.println("Staff Register");
        return "Staff Register";
    }


    

    public String VolunteerRegister()
    {
        Scanner scanner = new Scanner(System.in);
          // Volunteer registration
          System.out.println("Enter your name:");
          String name = scanner.nextLine();
          
          System.out.println("Enter your email:");
          String email = scanner.nextLine();
          
          System.out.println("Enter your password:");
          String password = scanner.nextLine();
          
          System.out.println("Enter your mobile phone number:");
          String mobile = scanner.nextLine();
          
          PersonalDetails personalDetails = new PersonalDetails(name, email, password, mobile);
          
          System.out.println("Enter your skill needed:");
          String skillName = scanner.nextLine();
          
          System.out.println("Enter a note about your skill:");
          String skillNote = scanner.nextLine();
          
          System.out.println("Enter the date and time of when you need this skill:");
          System.out.println("Day:");
          int day = scanner.nextInt();
          System.out.println("Month:");
          int month = scanner.nextInt();
          System.out.println("Year:");
          int year = scanner.nextInt();
          DateAndTime skillNeededDate = new DateAndTime(day, month, year);
          Skills skillNeeded = new Skills(skillName, skillNote, skillNeededDate);
          
          scanner.nextLine(); // consume newline character left by nextInt() method
          
          System.out.println("Enter your skill offered:");
          skillName = scanner.nextLine();
          
          System.out.println("Enter a note about your skill:");
          skillNote = scanner.nextLine();
          
          System.out.println("Enter the date and time of when you can offer this skill:");
          System.out.println("Day:");
          day = scanner.nextInt();
          System.out.println("Month:");
          month = scanner.nextInt();
          System.out.println("Year:");
          year = scanner.nextInt();
          DateAndTime skillOfferedDate = new DateAndTime(day, month, year);
          Skills skillOffered = new Skills(skillName, skillNote, skillOfferedDate);
          
          scanner.nextLine(); // consume newline character left by nextInt() method
          
          DateAndTime registrationDate = new DateAndTime(day, month, year);
          MatchedUp matchedUp = new MatchedUp("", "", "");
          
          new Volunteer(personalDetails, skillNeeded, skillOffered, registrationDate, matchedUp);
          return "Volunteer Registered";
    }

}
