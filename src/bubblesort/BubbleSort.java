/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Arrays;

/**
 *
 * @author WINDOWS 10
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Menginisialisasi Variable
        int[] bilangan = {5, 12, 3, 1};
        String identitas = "Muhammad Yusuf Ragil Syah An Naas / XRPL6 / 33";
        System.out.println("Identitas: " + identitas);
        //	Tampilkan bilangan
        System.out.println("\nBilangan sebelum di sorting Bubble Sort : " + Arrays.toString(bilangan));

        //	Proses Bubble Sort 
        System.out.println("\nProses Bubble Sort secara Ascending:");
        for (int a = 0; a < bilangan.length; a++) {
            //Melakukan looping sebanyak 4 elemennya

            //	Tampilkan proses Iterasi
            System.out.println("Iterasi " + (a + 1));
            for (int b = 0; b < bilangan.length - 1; b++) {
                //  Melakukan pengurangan looping yang dilakukan sampai jumlah elemen

                if (bilangan[b] > bilangan[b + 1]) {
                    //	proses pembandingan nilai dan pertukaran bilangan
                    int temp = bilangan[b];
                    bilangan[b] = bilangan[b + 1];
                    bilangan[b + 1] = temp;
                }

                //	Tampilkan proses pertukaran tiap iterasi
                System.out.println(Arrays.toString(bilangan));
            }
            System.out.println();
        }

        //	Tampilkan hasil akhir
        System.out.println("Hasil akhir setelah di sorting: " + Arrays.toString(bilangan));
    }
}
