package edu.utcn.lab12.devices;

import org.junit.Test;

import static org.junit.Assert.*;

public class TVTest {

    @Test
    public void addTV(){
        TV tv1 = new TV(23);
        assertEquals(0,tv1.getChannel());
        TV tv2 = new TV(3);
        tv2.channelUp();
        tv2.channelUp();
        assertEquals(5,tv2.getChannel());
        tv2.channelDown();
        assertEquals(4,tv2.getChannel());
    }
}
