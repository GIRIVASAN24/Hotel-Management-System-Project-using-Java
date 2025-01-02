import java.util.*;
public class HotelManagementSystem {
    public static void main(String[] args) {
        RoomRentalSystem rental=new RoomRentalSystem();
        Room p1=new SingleBed("S007",500,10);
        Room p2=new DoubleBed("D006", 700,15);
        rental.addroom(p1);
        rental.addroom(p2);
        Scanner d = new Scanner(System.in);
        while(true){
            System.out.println("Room rental system options : ");
            System.out.println("1.Display Available Rooms");
            System.out.println("2.Rent a Room");
            System.out.println("3.Vacating a Room");
            System.out.println("4.Calculate total earnings : ");
            System.out.println("5.Exit");
            System.out.print("Enter the choice : ");
            int choice=d.nextInt();
            switch (choice)
            {
                case(1):
                    rental.displayAvailableRooms();
                    break;
                case 2:
                    System.out.print("Enter the Room no to rent : ");
                    String id = d.next();
                    System.out.print("Enter the Number of days : ");
                    int days = d.nextInt();
                    rental.rentalrooms(id, days);
                    break;
                case 3:
                    System.out.print("Enter the Room no to retrun : ");
                    String RoomNo = d.next();
                    rental.vacateRoom(RoomNo);
                    break;
                case 4:
                rental.calculatetotalearnings();
                break;
                case 5:
                    System.out.println("Thanks for Renting Room.......");
                    return;
                default:
                    System.out.println("Enter the valid choice:");
            }
        }
    }
}
