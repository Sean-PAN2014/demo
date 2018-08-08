package demo.investment;

import java.util.ArrayList;
import java.util.List;

import demo.investment.domain.Invest;

public class CalculatorAll {

	public static void main(String[] args) {
		List<Invest> invests = new ArrayList<>();
		invests.add(Invests.fundFranklin());
		invests.add(Invests.fundFedility());
		invests.add(Invests.fundAbc());
		invests.add(Invests.equityCn());
		invests.add(Invests.ant());
		//
		System.out.println("截止 " + Invests.END);
		invests.forEach(invest -> System.out.println(invest.getSummary()));
		double totalInterest = invests.stream().mapToDouble(i -> i.getInterest()).sum();
		double dayCash = invests.stream().mapToDouble(i -> i.getAvgDays() * i.getPrincipal()).sum();
		System.out.println(String.format("整体年化收益 %.2f%%", totalInterest * 365 / dayCash * 100));
	}

}
