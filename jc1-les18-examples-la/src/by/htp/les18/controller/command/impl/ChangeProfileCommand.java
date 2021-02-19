package by.htp.les18.controller.command.impl;

import by.htp.les18.bean.User;
import by.htp.les18.controller.ControllerException;
import by.htp.les18.controller.command.Command;
import by.htp.les18.service.ClientService;
import by.htp.les18.service.ServiceException;
import by.htp.les18.service.ServiceProvider;


public class ChangeProfileCommand implements Command {

	@Override
	public String execute(String request) throws ControllerException{
		
		String[] params;
		
		params = request.split("\\s+_\\|_\\s+");
		
		// check params
		
		String firstName;
		String secondName;
		String login;
		String password;
		
		
		firstName = params[0].split("\\s+=\\s+")[1];
		secondName = params[1].split("\\s+=\\s+")[1];
		login = params[2].split("\\s+=\\s+")[1];
		password = params[3].split("\\s+=\\s+")[1];
		
		ServiceProvider provider = ServiceProvider.getInstance();
		ClientService clientService = provider.getClientService();
	
		
		try {
			clientService.changeProfile(new User(firstName,secondName,login,password));
		} catch (ServiceException e) {
			throw new ControllerException(e);
		}

		
		return "profile change";
	}

}
