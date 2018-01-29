package Televisions;

public class User {

    private String name;

    User(String name)
    {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void changeChannel(TV television, Channel channel)
    {
        System.out.println("INFO: " + this.getName() + " a changé de chaine de TV: " + television.getBrand() + " - " + channel.getName());
        television.setChannel(channel);
    }

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
