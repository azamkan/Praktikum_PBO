package DataRobot;

public class ServiceCenter {
    public String NamaServiceCenter;
    public String AlamatServiceCenter;

    public ServiceCenter(String NamaServiceCenter, String AlamatServiceCenter) {
        this.NamaServiceCenter = NamaServiceCenter;
        this.AlamatServiceCenter = AlamatServiceCenter;
    }

    public void LihatServiceCenter(){
        System.out.println("Nama Service Center   : " + NamaServiceCenter);
        System.out.println("Alamat Service Center : " + AlamatServiceCenter);
    }
}
