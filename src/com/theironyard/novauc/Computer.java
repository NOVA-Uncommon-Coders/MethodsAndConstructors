package com.theironyard.novauc;

/**
 * Created by Merlin on 2/7/17.
 */
public class Computer {
    String OperatingSystem;
    String BuiltBy;
    int RAMinGB;
    int ProcessorSpeedinGHz;
    boolean SolidStateDrive;

    public String getOperatingSystem() {
        return OperatingSystem; }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem; }

    public String getBuiltBy() {
        return BuiltBy; }

    public void setBuiltBy(String builtBy) {
        BuiltBy = builtBy; }

    public int getRAMinGB() {
        return RAMinGB; }

    public Computer(String operatingSystem, String builtBy, int RAMinGB, int processorSpeedinGHz, boolean solidStateDrive) {
        this.OperatingSystem = operatingSystem;
        this.BuiltBy = builtBy;
        this.RAMinGB = RAMinGB;
        this.ProcessorSpeedinGHz = processorSpeedinGHz;
        this.SolidStateDrive = solidStateDrive;
    }

    public void setRAMinGB(int RAMinGB) {
        this.RAMinGB = RAMinGB; }

    public Computer(String operatingSystem) {
        OperatingSystem = operatingSystem; }

    public int getProcessorSpeedinGHz() {
        return ProcessorSpeedinGHz; }

    public void setProcessorSpeedinGHz(int processorSpeedinGHz) {
        ProcessorSpeedinGHz = processorSpeedinGHz; }

    public boolean isSolidStateDrive() {
        return SolidStateDrive; }

    public void setSolidStateDrive(boolean solidStateDrive) {
        SolidStateDrive = solidStateDrive; }
}
