package net.skyprison.skyprisoncore.commands.chats;

import net.skyprison.skyprisoncore.SkyPrisonCore;
import net.skyprison.skyprisoncore.utils.ChatUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Guard implements CommandExecutor {
	private SkyPrisonCore plugin;
	private ChatUtils chatUtils;

	public Guard(SkyPrisonCore plugin, ChatUtils chatUtils) {
		this.plugin = plugin;
		this.chatUtils = chatUtils;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			chatUtils.chatSendMessage(args, sender, "guard", "guard-chat");
		} else {
			chatUtils.consoleChatSend(args, "guard", "guard-chat");
		}
		return true;
	}
}
