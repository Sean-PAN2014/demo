package demo.investment;

import java.util.ArrayList;
import java.util.List;

import demo.investment.domain.AccountReport;

public class CalculatorAll {

	public static void main(String[] args) {
		List<AccountReport> accountReports = new ArrayList<>();
		accountReports.add(Invests.fundFranklin());
		accountReports.add(Invests.fundFedility());
		accountReports.add(Invests.fundAbc());
		accountReports.add(Invests.equityCn());
		accountReports.add(Invests.ant());
		//
		System.out.println("截止 " + Invests.END);
		accountReports.forEach(invest -> System.out.println(invest.getSummary()));
		double totalInterest = accountReports.stream().mapToDouble(i -> i.getInterest()).sum();
		double dayCash = accountReports.stream().mapToDouble(i -> i.getAvgDays() * i.getPrincipal()).sum();
		System.out.println(String.format("整体年化收益 %.2f%%", totalInterest * 365 / dayCash * 100));
	}

}
