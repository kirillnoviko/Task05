package by.htp.les18.controller.command;

import by.htp.les18.controller.ControllerException;

public interface Command {
	String execute(String request) throws ControllerException;
}
