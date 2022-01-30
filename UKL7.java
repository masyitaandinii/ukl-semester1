/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl7;

import java.util.Scanner;

public class UKL7 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int id, ortu, bulan; //input data
        String nama[] = {"Mira", "Nina", "Oemar", "Pena"};
        String jalur[] = {"SBMPTN", "SNMPTN", "Mandiri", "SBMPTN"};
        String alamat[] = {"Sawojajar", "Kedung Kandang", "Ijen", "Dinoyo"};

        System.out.print("Masukkan ID Mahasiswa\t= ");
        id = input.nextInt();
        if (id < 1 || id > nama.length) {//apabila inputan tidak sesuai
            System.out.println("SALAH INPUT");
            System.exit(0);
        }
        System.out.print("Masukkan Pendapatan Ortu\t= "); //inputan user
        ortu = input.nextInt();
        System.out.print("Masukkan Jumlah Bulan SPP\t= ");
        bulan = input.nextInt();

        System.out.println("============hasil============");//penampilan output dan pemanggilan variabel
        System.out.println("ID Mahasiswa\t\t\t= " + id);
        System.out.println("Nama Mahasiswa\t\t\t= " + nama[id - 1]);
        System.out.println("Jalur Masuk\t\t\t= " + jalur[id - 1]);
        System.out.println("Kategori Pendapatan\t\t= " + kategori(ortu));
        String kategori = kategori(ortu);

        System.out.println("Jumlah Biaya\t\t\t= " + biaya(kategori, jalur[id - 1], bulan));
        System.out.println("Alamat\t\t\t\t= " + alamat[id - 1]);
    }

    static int biaya(String kategori, String jalur, int bulan) { //proses perhitungan biaya
        int dsp, spp, biaya = 0;
        if (jalur.equalsIgnoreCase("sbmptn")) {
            if (kategori.equalsIgnoreCase("A")) {
                dsp = 5000000;
                spp = 500000;
                biaya = (dsp + spp);
            } else if (kategori.equalsIgnoreCase("B")) {
                dsp = 15000000;
                spp = 1000000;
                biaya = (dsp + spp);
            } else if (kategori.equalsIgnoreCase("C")) {
                dsp = 30000000;
                spp = 2000000;
                biaya = (dsp + spp);
            }
        } else if (jalur.equalsIgnoreCase("snmptn")) {
            if (kategori.equalsIgnoreCase("A")) {
                dsp = 7000000;
                spp = 500000;
                biaya = dsp + (spp * bulan);
            } else if (kategori.equalsIgnoreCase("B")) {
                dsp = 17000000;
                spp = 1000000;
                biaya = (dsp + spp);
            } else if (kategori.equalsIgnoreCase("C")) {
                dsp = 35000000;
                spp = 2000000;
                biaya = (dsp + spp);
            }
        } else if (jalur.equalsIgnoreCase("mandiri")) {
            if (kategori.equalsIgnoreCase("A")) {
                dsp = 1000000;
                spp = 100000;
                biaya = (dsp + spp);
            } else if (kategori.equalsIgnoreCase("B")) {
                dsp = 25000000;
                spp = 2000000;
                biaya = (dsp + spp);
            } else if (kategori.equalsIgnoreCase("C")) {
                dsp = 50000000;
                spp = 3000000;
                biaya = (dsp + spp);
            }
        }
        return biaya;
    }

    static String kategori(int ortu) {// proses penentuan golongan orang tua
        String kategori = "";
        if (ortu > 10000000) {
            kategori = "C";
        } else if (ortu >= 2000000) {
            kategori = "B";
        } else if (ortu <= 2000000) {
            kategori = "A";
        }
        return kategori;
    }

}
