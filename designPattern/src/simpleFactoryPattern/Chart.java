package simpleFactoryPattern;

public interface Chart {

	public void display();

	// ��̬��������
	public static Chart getChart(String type) {
		Chart chart = null;
		if (type.equalsIgnoreCase("histogram")) {
			chart = new HistogramChart();
			System.out.println("��ʼ��������״ͼ��");
			chart.display();
		} else if (type.equalsIgnoreCase("pie")) {
			chart = new PieChart();
			System.out.println("��ʼ�����ñ�״ͼ��");
			chart.display();
		} else if (type.equalsIgnoreCase("line")) {
			chart = new LineChart();
			System.out.println("��ʼ����������ͼ��");
			chart.display();
		}
		return chart;
	}
}
