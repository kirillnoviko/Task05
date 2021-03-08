package by.htp.les18.dao.creator.imp;

import by.htp.les18.bean.Appliance;
import by.htp.les18.bean.VacuumCleaner;
import by.htp.les18.dao.creator.Creator;

public class CreateBeanVacuumCleaner  implements Creator {


	@Override
	public  Appliance createApp(String nameApp) {
		String[] temp;
		int [] result;
		int count;
		
		temp= nameApp.split(",\\s+");
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