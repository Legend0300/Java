import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        CUBankSystem cubank = new CUBankSystem();
        Scanner input = new Scanner(System.in);
    int choice = 10;
    
    while (choice != 0) {
      System.out.println("Welcome to CUISkillBANK system!");
      System.out.println("Please select an option from the menu:");
      System.out.println("1. Volunteer registration");
      System.out.println("2. Volunteer login");
      System.out.println("3. Staff login");
      System.out.println("4. Director: generate monthly statistical report");
      System.out.println("5. Add Skills to offer");
      System.out.println("6. Remove Skills to Offer");
      System.out.println("7. Match up volunteers");
      System.out.println("8. Local community");
      System.out.println("9. Chat box");
      System.out.println("0. Exit");
      System.out.print("Enter your choice: ");
      choice = input.nextInt();
      
      switch (choice) {
        case 1:

            // Volunteer registration
            cubank.VolunteerRegister();
          // create a new volunteer object and register it
          break;
        case 2:
          // Volunteer login
          System.out.print("Please enter your email: ");
          String volunteerEmail = input.next();
          System.out.print("Please enter your password: ");
          String volunteerPassword = input.next();
          // log in the volunteer if email and password match

          cubank.VolunteerLogin(volunteerEmail, volunteerPassword);

          break;
        case 3:
          // Staff login
          System.out.print("Please enter your email: ");
          String staffEmail = input.next();
          System.out.print("Please enter your password: ");
          String staffPassword = input.next();
          
        String Loggedin = cubank.StaffLogin(staffEmail, staffPassword);
        System.out.println(Loggedin);
          break;
        case 4:
          // Director: generate monthly statistical report
          cubank.GenerateReport();
          break;
        case 5:
          // Skills to offer
          System.out.print("Please enter the name of the skill you offer: ");
          String skillofferedName = input.next();
          System.out.print("Please enter any notes about the skill: ");
          String skillNote = input.next();
          System.out.print("Please enter the date and time of the skill: ");
          String skillDateTime = input.next();
          // create a new skill object and add it to the volunteer's skills offered list

           

          break;
        case 6:
          // // Skills needed
          // System.out.print("Please enter the name of the skill you need: ");
          // String skillneededName = input.next();
          //   System.out.print("Please enter any notes about the skill: ");
          //   String skillNoteNeeded = input.next();
          //   System.out.print("Please enter the date and time the skill is needed: ");
          //   String skillDateTimeNeeded = input.next();

          Skills skills = new Skills("" , "" , new DateAndTime(2 , 4, 5));
// create a new skill object and add it to the volunteer's skills needed list
    break;
    
case 7:
// Match up volunteers
System.out.println("Matching up volunteers...");
Staff.Matchup(cubank.volunteers);

break;
case 8:
// Local community
System.out.print("Please enter the name of the community activity: ");
String communityName = input.next();
System.out.print("Please enter a description of the community activity: ");
String communityDescription = input.next();
System.out.print("Please enter the date and time of the community activity: ");
String communityDateTime = input.next();
System.out.print("Please enter the location of the community activity: ");
String communityLocation = input.next();
// create a new community event object and add it to the system's list of local events

LocalCommunity localCommunity = new LocalCommunity(communityName, communityDescription, communityDateTime, communityLocation);
System.out.println(localCommunity + " has been added to the system's list of local events.");
break;
case 9:
// Chat box
System.out.println("Chatting with the staff and volunteers...");
Chat chat = new Chat();
chat.StaffChat();
chat.VolunteerChat();
break;
case 0:
// Exit
System.out.println("Exiting CUISkillBANK system...");
break;
default:
System.out.println("Invalid choice. Please try again.");
}
}
}
}




class LocalCommunity{
    String communityName;
    String communityDescription;
    String communityDateTime;
    String communityLocation;

    LocalCommunity(String communityName, String communityDescription, String communityDateTime, String communityLocation){
        this.communityName = communityName;
        this.communityDescription = communityDescription;
        this.communityDateTime = communityDateTime;
        this.communityLocation = communityLocation;
    }

    public String toString(){
        return "Community name: " + communityName + "Community description: " + communityDescription + "Community date and time: " + communityDateTime + "Community location: " + communityLocation;
    }
}

