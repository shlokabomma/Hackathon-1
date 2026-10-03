import java.util.Scanner;

class Main {

    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2a
        int panelID = 101;
        double energyGenerated = 12.5;
        int numberOfPanels = 20;
        char systemStatus = 'G';

        System.out.println("Panel ID: " + panelID);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);

        // 2b
        double energy = sc.nextDouble();

        if (energy >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        // 2c
        double morningEnergy = sc.nextDouble();
        double eveningEnergy = sc.nextDouble();

        double total = calculateTotalEnergy(morningEnergy, eveningEnergy);

        System.out.println("Total Energy: " + total);

        sc.close();
    }
}