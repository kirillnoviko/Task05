package by.htp.les18.service.impl;

import java.util.List;

import by.htp.les18.bean.Appliance;
import by.htp.les18.dao.DAOException;
import by.htp.les18.dao.DAOProvider;
import by.htp.les18.dao.FindApplianceDAO;

import by.htp.les18.service.ServiceException;
import by.htp.les18.service.WarehouseService;
 
public class WarehouseServiceImpl implements WarehouseService{

	@Override
	public List<Appliance> findByCategory(String name) throws ServiceException {
		// validation
		
		if(name == null || "".equals(name)) {
			throw new ServiceException("error name is null");
		}
		
		DAOProvider provider = DAOProvider.getInstance();
		FindApplianceDAO applianceDAO = provider.getFindApplianceDAO();
		
		List<Appliance> result = null;
		
		try {
			result = applianceDAO.findByCategory(name);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	
		return result;
	}

}
