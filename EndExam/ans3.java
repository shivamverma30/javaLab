/*write a program to implement a basic encryption & description mechanism for file content */

import java.io.*;

class ans3 {
    public static void main(String[] args) {
        String inputFile = "input.txt";      
        String encryptedFile = "encrypted.txt";  
        String decryptedFile = "decrypted.txt"; 
        int key = 5; 

        encryptFile(inputFile, encryptedFile, key);
        decryptFile(encryptedFile, decryptedFile, key);
    }

    static void encryptFile(String inputFile, String outputFile, int key) {
        try {
            FileInputStream fin = new FileInputStream(inputFile);   
            FileOutputStream fout = new FileOutputStream(outputFile); 
            int ch;

            while ((ch = fin.read()) != -1) { // read till end of file
                fout.write(ch + key);         // simple encryption (add key)
            }

            fin.close();
            fout.close();
            System.out.println("Encryption done! Check file: " + outputFile);
        } catch (Exception e) {
            System.out.println("Error during encryption: " + e);
        }
    }

    static void decryptFile(String inputFile, String outputFile, int key) {
        try {
            FileInputStream fin = new FileInputStream(inputFile);  
            FileOutputStream fout = new FileOutputStream(outputFile); 
            int ch;

            while ((ch = fin.read()) != -1) {
                fout.write(ch - key);         // reverse the encryption (subtract key)
            }

            fin.close();
            fout.close();
            System.out.println("Decryption done! Check file: " + outputFile);
        } catch (Exception e) {
            System.out.println("Error during decryption: " + e);
        }
    }
}
