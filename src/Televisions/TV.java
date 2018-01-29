package Televisions;

public class TV {

    private String brand;
    private Channel channel;
    private boolean on;

    TV(String brand)
    {
        this.brand = brand;
        this.on = false;
    }

    public String getBrand() {
        return this.brand;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public void setChannel(Channel channel) {
        if (this.isOn())
        {
            this.channel = channel;
        }
        else
        {
            System.out.println("La télévision " + this.getBrand() + " n'est pas allumée!");
        }
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn() {
        if (!this.isOn())
        {
            this.on = true;
        }
        else
        {
            System.out.println("La télévision " + this.getBrand() + " est déjà allumée !");
        }
    }

    public void setOff() {
        if (this.isOn())
        {
            this.on = false;
        }
        else
        {
            System.out.println("La télévision " + this.getBrand() + " est déjà éteinte !");
        }

    }
}
