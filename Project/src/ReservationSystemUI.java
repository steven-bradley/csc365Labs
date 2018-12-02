import java.io.Console;
import java.util.Scanner;

public class ReservationSystemUI {

   public void displayMainMenu() {
      System.out.println("Welcome. Please choose your role:\n\n"
            + "- (A)dmin\n"
            + "- (O)wner\n"
            + "- (G)uest\n"
            + "- (Q)uit\n");
   }

   private void ownerLoop() {
      boolean exit = false;

      while (!exit) {
         displayOwnerMenu();

//         String[] tokens = input.nextLine().toLowerCase().split("\\s");
//         char option = tokens[0].charAt(0);
//         char dataOpt = 0;
//
//         if (tokens.length == 2)
//            dataOpt = tokens[1].charAt(0);
//
//         switch(option) {
//            case 'o':   System.out.println("occupancyMenu\n");
//               break;
//            case 'd':   System.out.println("revenueData\n");
//               break;
//            case 's':   System.out.println("browseRes()\n");
//               break;
//            case 'r':   System.out.println("viewRooms\n");
//               break;
//            case 'b':   exit = true;
//               break;
//         }
      }
   }

   private void guestLoop() {
      boolean exit = false;

//      while (!exit) {
//         displayGuestMenu();
//
//         char option = input.next().toLowerCase().charAt(0);
//
//         switch(option) {
//            case 'r':   System.out.println("roomsAndRates\n");
//               break;
//            case 's':   System.out.println("viewStays\n");
//               break;
//            case 'b':   exit = true;
//               break;
//         }
//      }
   }

   private void displayGuestMenu() {
      System.out.println("Welcome, Guest.\n\n"
            + "Choose an option:\n"
            + "- (R)ooms - View rooms and rates\n"
            + "- (S)tays - View availability for your stay\n"
            + "- (B)ack - Goes back to main menu\n");
   }

   private void clearScreen(){
      Console c = System.console();
      if (c != null) {
         //Clear screen first time
         System.out.print("\033[H\033[2J");
         System.out.flush();

         // Clear the screen again and place the cursor in the top left
         System.out.print("\033[H\033[1;1H");
         System.out.flush();
      }
   }

   private void displayAdminMenu() {
      // add your own information for the state of the database
      System.out.println("Welcome, Admin.\n\n"
            + "Current Status: " + "<put in state informnation>" + "\n"
            + "Reservations: " + "<put in count of reservations>" + "\n"
            + "Rooms: " + "<put in room information>" + "\n\n"
            + "Choose an option:\n"
            + "- (V)iew [table name] - Displays table contents\n"
            + "- (C)lear - Deletes all table contents\n"
            + "- (L)oad - Loads all table contents\n"
            + "- (R)emove - Removes tables\n"
            + "- (B)ack - Goes back to main menu\n");

   }

   private void displayOwnerMenu() {
      System.out.println("Welcome, Owner.\n\n"
            + "Choose an option:\n"
            + "- (O)ccupancy - View occupancy of rooms\n"
            + "- (D)ata [(c)ounts|(d)ays|(r)evenue] - View data on "
            + "counts, days, or revenue of each room\n"
            + "- (S)tays - Browse list of reservations\n"
            + "- (R)ooms - View list of rooms\n"
            + "- (B)ack - Goes back to main menu\n");
   }

   public void displayMenu(User usr){
      if(usr instanceof Admin)
         displayAdminMenu();
      else if(usr instanceof Owner)
         displayOwnerMenu();
      else if(usr instanceof Guest)
         displayGuestMenu();
   }
}
