package DataRobot;

public class Produser {
    public String NamaProduser;
    public String AlamatProduser;

    public Produser(String NamaProduser, String AlamatProduser) {
        this.NamaProduser = NamaProduser;
        this.AlamatProduser = AlamatProduser;
    }

    public void LihatProduser(){
        System.out.println("Nama Produser   : " + NamaProduser);
        System.out.println("Alamat Produser : " + AlamatProduser);
    }
}
