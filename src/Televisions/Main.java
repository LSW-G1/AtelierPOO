package Televisions;

public class Main {

    public static void main(String[] args) {

        // INIT CHANNELS
        Channel channel1 = new Channel("Channel 1", 1);
        Channel channel2 = new Channel("Channel 2", 2);
        Channel channel3 = new Channel("Channel 3", 3);

        // INIT TVS
        TV tv1 = new TV("Samsung");
        TV tv2 = new TV("Panasonic");
        TV tv3 = new TV("Acer");
        TV tv4 = new TV("LG");

        // INIT USERS
        User user1 = new User("Jean");
        User user2 = new User("Jacque");

        // PRINT INFOS
        System.out.println(" -- UTILISATEURS -- ");
        System.out.println(" - " + user1.getName());
        System.out.println(" - " + user2.getName());
        System.out.println(" -- ");
        System.out.println(" -- TELEVISIONS -- ");
        System.out.println(" - " + tv1.getBrand());
        System.out.println(" - " + tv2.getBrand());
        System.out.println(" - " + tv3.getBrand());
        System.out.println(" - " + tv4.getBrand());
        System.out.println(" -- " );
        System.out.println(" -- CHAINES -- ");
        System.out.println(" - " + channel1.getName());
        System.out.println(" - " + channel2.getName());
        System.out.println(" - " + channel3.getName());
        System.out.println(" -- ");
        System.out.println(" ");

        // USER1 CHANGES TV1's state
        user1.changeStatus(tv1, true);
        user2.changeStatus(tv4, false);

        // USER1 CHANGES Channel
        user1.changeChannel(tv1, channel1);
        user2.changeChannel(tv3, channel3);

        // PRINT INFOS
        System.out.println(" -- TELEVISIONS -- ");
        System.out.println(" - " + tv1.getBrand() + " - " + (tv1.isOn() ? tv1.getChannel().getName() : "Eteint"));
        System.out.println(" - " + tv2.getBrand() + " - " + (tv2.isOn() ? tv2.getChannel().getName() : "Eteint"));
        System.out.println(" - " + tv3.getBrand() + " - " + (tv3.isOn() ? tv3.getChannel().getName() : "Eteint"));
        System.out.println(" - " + tv4.getBrand() + " - " + (tv4.isOn() ? tv4.getChannel().getName() : "Eteint"));
    }
}
