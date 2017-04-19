package simpleFactoryPattern;

public class Client {
	
	public static void main(String[] args) {
		Chart.getChart(XMLUtil.getChartType());
	}
	
}
