abstract class Room {
    private boolean available;
    private String roomno;
    public Room(String roomno){
        this.roomno=roomno;
        this.available=true;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public String getRoomno(){
        return roomno;
    }
    public void setRoomno(String roomno){
        this.roomno=roomno;
    }
    public abstract double getrentcost(int days);
    public abstract double getDailyrate();
}
