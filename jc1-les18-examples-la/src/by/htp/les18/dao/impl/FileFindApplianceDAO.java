package by.htp.les18.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.les18.bean.Appliance;
import by.htp.les18.dao.DAOException;
import by.htp.les18.dao.FindApplianceDAO;
import by.htp.les18.dao.command.Command;
import by.htp.les18.dao.command.CommandProvider;

public class FileFindApplianceDAO implements FindApplianceDAO {

	private final CommandProvider provider = new CommandProvider();

	@Override
	public List<Appliance> findByCategory(String name) throws DAOException {

		BufferedReader br;
		String st;
		File file;
		String[] temp;
		List<Appliance> result;

		br = null;
		st = null;

		// file= new File(getClass().getResource("appliances.db").getFile());
		
		try {
			
			file = new File("E:\\eclipseProject\\jc1-les18-examples-la\\resources\\appliances.db");
			br = new BufferedReader(new FileReader(file));

		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		}

		result = new ArrayList<Appliance>();
		Command command = null;

		command = provider.getCommand(name.toLowerCase());

		try {

			while ((st = br.readLine()) != null) {

				temp = st.split("\\s+:\\s+");

				if (temp[0].equals(name)) {

					result.add(command.execute(temp[1].toString()));

				}

			}

		} catch (IOException e) {
			throw new DAOException(e);
		}
		
		if(result.isEmpty()) {
			throw new DAOException("category is empty");
		}

		return result;
	}

}
