
package main;

public class Radio {
    
    private double fmFrequency = 91.8;
    private int amFrequency = 600;
    private char AM = 'A';
    private char FM = 'F';
    
    public double getFmFrequency() {
        return this.fmFrequency;
    }
    
    public void setFmFrequency(double newfrequency) {
        this.fmFrequency = newfrequency;
    }
    
    public int getAmFrequency() {
        return this.amFrequency;
    }
    
    public void setAmFrequency(char newAmFrequency) {
        this.amFrequency = newAmFrequency;
    }
    
    public char getAM() {
        return this.AM;
    }
    
    public void setAM(char newAM) {
        this.AM = newAM;
    }
    
    public char getFM() {
        return this.FM;
    }
    
    public void setFM(char newFM) {
        this.FM = newFM;
    }
    
    public Radio(double fmFrequency, int amFrequency, char A, char F) {
        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.AM = 'A';
        this.FM = 'F';
    }
    
    public void printAttributes() {
        System.out.println("FM frequency: " + this.fmFrequency);
        System.out.println("AM frequency: " + this.amFrequency);
        System.out.println("AM: " + this.AM);
        System.out.println("FM: " + this.FM);
    }
}
