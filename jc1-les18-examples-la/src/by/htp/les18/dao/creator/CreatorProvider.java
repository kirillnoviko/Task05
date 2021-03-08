package by.htp.les18.dao.creator;

import java.util.HashMap;
import java.util.Map;

import by.htp.les18.dao.creator.imp.CreateBeanLaptop;
import by.htp.les18.dao.creator.imp.CreateBeanOven;
import by.htp.les18.dao.creator.imp.CreateBeanRefrigerator;
import by.htp.les18.dao.creator.imp.CreateBeanSpeakerWired;
import by.htp.les18.dao.creator.imp.CreateBeanTablePC;
import by.htp.les18.dao.creator.imp.CreateBeanVacuumCleaner;




public class CreatorProvider {
	
	private Map<String, Creator> creators = new HashMap<>();
	
	public CreatorProvider() {
	
		creators.put("laptop", new CreateBeanLaptop());
		creators.put("oven", new CreateBeanOven());
		creators.put("refrigerator", new CreateBeanRefrigerator());
		creators.put("speakers", new CreateBeanSpeakerWired());
		creators.put("tabletpc", new CreateBeanTablePC());
		creators.put("vacuumcleaner", new CreateBeanVacuumCleaner());
	
	}
	
	public Creator getCreator(String commandName) {
	
		Creator creator;
		
		creator = creators.get(commandName);
		
		return creator;
		
	}

}
