package edu.utcn.lab12.devices;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElectronicDeviceTest {

    @Test
    public void addElectronicDevice(){
        ElectronicDevice computer = new ElectronicDevice();
        assertFalse(computer.isPowered());
        computer.turnOn();
        assertTrue(computer.isPowered());
        computer.turnOff();
        assertFalse(computer.isPowered());
    }
}
