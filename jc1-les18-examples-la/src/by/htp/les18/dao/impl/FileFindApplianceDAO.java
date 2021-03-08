package by.htp.les18.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.htp.les18.bean.Appliance;
import by.htp.les18.dao.DAOException;
import by.htp.les18.dao.FindApplianceDAO;
import by.htp.les18.dao.creator.Creator;
import by.htp.les18.dao.creator.CreatorProvider;

public class FileFindApplianceDAO implements FindApplianceDAO {

	private final CreatorProvider provider = new CreatorProvider();

	private static final String SOURCE_PATH = "\\resources\\appliances.db";
	private static final String SOURCE_DEVIDER_APPLIANCE_PROPERTY = "\\s+:\\s+";

	private final static int NAME_CATEGORY_INDEX = 0;
	private final static int ALL_PROPERTIES = 1;

	@Override

	public List<Appliance> findByCategory(String name) throws DAOException {

		BufferedReader applianceSourceReader = null;
		String oneApplianceFullData = null;

		String[] applianceProperties = null;

		Creator applianceCreator = null;
		List<Appliance> results = new ArrayList<Appliance>();

		try {
			applianceSourceReader = new BufferedReader(new FileReader(new File(SOURCE_PATH)));

			applianceCreator = provider.getCreator(name);

			while ((oneApplianceFullData = applianceSourceReader.readLine()) != null) {

				applianceProperties = oneApplianceFullData.split(SOURCE_DEVIDER_APPLIANCE_PROPERTY);

				if (applianceProperties[NAME_CATEGORY_INDEX].equals(name)) {
					results.add(applianceCreator.createApp(applianceProperties[ALL_PROPERTIES]));
				}
			}
			
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		} finally {
			if (applianceSourceReader != null) {
				try {
					applianceSourceReader.close();
				} catch (IOException e) {
					throw new DAOException(e);
				}
			}
		}

		if (results.isEmpty()) {
			results = Collections.emptyList();
		}

		return results;
	}
}
