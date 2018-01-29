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
        television.setChannel(channel);
    }

    public void changeStatus(TV television, Boolean on)
    {
        if (on)
        {
            television.setOn();
        }
        else
        {
            television.setOff();
        }
    }
}
