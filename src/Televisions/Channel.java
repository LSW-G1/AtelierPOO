package Televisions;

public class Channel {

    private String name;
    private int number;

    /**
     * Create a new Channel
     * @param name
     * @param number
     */
    Channel(String name, int number)
    {
        this.name = name;
        this.number = number;
    }

    /**
     * Fetch the channel's name
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Fetch the channel's number
     * @return
     */
    public int getNumber() {
        return this.number;
    }
}
