package com.emysilva;

public class MegaByteConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
        public static void printMegaBytesAndKiloBytes(int kiloBytes) {
            if (kiloBytes < 0) {
                System.out.println("Invalid value");
            }
            int XX = kiloBytes;
            int YY = XX / 1024;
            int ZZ = XX % 1024;

            System.out.println(XX + " KB = " + YY + " MB and " + ZZ + " KB");
        }
}
