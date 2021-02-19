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

	@Override
	public boolean logination(String login, String password) throws DAOException {

		BufferedReader br = null;

		String st = null;

		String[] temp;

		try {

			File file = new File("E:\\eclipseProject\\jc1-les18-examples-la\\resources\\users.db");
			br = new BufferedReader(new FileReader(file));

		} catch (FileNotFoundException e1) {

			throw new DAOException(e1);

		}

		try {

			while ((st = br.readLine()) != null) {

				temp = st.split(" ");

				if (temp[3].equals(login) && temp[4].equals(password)) {

					return true;

				}

			}

		} catch (IOException e) {

			throw new DAOException(e);

		}

		return false;
	}

	@Override
	public void changeProfile(User user) throws DAOException {

		BufferedReader br = null;

		String st = null;

		List<String> temp;
		temp = new ArrayList<String>();

		
		
		try {

			File file = new File("E:\\eclipseProject\\jc1-les18-examples-la\\resources\\users.db");
			br = new BufferedReader(new FileReader(file));

		} catch (FileNotFoundException e1) {

			throw new DAOException(e1);

		}

		
		
		
		try {

			while ((st = br.readLine()) != null) {

				if (!(user.getLogin().equals(st.split(" ")[2]))) {
					temp.add(st);
				}

			}

		} catch (IOException e) {

			throw new DAOException(e);

		}

		
		
		try (FileWriter writer = new FileWriter("E:\\eclipseProject\\jc1-les18-examples-la\\resources\\users.db",
				false)) {
			writer.write(temp.get(0));
			writer.append('\n');
			writer.flush();
		} catch (IOException e) {
			throw new DAOException(e);
		}

		
		
		try (FileWriter writer = new FileWriter("E:\\eclipseProject\\jc1-les18-examples-la\\resources\\users.db",
				true)) {

			for(int i=1;i<temp.size();i++) {
				writer.write(temp.get(i));
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