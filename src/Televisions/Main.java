package Televisions;

import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        JVDCTVDAO jvdctvdao = new JVDCTVDAO();
        jvdctvdao.getConnection();

        // SELECT * TV
        List<TV> TVs = jvdctvdao.selectAll();
        for (TV list: TVs)
        {
            // SELECT ALLOWED CHANNEL FOR TV {list}
            List<Channel> channels = list.getAllowedChannels();

            // DISPLAY LIST OF ALLOWED CHANNEL FOR TV {list}
            System.out.println(" -- " + list.getBrand());
            for (Channel channel : channels)
            {
                System.out.println(channel.getName());
            }
        }

    }

    private static void init() {

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

        // SCENARIOS 1
        System.out.println(" ");
        System.out.println(" -- SCENARIO 1 -- ");

        tv1.addChannel(channel1);
        user1.changeStatus(tv1, true);
        user1.changeChannel(tv1, channel1);
        user1.changeStatus(tv1, false);

        // SCENARIO 2
        System.out.println(" ");
        System.out.println(" -- SCENARIO 2 -- ");

        user2.changeStatus(tv2, true);

        // SCENARIO 3 -- BASED OFF S1
        System.out.println(" ");
        System.out.println(" -- SCENARIO 3 --");

        user1.changeStatus(tv1, true);
        user1.changeChannel(tv1, channel2);

        // SCENARIO 4
        System.out.println(" ");
        System.out.println(" -- SCENARIO 4 --");

        user2.changeChannel(tv2, channel2);

        // SCENARIO 5
        System.out.println(" ");
        System.out.println(" -- SCENARIO 5 --");

        user2.changeStatus(tv3, false);

        // SCENARIO 6
        System.out.println(" ");
        System.out.println(" -- SCENARIO 6 --");

        tv3.addChannel(channel1);
        user2.changeStatus(tv3, true);
        user2.changeStatus(tv3, true);

        tv3.setOff();

        // PRINT INFOS
        System.out.println(" ");
        System.out.println(" -- TELEVISIONS -- ");
        System.out.println(" - " + tv1.getBrand() + " - " + (tv1.isOn() ? tv1.getCurrentChannel().getName() : "Eteint"));
        System.out.println(" - " + tv2.getBrand() + " - " + (tv2.isOn() ? tv2.getCurrentChannel().getName() : "Eteint"));
        System.out.println(" - " + tv3.getBrand() + " - " + (tv3.isOn() ? tv3.getCurrentChannel().getName() : "Eteint"));
        System.out.println(" - " + tv4.getBrand() + " - " + (tv4.isOn() ? tv4.getCurrentChannel().getName() : "Eteint"));
    }
}
