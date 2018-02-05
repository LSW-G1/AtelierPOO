package Televisions;

public class User {

    private String name;

    /**
     * Create a new user
     * @param name
     */
    User(String name)
    {
        this.name = name;
    }

    /**
     * Fetch the user's name
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Make the user change the current channel of the TV
     * @param television
     * @param channel
     */
    public void changeChannel(TV television, Channel channel)
    {
        System.out.println("INFO: " + this.getName() + " a changé de chaine de TV: " + television.getBrand() + " - " + channel.getName());
        television.setCurrentChannel(channel);
    }

    /**
     * Make the user change the status of the TV
     * @param television
     * @param on
     */
    public void changeStatus(TV television, Boolean on)
    {
        System.out.print("INFO: " + this.getName() + " a changé le statut de la TV: " + television.getBrand() + " (");

        if (on)
        {
            System.out.println("On)");
            television.setOn();
        }
        else
        {
            System.out.println("Off)");
            television.setOff();
        }
    }
}
