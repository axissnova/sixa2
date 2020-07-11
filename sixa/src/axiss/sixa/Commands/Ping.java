package axiss.sixa.Commands;

import axiss.sixa.Sixa;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Ping extends ListenerAdapter {
	public void onGuildMessageReveived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(Sixa.prefix + "ping")) {
			
			event.getChannel().sendMessage("Pong!").queue();
			
		}
	}

}
