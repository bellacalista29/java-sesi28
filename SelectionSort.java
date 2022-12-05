import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        // buat objek scanner
        Scanner scan = new Scanner(System.in);

        // input jumlah data
        System.out.print("Masukkan jumlah data : ");
        int jumlahData = scan.nextInt();

        // input nilai tiap data
        int[] data = new int[jumlahData];
        System.out.println();

        // array untuk nilai tiap data
        for (int x = 0; x < jumlahData; x++) {
            System.out.print("Input nilai data ke-" + (x + 1) + " : ");
            data[x] = scan.nextInt();
        }

        // tampilkan data sebelum di sorting
        System.out.println();
        System.out.print("Data sebelum di sorting : ");
        for (int x = 0; x < jumlahData; x++) {
            System.out.print(data[x] + " ");
        }

        // proses selection sort
        System.out.println("\n\nProses selection sort");

        for(int x = 0; x < jumlahData-1; x++)
        {
            System.out.println("Iterasi ke-" + (x+1) + " : ");
            for(int y = 0; y<jumlahData; y++)
            {
                System.out.print(data[y] + " ");
            }
            System.out.println("Apakah data " + data[x] + " sudah benar pada urutannya?");

            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = "Tidak ada pertukaran";
            for(int y = x+1; y < jumlahData; y++)
            {
                if(min > data[y])
                {
                    tukar = true;
                    index = y;
                    min = data[y];
                }
            }

            if(tukar == true)
            {
                //pertukaran data
                pesan = "Data " + data[x] + " ditukar dengan data " + data[index];
                int temp = data[index];
                data[index] = temp;
            }

            for(int y = 0; y < jumlahData; y++)
            {
                System.out.println(data[y] + " ");
            }
            System.out.println(pesan + "\n");
        }

        //tampilkan data setelah di sorting
        System.out.print("Data setelah di sorting : ");
        for(int x = 0; x < jumlahData; x++)
        {
            System.out.print(data[x] + " ");
        }
    }
}