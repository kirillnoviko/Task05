package by.htp.les18.controller;

public class ControllerException extends Exception {
		private static final long serialVersionUID = 1L;

		public ControllerException(String message) {
			super(message);
		}
		
		public ControllerException(Exception e) {
			super(e);
		}
}
