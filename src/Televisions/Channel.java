package Televisions;

public class Channel {

    private String name;
    private int number;

    /**
     * Create a new Channel
     * @param String name
     * @param int number
     */
    public Channel(String name, int number)
    {
        this.name = name;
        this.number = number;
    }

    /**
     * Fetch the channel's name
     * @return String
     */
    public String getName() {
        return this.name;
    }

    /**
     * Fetch the channel's number
     * @return int
     */
    public int getNumber() {
        return this.number;
    }
}
