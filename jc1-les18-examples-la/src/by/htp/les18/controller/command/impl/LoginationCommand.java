package by.htp.les18.controller.command.impl;

import by.htp.les18.controller.ControllerException;
import by.htp.les18.controller.command.Command;
import by.htp.les18.service.ClientService;
import by.htp.les18.service.ServiceException;
import by.htp.les18.service.ServiceProvider;

public class LoginationCommand implements Command {

	@Override
	public String execute(String request) throws ControllerException {//"logination"
		String[] params;
	
		params = request.split("\\s+_\\|_\\s+");
		
		// check params
		
		
		String login;
		String password;
		
		login = params[0].split("\\s+=\\s+")[1];
		password = params[1].split("\\s+=\\s+")[1];
		
		ServiceProvider provider = null;
		try {
			provider = ServiceProvider.getInstance();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ClientService clientService = provider.getClientService();
	
		boolean result = false;
		
		try {
			result = clientService.logination(login, password);
		} catch (ServiceException e) {
			throw new ControllerException(e);
		}

		String response;
		if(result) {
			response="ok";
		}else {
			response="error";
		}
		
		return response;
	}

}
