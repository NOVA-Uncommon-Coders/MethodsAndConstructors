package com.theironyard.novauc;

/**
 * Created by Merlin on 2/7/17.
 */
public class Computer {
    private String operatingSystem;
    private String builtBy;
    private double rAMinGB;
    private double processorSpeedinGHz;
    private boolean solidStateDrive;

    public Computer() {

    }

    public String getOperatingSystem() {
        return operatingSystem; }

    public void setOperatingSystem(String operatingSystem) {
        operatingSystem = operatingSystem; }

    public String getBuiltBy() {
        return builtBy; }

    public void setBuiltBy(String builtBy) {
        builtBy = builtBy; }

    public double getRAMinGB() {
        return rAMinGB; }

    public Computer(String operatingSystem, String builtBy, double rAMinGB, double processorSpeedinGHz, boolean solidStateDrive) {
        this.operatingSystem = operatingSystem;
        this.builtBy = builtBy;
        this.rAMinGB = rAMinGB;
        this.processorSpeedinGHz = processorSpeedinGHz;
        this.solidStateDrive = solidStateDrive;
    }

    public void setRAMinGB(double rAMinGB) {
        if (rAMinGB > 7.9 && rAMinGB < 8.1) {
            this.rAMinGB = rAMinGB;
        } else {
            System.out.println("not a valid RAM speed");
        }
    }

    public double getProcessorSpeedinGHz() {
        return processorSpeedinGHz; }

    public void setProcessorSpeedinGHz(double processorSpeedinGHz) {
        this.processorSpeedinGHz = processorSpeedinGHz; }

    public boolean isSolidStateDrive() {
        return solidStateDrive; }

    public void setSolidStateDrive(boolean solidStateDrive) {
        solidStateDrive = solidStateDrive; }
}
