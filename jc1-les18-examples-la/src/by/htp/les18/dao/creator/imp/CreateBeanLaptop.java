package by.htp.les18.dao.creator.imp;

import by.htp.les18.bean.Appliance;
import by.htp.les18.bean.Laptop;
import by.htp.les18.dao.creator.Creator;


public class CreateBeanLaptop implements Creator {


	@Override
	public  Appliance createApp(String nameApp) {
		
		String[] temp;
		int [] result;
		int count;
		
		temp= nameApp.split(",\\s+");
		count= 0;
		result= new int[temp.length];
		
		for(int i=0;i<temp.length;i++) {
			
			if(i==1) {
				continue;
			}
			
			result[count]=Parser.parseInt(temp[i]);
			count ++;
			
		}
		
		Appliance a=new Laptop(result[0], result[1], result[4], temp[1].split("=")[1], result[2],result[3]);

		return a;
	}
	
	
}