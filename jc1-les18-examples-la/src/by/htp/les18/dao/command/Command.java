package by.htp.les18.dao.command;

import by.htp.les18.bean.Appliance;

public interface Command {
	
	Appliance execute(String request);
	
}
