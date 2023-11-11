package org.example;

public class SensorData {
    private int id;
    private int packetNo;
    private double temperature;
    private double humidity;
    private int tds;
    private double pH;

    // Constructor
    public SensorData(int id, int packetNo, double temperature, double humidity, int tds, double pH) {
        this.id = id;
        this.packetNo = packetNo;
        this.temperature = temperature;
        this.humidity = humidity;
        this.tds = tds;
        this.pH = pH;
    }

    // Getter methods (optional)
    public int getId() {
        return id;
    }

    public int getPacketNo() {
        return packetNo;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public int getTds() {
        return tds;
    }

    public double getpH() {
        return pH;
    }

    public void print() {
        System.out.println("     ID: " + id);
        System.out.println("     Packet No: " + packetNo);
        System.out.println("     Temperature: " + temperature);
        System.out.println("     Humidity: " + humidity);
        System.out.println("     TDS: " + tds);
        System.out.println("     pH: " + pH);
    }
}
