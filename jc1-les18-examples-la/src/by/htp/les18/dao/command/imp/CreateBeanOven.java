package by.htp.les18.dao.command.imp;

import by.htp.les18.bean.Appliance;
import by.htp.les18.bean.Oven;
import by.htp.les18.dao.command.Command;

public class CreateBeanOven implements Command {
	@Override
	public  Appliance execute(String request) {
		
		String[] temp;
		int [] resultInt;
		double[] resultDouble;
		int countInt;
		int countDouble;
		
		temp= request.split(",\\s+");
		
		countInt= 0;
		countDouble=0;
		
		resultInt= new int[temp.length];
		resultDouble= new double[temp.length];
		
		for(int i=0;i<temp.length;i++) {
			
			if(i>=4) {
				
				resultDouble[countDouble]=Parser.parseDouble(temp[i]);;
				countDouble++;
				continue;
			
			}
		
			resultInt[countInt]=Parser.parseInt(temp[i]);
			countInt ++;
		
		}
		
		Appliance a=new Oven(resultInt[0], resultInt[1], resultInt[2], resultInt[3], resultDouble[0], resultDouble[1]);

		return a;
	}


}
