package demo.investment;

import java.time.LocalDate;

import demo.investment.domain.SimpleInvest;

public class Calculator {

	public static void main(String[] args) {
		SimpleInvest simpleInvest = ant();

		System.out.println(simpleInvest.getDays());
		System.out.println(simpleInvest.getReturn());
		System.out.println(simpleInvest.getAnnualReturn());
		System.out.println(simpleInvest.getSummary());
	}

	private static SimpleInvest ant() {
		LocalDate end = LocalDate.parse("2018-02-28");
		//		LocalDate end = LocalDate.now();
		LocalDate start = LocalDate.parse("2018-02-06");
		SimpleInvest simpleInvest = new SimpleInvest(20000.00, 1733.04, start, end);
		return simpleInvest;
	}

}
