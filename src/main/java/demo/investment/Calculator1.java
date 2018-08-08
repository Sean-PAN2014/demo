package demo.investment;

import java.time.LocalDate;
import java.util.List;

import demo.investment.domain.Cashflow;
import demo.investment.domain.MultidayInvest;

public class Calculator1 {
	private static LocalDate END = LocalDate.parse("2018-02-28");

	public static void main(String[] args) {
		MultidayInvest multidayInvest = equityCn();

//		System.out.println(invest1.getDays());
//		System.out.println(invest1.getReturn());
		System.out.println(multidayInvest.getAnnualReturn());
		System.out.println(multidayInvest.getSummary());
	}

	public static MultidayInvest equityCn() {
		MultidayInvest multidayInvest = new MultidayInvest();
		multidayInvest.setInterest(500);
		multidayInvest.setEnd(END);
		List<Cashflow> cashflows = multidayInvest.getAccount().getCashflows();
		cashflows.add(new Cashflow(15_000, LocalDate.parse("2017-02-28")));
		cashflows.add(new Cashflow(-5_000, LocalDate.parse("2017-02-28")));
		return multidayInvest;
	}

}
