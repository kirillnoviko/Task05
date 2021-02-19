package by.htp.les18.dao.command.imp;

import by.htp.les18.bean.Appliance;
import by.htp.les18.bean.Refrigerator;
import by.htp.les18.dao.command.Command;

public class CreateBeanRefrigerator  implements Command {

	@Override
	public  Appliance execute(String request) {
		
		String[] temp;
		int [] resultInt;
		double resultDouble;
		int count;
		
		temp = request.split(",\\s+");
		
		count = 0;
		resultDouble = 0;
			
		resultInt = new int[temp.length];
	
		
		for(int i=0;i<temp.length;i++) {
			
			if(i==3) {
				
				resultDouble=Parser.parseDouble(temp[i]);;
				continue;
				
			}
		
			resultInt[count]=Parser.parseInt(temp[i]);
			count++;
		
		}
		
		Appliance a=new Refrigerator(resultInt[0], resultInt[1], resultInt[2], resultDouble, resultInt[3],  resultInt[4]);

		return a;
	}
	

}