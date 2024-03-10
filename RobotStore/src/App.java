import java.util.ArrayList;

import DataRobot.Robot;
import DataRobot.Produser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Robot> RobotList = new ArrayList<Robot>();
        ArrayList<Produser> ProduserList = new ArrayList<Produser>();

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        String menu1, menu2;
        int ubah,hapus;

        while (true) {
            System.out.print("""
                    ==============================
                    Menu:
                    1. Manajemen Robot
                    2. Manajemen Produser
                    3. Tampilkan Robot
                    4. Tampilkan Produser
                    0. Keluar
                    ==============================
                    """);
                    System.out.print("Masukkan Pilihan : ");
                    menu1 = br.readLine();
                    if (menu1.equals("1")) {
                        System.out.print("""
                            ==============================
                            Menu Manajemen Robot:
                            1. Tambah Robot
                            2. Ubah Robot
                            3. Hapus Robot
                            0. Kembali
                            ==============================
                            """);
                        System.out.print("Masukkan Pilihan : ");
                        menu2 = br.readLine();
                        if (menu2.equals("1")) {
                            System.out.println("==============================");
                            System.out.print("Masukkan Nama     : ");
                            String NamaRobot = br.readLine();
                            System.out.print("Masukkan Seri     : ");
                            String SeriRobot = br.readLine();
                            System.out.print("Masukkan Produser : ");
                            String ProduserRobot = br.readLine();
                            System.out.println("==============================");
                            RobotList.add(new Robot(NamaRobot, SeriRobot, ProduserRobot));

                        } else if (menu2.equals("2")) {
                            System.out.println("==============================");
                            for (int i = 0; i < RobotList.size(); i++) {
                                System.out.println("Data ke : " + i);
                                RobotList.get(i).LihatRobot();
                                System.out.println("==============================");
                            }
                            System.out.print("Pilih data yang akan diubah : ");
                            ubah = Integer.parseInt(br.readLine());

                            if (ubah <= RobotList.size()) {
                                System.out.println("==============================");
                                System.out.print("Masukkan nama baru     : ");
                                RobotList.get(ubah).NamaRobot = br.readLine();
                                System.out.print("Masukkan Seri baru     : ");
                                RobotList.get(ubah).SeriRobot = br.readLine();
                                System.out.print("Masukkan Produser Baru : ");
                                RobotList.get(ubah).ProduserRobot = br.readLine();
                                System.out.println("Data berhasil diubah");
                                System.out.println("==============================");
                            } else {
                                System.out.println("Data tidak ada");
                            }

                        } else if (menu2.equals("3")) {
                            System.out.println("==============================");
                            for (int i = 0; i < RobotList.size(); i++) {
                                System.out.println("Data ke : " + i);
                                RobotList.get(i).LihatRobot();
                                System.out.println("==============================");
                            }
                            System.out.print("Pilih data yang akan dihapus : ");
                            hapus = Integer.parseInt(br.readLine());
                            if (hapus <= RobotList.size()) {
                                System.out.println("Data berhasil dihapus");
                                RobotList.remove(hapus);
                            } else {
                                System.out.println("Data tidak ada");
                            }

                        } else if (menu2.equals("0")) {
                            continue;
                        } else {
                            System.out.println("Menu tidak ada");
                        }

                    } else if (menu1.equals("2")) {
                        System.out.print("""
                            ==============================
                            Menu Manajemen Produser:
                            1. Tambah Produse
                            2. Ubah produser
                            3. Hapus produser
                            0. Kembali
                            ==============================
                            """);
                        System.out.print("Masukkan Pilihan : ");
                        menu2 = br.readLine();
                        if (menu2.equals("1")) {
                            System.out.println("==============================");
                            System.out.print("Masukkan Nama     : ");
                            String NamaProduser = br.readLine();
                            System.out.print("Masukkan Alamat   : ");
                            String AlamatProduser = br.readLine();
                            System.out.println("==============================");
                            ProduserList.add(new Produser(NamaProduser, AlamatProduser));

                        } else if (menu2.equals("2")) {
                            System.out.println("==============================");
                            for (int i = 0; i < ProduserList.size(); i++) {
                                System.out.println("Data ke : " + i);
                                ProduserList.get(i).LihatProduser();
                                System.out.println("==============================");
                            }
                            System.out.print("Pilih data yang akan diubah : ");
                            ubah = Integer.parseInt(br.readLine());
                            if (ubah <= ProduserList.size()) {
                                System.out.println("==============================");
                                System.out.print("Masukkan nama baru     : ");
                                ProduserList.get(ubah).NamaProduser = br.readLine();
                                System.out.print("Masukkan Alamat baru   : ");
                                ProduserList.get(ubah).AlamatProduser = br.readLine();
                                System.out.print("Data berhasil diubah");
                                System.out.println("==============================");
                            } else {
                                System.out.println("Data tidak ada");
                            }

                        } else if (menu2.equals("3")) {
                            System.out.println("==============================");
                            for (int i = 0; i < ProduserList.size(); i++) {
                                System.out.println("Data ke : " + i);
                                ProduserList.get(i).LihatProduser();
                                System.out.println("==============================");
                            }
                            System.out.print("Pilih data yang akan dihapus : ");
                            hapus = Integer.parseInt(br.readLine());
                            if (hapus <= ProduserList.size()) {
                                System.out.println("Data berhasil dihapus");
                                ProduserList.remove(hapus);
                            } else {
                                System.out.println("Data tidak ada");
                            }

                        } else if (menu2.equals("0")) {
                            continue;
                        } else {
                            System.out.println("Menu tidak ada");
                        }
                    } else if (menu1.equals("3")) {
                        System.out.println("==============================");
                        if (RobotList.size() != 0) {
                            for (int i = 0; i < RobotList.size(); i++) {
                                RobotList.get(i).LihatRobot();
                                System.out.println("==============================");
                            }                  
                        } else {
                            System.out.println("Tidak ada data");
                        }

                    } else if (menu1.equals("4")) {
                        System.out.println("==============================");
                        if (ProduserList.size() != 0) {
                            for (int i = 0; i < ProduserList.size(); i++) {
                                ProduserList.get(i).LihatProduser();
                                System.out.println("==============================");
                            }             
                        } else {
                            System.out.println("Tidak ada data");
                        }
                    } else if (menu1.equals("0")) {
                        break;
                    } else {
                        System.out.println("Menu tidak ada");
                    }
            
        }
    }
}
