package by.htp.les18.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.les18.bean.User;
import by.htp.les18.dao.DAOException;
import by.htp.les18.dao.UserDAO;

public class FileUserDAO implements UserDAO {

	private static final String SOURCE_PATH = "\\resources\\users.db";
	private static final String SOURCE_DEVIDER_APPLIANCE_PROPERTY = " ";
	private final static int INDEX_LOGIN_FOR_FILE = 3;
	private final static int INDEX_PASSWORD_FOR_FILE = 4;
	@Override
	public boolean logination(String login, String password) throws DAOException {

		BufferedReader infoForUsersSourceReader = null;
		String infoForOneUser = null;
		String[] propertiesUser = null;

		try {
			
			infoForUsersSourceReader = new BufferedReader(new FileReader(new File(SOURCE_PATH)));

			while ((infoForOneUser = infoForUsersSourceReader.readLine()) != null) {
				propertiesUser = infoForOneUser.split(SOURCE_DEVIDER_APPLIANCE_PROPERTY);
				if (propertiesUser[INDEX_LOGIN_FOR_FILE].equals(login) && propertiesUser[INDEX_PASSWORD_FOR_FILE].equals(password)) {
					return true;
				}
			}

		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		}

		return false;
	}

	@Override
	public void changeProfile(User user) throws DAOException {

		BufferedReader infoForUsersSourceReader = null;
		String infoForOneUser = null;
		List<String> propertiesUser = new ArrayList<String>();

		
		
		try {
			infoForUsersSourceReader = new BufferedReader(new FileReader(new File(SOURCE_PATH)));
			
			while ((infoForOneUser = infoForUsersSourceReader.readLine()) != null) {
				if (!(user.getLogin().equals(infoForOneUser.split(SOURCE_DEVIDER_APPLIANCE_PROPERTY)[2]))) {
					propertiesUser.add(infoForOneUser);
				}
			}
			
		} catch (FileNotFoundException e1) {
			throw new DAOException(e1);
		} catch (IOException e) {
			throw new DAOException(e);
		}

		
		
		
		try (FileWriter writer = new FileWriter("E:\\eclipseProject\\jc1-les18-examples-la\\resources\\users.db",
				false)) {
			writer.write(propertiesUser.get(0));
			writer.append('\n');
			writer.flush();
		} catch (IOException e) {
			throw new DAOException(e);
		}

		
		
		
		try (FileWriter writer = new FileWriter("E:\\eclipseProject\\jc1-les18-examples-la\\resources\\users.db",
				true)) {

			for (int i = 1; i < propertiesUser.size(); i++) {
				writer.write(propertiesUser.get(i));
				writer.append('\n');
			}

			String text = "";

			text += user.getFirstName().trim() + " ";
			text += user.getSecondName().trim() + " ";
			text += user.getLogin().trim() + " ";
			text += user.getPassword().trim() + " ";

			writer.write(text);
			writer.append('\n');
			writer.flush();

		} catch (IOException e) {
			throw new DAOException(e);
		}

	}

}