package by.htp.les18.dao.command.imp;

import by.htp.les18.bean.Appliance;
import by.htp.les18.bean.Laptop;
import by.htp.les18.dao.command.Command;


public class CreateBeanLaptop implements Command {

	@Override
	public  Appliance execute(String request) {
		
		String[] temp;
		int [] result;
		int count;
		
		temp= request.split(",\\s+");
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