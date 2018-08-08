package demo.investment;

import java.util.ArrayList;
import java.util.List;

import demo.investment.domain.Invest;

public class CalculatorAll2 {

	public static void main(String[] args) {
		List<Invest> invests = new ArrayList<>();
		invests.add(Invests2.fundFranklin());
		invests.add(Invests2.fundFedility());
		invests.add(Invests2.fundAbc());
		invests.add(Invests2.equityCn());
		invests.add(Invests2.ant());
		//
		System.out.println("截止 " + Invests2.END);
		invests.forEach(invest -> System.out.println(invest.getSummary()));
		double totalInterest = invests.stream().mapToDouble(i -> i.getInterest()).sum();
		double dayCash = invests.stream().mapToDouble(i -> i.getAvgDays() * i.getPrincipal()).sum();

		System.out.println(String.format("整体年化收益 %.2f%%", totalInterest * 365 / dayCash * 100));
	}

}
