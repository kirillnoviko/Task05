package by.htp.les18.controller;

import by.htp.les18.controller.command.Command;
import by.htp.les18.controller.command.CommandProvider;

public class ApplianceController implements Controller{
	
	private final CommandProvider provider = new CommandProvider();
	
	public String doAction(String request) {
		
		String commandName;
		commandName = request.split("\\s+_\\|_\\s+",2)[0];

		String newRequest;
		newRequest=request.split("\\s+_\\|_\\s+",2)[1];
		
		Command command;
		command = provider.getCommand(commandName);
	
		String response=null;
		
		try {
			response = command.execute(newRequest);
		} catch (ControllerException e) {
			response=e.toString();
		}
	
		return response;

	}

}
