package datrat.sbitems;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class sbGiveTabCompleter implements TabCompleter {

	List<String> arguments = new ArrayList<>();

	@Override
	public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
		if (arguments.isEmpty()) {
			arguments.add("sots");
			arguments.add("cheattoggler");
			arguments.add("aotj");
			arguments.add("boomstick");
			arguments.add("integerlimit");
			arguments.add("waypointer");
			arguments.add("jankenponstone");
			arguments.add("jankenponshears");
			arguments.add("jankenponpaper");
		}
		List<String> result = new ArrayList<>();
		if (args.length == 1) {
			for (String a : arguments) {
				if (a.toLowerCase().startsWith(args[0].toLowerCase()))
					result.add(a);
			}
			return result;
		}
		return null;
	}
}
