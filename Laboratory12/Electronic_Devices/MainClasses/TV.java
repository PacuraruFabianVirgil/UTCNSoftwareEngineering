package edu.utcn.lab12.devices;

public class TV extends ElectronicDevice{
    int channel;

    public TV(int channel) {
        if((channel>0)&&(channel<12)){
            this.channel = channel;
        }
    }

    void channelUp(){
        if(channel<=10){
            channel++;
            System.out.println("Channel up "+channel);
        }
    }

    void channelDown(){
        if(channel>=2){
            channel--;
            System.out.println("Channel down "+channel);
        }
    }

    public int getChannel() {
        return channel;
    }
}
