package Televisions;
import java.util.ArrayList;
import java.util.List;

public class TV {

    private String brand;
    private Channel channel;
    private boolean on;
    private List<Channel> channelList = new ArrayList<>();

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
            if (channelList.contains(channel))
            {
                this.channel = channel;
            }
            else{
                System.out.println("ERROR: La chaine " + channel.getName() + " n'est pas autorisée sur la télévision " + this.getBrand());
            }
        }
        else
        {
            System.out.println("ERROR: La télévision " + this.getBrand() + " n'est pas allumée!");
        }
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn() {
        if (!this.isOn())
        {
            if (!channelList.isEmpty())
            {
                this.on = true;
            }
            else
            {
                System.out.println("ERROR: La télévision " + this.getBrand() + " ne peut afficher aucune chaine");
            }
        }
        else
        {
            System.out.println("ERROR: La télévision " + this.getBrand() + " est déjà allumée !");
        }
    }

    public void setOff() {
        if (this.isOn())
        {
            this.on = false;
        }
        else
        {
            System.out.println("ERROR: La télévision " + this.getBrand() + " est déjà éteinte !");
        }
    }

    public void addChannel(Channel channel)
    {
        System.out.println("INFO: La télévision " + this.getBrand() + " peut maintenant accéder à " + channel.getName());
        this.channelList.add(channel);
    }

}
