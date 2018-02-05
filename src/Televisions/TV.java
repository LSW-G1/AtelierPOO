package Televisions;
import java.util.ArrayList;
import java.util.List;

public class TV {

    private String brand;
    private Channel currentChannel;
    private boolean on;
    private List<Channel> allowedChannels = new ArrayList<>();

    /**
     * Create a new TV
     * @param brand
     */
    TV(String brand)
    {
        this.brand = brand;
        this.on = false;
    }

    /**
     * Fetch the TV's brand
     * @return
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Fetch the TV's current channel
     * @return
     */
    public Channel getCurrentChannel() {
        return this.currentChannel;
    }

    /**
     * Sets the TV's current channel
     * @param currentChannel
     */
    public void setCurrentChannel(Channel currentChannel) {
        if (this.isOn())
        {
            if (allowedChannels.contains(currentChannel))
            {
                this.currentChannel = currentChannel;
            }
            else{
                System.out.println("ERROR: La chaine " + currentChannel.getName() + " n'est pas autorisée sur la télévision " + this.getBrand());
            }
        }
        else
        {
            System.out.println("ERROR: La télévision " + this.getBrand() + " n'est pas allumée!");
        }
    }

    /**
     * Is the TV on
     * @return boolean
     */
    public boolean isOn() {
        return this.on;
    }

    /**
     * Turn on the TV
     */
    public void setOn() {
        if (!this.isOn())
        {
            if (!allowedChannels.isEmpty())
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

    /**
     * Turn off the TV
     */
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

    /**
     * Add a channel in the allowed channels list
     * @param channel
     */
    public void addChannel(Channel channel)
    {
        System.out.println("INFO: La télévision " + this.getBrand() + " peut maintenant accéder à " + channel.getName());
        this.allowedChannels.add(channel);
    }

    /**
     * Remove a channel from the allowed channels list
     * @param channel
     */
    public void removeChannel(Channel channel)
    {
        System.out.println("INFO: La télévision " + this.getBrand() + " ne peut plus accéder à " + channel.getName());
        this.allowedChannels.remove(channel);
    }

}
