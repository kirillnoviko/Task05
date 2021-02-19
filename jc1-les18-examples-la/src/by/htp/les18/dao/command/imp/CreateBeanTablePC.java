package by.htp.les18.dao.command.imp;

import by.htp.les18.bean.Appliance;
import by.htp.les18.bean.TablePC;
import by.htp.les18.dao.command.Command;

public class CreateBeanTablePC  implements Command {
	
	@Override
	public  Appliance execute(String request) {
		String[] temp;
		int [] result;
		int count;
		
		temp= request.split(",\\s+");
		count= 0;
		result= new int[temp.length];
		
		for(int i=0;i<temp.length;i++) {
			
			if(i==4) {
			
				continue;
			
			}
			
			result[count]=Parser.parseInt(temp[i]);
			count ++;
			
		}
		
		Appliance a=new TablePC(result[0], result[2], result[1], result[3], temp[4].split("=")[1]);

		return a;
	}
	
	
}