package PakAmin;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 * The Status_Ban class is used to evaluate flood status based on the measured flood height.
 *
 * This class calculates the flood status based on the input flood height.
 */
public class Status_Banjir {
    String status;
    int flood_height;

    /**
     * Constructor to create a Status_Ba object with the given flood height. 
     *
     * @param flood_height The flood height to be evaluated.
     */
    public Status_Banjir(int flood_height) {
        this.flood_height = flood_height;
    }

    /**
     * The check_status method is used to determine the flood status based on flood height.
     */
    public void check_status() {
        if (flood_height >= 0 && flood_height <= 25) {
            status = "Safe";
        } else if (flood_height >= 26 && flood_height <= 50) {
            status = "Alert Level I";
        } else if (flood_height >= 51 && flood_height <= 100) {
            status = "Warning";
        } else {
            status = "Invalid";
        }
    }

    /**
     * The show_attributes method is used to display the flood height and status to the screen.
     */
    public void show_attributes() {
        System.out.println("Flood height is : " + flood_height);
        System.out.println("Status is : " + status);
        System.out.println("haloo");
        System.out.println("haloo");
    }

    /**
     * The main method is the main entry point for the program. It takes user input for flood height,
     * calculates the status, and displays the result.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input flood height: ");
        int height = input.nextInt();
        Status_Banjir floodStatus = new Status_Banjir(height);
        floodStatus.check_status();
        floodStatus.show_attributes();
    }
}

