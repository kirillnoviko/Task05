package by.htp.les18.dao.command.imp;

import by.htp.les18.bean.Appliance;
import by.htp.les18.bean.SpeakerWired;
import by.htp.les18.dao.command.Command;

public class CreateBeanSpeakerWired implements Command {

	@Override
	public Appliance execute(String request) {

		String[] temp;
		int[] result;
		double[] result1;
		int count;

		temp = request.split(",\\s+");
		count = 0;
		result = new int[temp.length];
		result1 = new double[2];

		for (int i = 0; i < temp.length; i++) {

			if (i == 2) {
				
				result1 = Parser.parseDoubleMas(temp[i]);
				continue;
			
			}

			result[count] = Parser.parseInt(temp[i]);
			count++;
			
		}

		Appliance a = new SpeakerWired(result[0], result[1], result1, result[2]);

		return a;
	}

}
