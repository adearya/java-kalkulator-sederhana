import java.util.Scanner;
public class kalkulator {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        int numbers1, numbers2, choice, result= 0;
        char keluar;
        do{
            System.out.println("====================================\n");
            System.out.println(" -- Program Kalkulator Sederhana -- \n");
            System.out.println("Nomor Operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Pembagian");
            System.out.println("4. Perkalian");
            System.out.println("5. Sisa Bagi");
            System.out.println("------------------------------------");
 
            // input data
            System.out.print("Masukan Angka Pertama: ");
            numbers1 = input.nextInt();
            System.out.print("Masukan Angka Kedua: ");
            numbers2 = input.nextInt();
 
            // Pilihan Operasi
            System.out.print("Masukan Nomor Operasi: ");
            choice = input.nextInt();
            
            switch (choice)
            {
                case 1 : result = numbers1 + numbers2; break;
                case 2 : result = numbers1 - numbers2; break;
                case 3 : result = numbers1 / numbers2; break;
                case 4 : result = numbers1 * numbers2; break;
                case 5 : result = numbers1 % numbers2; break;
                default : System.out.println("Salah Memasukan Pilihan Harap Baca Pilihan di Menu");
            }
            System.out.println("Hasil: " + result);
            
            System.out.print("Lakukan perhitungan kembali? y/n: ");
            keluar = input.next().charAt(0);
        } while (keluar == 'y');
    }
}
