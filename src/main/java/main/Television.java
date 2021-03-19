
package main;

public class Television {
    
    private int volume = 0;
    private int curentProgram = 1;
    private boolean turnOn = true;
    
    public int getVolume() {
        return this.volume;
    }
    
    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }    
    
     public int getCurrentProgram() {
        return this.volume;
    }
    
    public void setCurrentProgram(int newCurrentProgram) {
        this.curentProgram = newCurrentProgram;
    }
    
    public boolean getTurnOn() {
        return this.turnOn;
    }
    
    public void setTurnOn(boolean newTurnOn) {
        this.turnOn = newTurnOn;
    }
    
    public Television(int volume, int currentProgram, boolean turnOn) {
        this.volume = volume;
        this.curentProgram = currentProgram;
        this.turnOn = turnOn;
    }
    
    public void printAttributes() {
        System.out.println("Volume: " + this.getVolume());
        System.out.println("Current program: " + this.getCurrentProgram());
        System.out.println("Turn on: " + this.getTurnOn());  
    }
}
