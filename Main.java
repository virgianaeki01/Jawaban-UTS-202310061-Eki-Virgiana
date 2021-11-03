import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private String[] MenuList = {"Menginput Product","Melihat Product"};
    private String[] MyProduct = {"Beat","Vario"};
    private List<Beat> listBeat  = new ArrayList<Beat>();
    private List<Vario> listVario = new ArrayList<Vario>();
    

    public static void main(String[] args) {
        Main m = new Main();
        m.InputMenu();        
    }


    public void InputMenu() {
        Scanner myObj = new Scanner(System.in);
        int menu;
        
        System.out.println("\n\n--PROGRAM PENJUALAN MOTOR KERETA RASA--");
        System.out.println("\nPilih menu:");
        int i=1;
        for (String mu : this.MenuList) {
            System.out.println(i+". "+mu);
            i++;
        }
        System.out.print("\nMasukan pilihan menu : ");
        String inputMenu = myObj.nextLine();
        menu = Integer.parseInt(inputMenu);

        switch (menu) {
            case 1:
                this.InputMenuProduct();
                break;
            case 2:
                this.ShowMenuProduct();
                break;
        
            default:
            System.out.println("Pilihan tidak terdaftar");
                break;
        }
        myObj.close();
    }

    public void InputMenuProduct(){
        System.out.println("\n---------------------------");
        System.out.println("       Input Product         ");
        System.out.println("---------------------------\n");
        System.out.println("Pilih Produk : ");
        int i=1;
        for (String p : MyProduct) {
            System.out.println(i+". "+p);
            i++;
        }
        System.out.print("\nMasukan pilihan : ");
        Scanner myObj = new Scanner(System.in);
        int product;
        String inputProduct = myObj.nextLine();
        product = Integer.parseInt(inputProduct);
        switch (product) {
            case 1:                
                try {
                    listBeat = this.InputBeat();         
                    this.InputMenu();               
                } catch (Exception e) {
                    System.out.println("Failed error input produk Hp");
                    System.out.println("Error: "+e.getMessage());
                }    
            
                break;
            case 2:
                try { 
                    listVario = this.InputVario();  
                    this.InputMenu();              
                } catch (Exception e) {
                    System.out.println("Failed error input produk Dell");
                    System.out.println("Error: "+e.getMessage());
                }   
                break;
        
            default:
                break;
        }
        myObj.close();
    }


    public List InputBeat() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\n===Input Beat===");
        System.out.print("Masukan jumlah data yang dimasukan : ");
        int jmlData;
        String inputjmlData = myObj.nextLine();
        jmlData = Integer.parseInt(inputjmlData);
        for (int i = 0; i < jmlData; i++) {
            Beat a = new Beat();
            System.out.println("#data ke-"+(i+1)+":");
            System.out.print("Tipe = ");
            String tipe = myObj.nextLine();
            a.setTipe(tipe);
            
            System.out.print("Velg       = ");
            int velg= Integer.parseInt(myObj.nextLine());
            a.setVelg(velg);

            System.out.print("Ukuran Ban = ");
            String ukuran = myObj.nextLine();
            a.setUkuran(ukuran);

            System.out.print("Bobot       = ");
            Double bobot= Double.parseDouble(myObj.nextLine());
            a.setBobot(bobot);
        }
        System.out.println("\n");
        //myObj.close();
        return this.listBeat;      
    }

    public List InputVario() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\n===Input Vario===");
        System.out.print("Masukan jumlah data yang dimasukan : ");
        int jmlData;
        String inputjmlData = myObj.nextLine();
        jmlData = Integer.parseInt(inputjmlData);
        for (int i = 0; i < jmlData; i++) {
            Vario x = new Vario();
            System.out.println("#data ke-"+(i+1)+":");
            System.out.print("Tipe = ");
            String tipe = myObj.nextLine();
            x.setTipe(tipe);
            
            System.out.print("Velg       = ");
            int velg= Integer.parseInt(myObj.nextLine());
            x.setVelg(velg);

            System.out.print("Ukuran Ban = ");
            String ukuran = myObj.nextLine();
            x.setUkuran(ukuran);

            System.out.print("Bobot       = ");
            Double bobot= Double.parseDouble(myObj.nextLine());
            x.setBobot(bobot);
            
            listVario.add(x);
         
        }
        System.out.println("\n");
        //myObj.close();
        return this.listVario;       
    }

    public void ShowMenuProduct(){
        for (Beat a : this.listBeat) {
            System.out.println("===============================");
            System.out.println("Tipe Motor  : "+a.getTipe());
            System.out.println("Ukuran Velg : "+a.getVelg());
            System.out.println("Ukuran Ban : "+a.getUkuran());
            System.out.println("Bobot       : "+a.getBobot());
        }
        
        for (Vario x : this.listVario){
            System.out.println("===============================");
            System.out.println("Tipe Motor  : "+x.getTipe());
            System.out.println("Ukuran Velg : "+x.getVelg());
            System.out.println("Ukuran Ban : "+x.getUkuran());
            System.out.println("Bobot       : "+x.getBobot());
        }
    }    
}