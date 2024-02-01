package events;

import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class ReadyEventListener extends ListenerAdapter {
    public void onReady(ReadyEvent event) {
        super.onReady(event);
        System.out.println("Chausson is online");
    }
}


