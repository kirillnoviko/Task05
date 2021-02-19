package by.htp.les18.dao.command.imp;

import by.htp.les18.bean.Appliance;
import by.htp.les18.bean.VacuumCleaner;
import by.htp.les18.dao.command.Command;

public class CreateBeanVacuumCleaner  implements Command {

	@Override
	public  Appliance execute(String request) {
		
		
		String[] temp;
		int [] result;
		int count;
		
		temp= request.split(",\\s+");
		count= 0;
		result= new int[temp.length];
		
		for(int i=0;i<temp.length;i++) {
			
			if(i>=1 && i<=3) {
		
				continue;
			
			}
			
			result[count]=Parser.parseInt(temp[i]);
			count ++;
		
		}
		
		Appliance a=new VacuumCleaner(result[0], temp[1].split("=")[1], temp[2].split("=")[1], temp[3].split("=")[1], result[1], result[2]);

		return a;
	}


}