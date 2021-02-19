package by.htp.les18.service.impl;

import by.htp.les18.bean.User;
import by.htp.les18.dao.DAOException;
import by.htp.les18.dao.DAOProvider;
import by.htp.les18.dao.UserDAO;
import by.htp.les18.service.ClientService;
import by.htp.les18.service.ServiceException;

public class ClientServiceImpl implements ClientService{

	
	@Override
	public boolean logination(String login, String password) throws ServiceException {
		// validation
		
		if(login == null || "".equals(login)) {
			throw new ServiceException("error login is null");
		}
		
		
		DAOProvider provider = DAOProvider.getInstance();
		UserDAO userDAO = provider.getUserDAO();
		
		boolean result = false;
		
		
		try {
			result = userDAO.logination(login, password);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		return result;
	}

	@Override
	public void changeProfile(User user) throws ServiceException {
		
	
		
		DAOProvider provider = DAOProvider.getInstance();
		UserDAO userDAO=provider.getUserDAO();
		
		
		try {
			userDAO.changeProfile(user);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		

	}

}
