package demo.investment;

import demo.investment.domain.Report;

public class Calculator {

	public static void main(String[] args) {
		Report report = Reports.dueTo20180228();
		System.out.println(report.getSummary());
	}

}
