package Singleton;

public class Configuration {
    private static Configuration instance;
    private double tarifHoraire = 5;

    private Configuration() {}

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public double getTarifHoraire() {
        return tarifHoraire;
    }
}