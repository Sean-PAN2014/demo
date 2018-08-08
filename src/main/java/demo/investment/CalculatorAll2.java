package demo.investment;

import java.util.ArrayList;
import java.util.List;

import demo.investment.domain.AccountReport;

public class CalculatorAll2 {

	public static void main(String[] args) {
		List<AccountReport> accountReports = new ArrayList<>();
		accountReports.add(Invests2.fundFranklin());
		accountReports.add(Invests2.fundFedility());
		accountReports.add(Invests2.fundAbc());
		accountReports.add(Invests2.equityCn());
		accountReports.add(Invests2.ant());
		//
		System.out.println("截止 " + Invests2.END);
		accountReports.forEach(invest -> System.out.println(invest.getSummary()));
		double totalInterest = accountReports.stream().mapToDouble(i -> i.getInterest()).sum();
		double dayCash = accountReports.stream().mapToDouble(i -> i.getAvgDays() * i.getPrincipal()).sum();

		System.out.println(String.format("整体年化收益 %.2f%%", totalInterest * 365 / dayCash * 100));
	}

}
