package DataRobot;

public class Robot {
    public String NamaRobot;
    public String SeriRobot;
    public String ProduserRobot;

    public Robot(String NamaRobot, String SeriRobot, String ProduserRobot) {
        this.NamaRobot = NamaRobot;
        this.SeriRobot = SeriRobot;
        this.ProduserRobot = ProduserRobot;
    }

    public void LihatRobot(){
        System.out.println("Nama Robot     : " + NamaRobot);
        System.out.println("Seri Robot     : " + SeriRobot);
        System.out.println("Produser Robot : " + ProduserRobot);
    }
}
