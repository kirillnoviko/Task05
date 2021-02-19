package by.htp.les18.main;

import by.htp.les18.controller.ApplianceController;
import by.htp.les18.controller.Controller;

public class Main {

	public static void main(String[] args) {
		Controller controller = new ApplianceController();

		String request;
		String response;

		request = "logination _|_ login = iii _|_ password = 1234";

		response = controller.doAction(request);

		System.out.println(response);

		request = "changeprofile _|_  firstName = kkxxxkkk _|_  secondName = axxxxxxaaa  _|_ login = iii _|_ password = xxx";

		response = controller.doAction(request);

		System.out.println(response);
		
		
		
		request = "findbycategory _|_  nameCategory = Lapto";

		response = controller.doAction(request);

		System.out.println(response);

		
		
		
		request = "findbycategory _|_  nameCategory = Oven";

		response = controller.doAction(request);

		System.out.println(response);

		
		
		
		request = "findbycategory _|_  nameCategory = Speakers";

		response = controller.doAction(request);

		System.out.println(response);

		
		
		
		request = "findbycategory _|_  nameCategory = TabletPC";

		response = controller.doAction(request);

		System.out.println(response);

		
		
		request = "findbycategory _|_  nameCategory = VacuumCleaner";

		response = controller.doAction(request);

		System.out.println(response);

		
		
		request = "findbycategory _|_  nameCategory = Refrigerator";

		response = controller.doAction(request);

		System.out.println(response);
	}

}
