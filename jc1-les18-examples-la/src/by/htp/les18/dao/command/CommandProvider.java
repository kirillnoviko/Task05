package by.htp.les18.dao.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.les18.dao.command.imp.CreateBeanLaptop;
import by.htp.les18.dao.command.imp.CreateBeanOven;
import by.htp.les18.dao.command.imp.CreateBeanRefrigerator;
import by.htp.les18.dao.command.imp.CreateBeanSpeakerWired;
import by.htp.les18.dao.command.imp.CreateBeanTablePC;
import by.htp.les18.dao.command.imp.CreateBeanVacuumCleaner;




public class CommandProvider {
	
	private Map<String, Command> commands = new HashMap<>();
	
	public CommandProvider() {
	
		commands.put("laptop", new CreateBeanLaptop());
		commands.put("oven", new CreateBeanOven());
		commands.put("refrigerator", new CreateBeanRefrigerator());
		commands.put("speakers", new CreateBeanSpeakerWired());
		commands.put("tabletpc", new CreateBeanTablePC());
		commands.put("vacuumcleaner", new CreateBeanVacuumCleaner());
	
	}
	
	public Command getCommand(String commandName) {
	
		Command command;
		
		command = commands.get(commandName);
		
		return command;
		
	}

}
