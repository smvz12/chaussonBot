package events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import java.util.*;

public class DiceCommand extends ListenerAdapter {


    public void onMessageReceived(MessageReceivedEvent event) {
        Random r = new Random();
        int result;
        String[] message = event.getMessage().getContentRaw().split(" ");
        if (message[0].equalsIgnoreCase("!roll")) {

            int dice = Integer.parseInt(message[1]);
            int sides = Integer.parseInt(message[2]);
                for (int i = dice; i != 0; i--) {
                    result = r.nextInt(sides);
                    result++;
                    event.getChannel().sendMessage("Rolled 1 d" + sides + " Result = " + result).queue();
                }


            }
        }
    }



