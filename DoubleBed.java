class DoubleBed extends Room{
    public double dailyrate;
    public int days;
    public DoubleBed(String roomno,double dailyrate,int days){
        super(roomno);
        this.dailyrate=dailyrate;
        this.days=days;
    }
    public double getrentcost(int days){
        return days*dailyrate;
    }
    public double getDailyrate(){
        return dailyrate;
    }
}

