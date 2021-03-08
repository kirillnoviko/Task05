package by.htp.les18.dao.creator.imp;

public class Parser {

	public static int parseInt(String str) {

		return Integer.parseInt(str.split("=")[1]);

	}

	public static double parseDouble(String str) {

		return Double.parseDouble(str.split("=")[1]);

	}

	public static double[] parseDoubleMas(String str) {
		str=str.split("=")[1];
		
		String min;
		String max;
		
		min=str.split("-")[0];
		max=str.split("-")[1];
		
		double[] result=new double[2];
		
		result[0]=Double.parseDouble(min);
		result[1]=Double.parseDouble(max);
		
		return result;

	}

}
