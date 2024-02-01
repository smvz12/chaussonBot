import events.DiceCommand;
import events.HelloCommand;
import events.SpyOnUsers;
import events.ReadyEventListener;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import java.lang.NumberFormatException;
public class chausson {
    public static void main(String[] args) {
        final String token = "This key is private";
        JDABuilder jdaBuilder = JDABuilder.createDefault(token)
                .setActivity(Activity.customStatus("Squirming :worm:"));


        try {
            jdaBuilder.enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES)
                    .addEventListeners(new ReadyEventListener(), new SpyOnUsers(), new HelloCommand(), new DiceCommand())
                    .build();
        } catch (NumberFormatException ignore)
        {}
    }
    }


