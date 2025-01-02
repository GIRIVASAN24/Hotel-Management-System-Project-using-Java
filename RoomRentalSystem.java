import java.util.ArrayList;
import java.util.List;
public class RoomRentalSystem{
    private List<Room> invent;
    public RoomRentalSystem(){
        this.invent=new ArrayList<>();
    }
    public void addroom(Room p1){
        invent.add(p1);
    } 
    public void displayAvailableRooms(){
        System.out.println("Available Rooms : ");
        for(Room i:invent){
            if(i.isAvailable()){
                System.out.println("RoomNo : "+i.getRoomno()+" Cost for one day : "+i.getDailyrate());
            }
        }
    }
    public void rentalrooms(String roomno,int days){
        for(Room i:invent){
            if(i.getRoomno().equals(roomno)&&i.isAvailable()){
                i.setAvailable(false);
                System.out.println("Room : "+roomno+" rented for : "+days+" days "+"Total cost : "+i.getrentcost(days));
                return;
            }
        }
        System.out.println("Room not available or not found");

    }
    public void vacateRoom(String roomno){
        for(Room i:invent){
            if(i.getRoomno().equals(roomno)&&i.isAvailable()){
                i.setAvailable(true);
                System.out.println("Room : "+roomno+" returned.");
                return;
            }
        }
        System.out.println("Room not found or returned.");
    }
    public void calculatetotalearnings(){
        double totalearnings=0;
        for(Room i:invent){
            if(!i.isAvailable()) {
    			totalearnings+=i.getrentcost(1);
    		}
    	}
    	System.out.println("Total Earnings: $"+totalearnings);
	}
}
