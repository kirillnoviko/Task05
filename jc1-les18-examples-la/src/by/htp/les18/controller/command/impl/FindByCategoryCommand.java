package by.htp.les18.controller.command.impl;

import java.util.List;

import by.htp.les18.bean.Appliance;
import by.htp.les18.controller.ControllerException;
import by.htp.les18.controller.command.Command;
import by.htp.les18.service.ServiceException;
import by.htp.les18.service.ServiceProvider;
import by.htp.les18.service.WarehouseService;

public class FindByCategoryCommand implements Command {

	@Override
	public String execute(String request) throws ControllerException{
		
		String nameCategory;
		String response;
		
		response="";
		nameCategory = request.split("\\s+=\\s+")[1];
		
		
		ServiceProvider provider = ServiceProvider.getInstance();
		WarehouseService warehouseService = provider.getWarehouseService();
	
		
		List<Appliance> result;
		
		try {
			result = warehouseService.findByCategory(nameCategory);
		} catch (ServiceException e) {
			throw new ControllerException(e);
		}
		
		
		for(Appliance res : result) {
			response=response + " \n " + res.toString();
		}
		
		
		return response;
	
	}

}
