package demo.investment;

import java.time.LocalDate;
import java.util.List;

import demo.investment.domain.Invest;
import demo.investment.domain.Report;

public class Reports {
	
	public static Report dueTo20180228() {
		Report report = new Report();
		report.setEnd(LocalDate.parse("2018-02-28"));
		List<Invest> invests = report.getInvests();
		invests.add(Invests.fundFranklin());
		invests.add(Invests.fundFedility());
		invests.add(Invests.fundAbc());
		invests.add(Invests.equityCn());
		invests.add(Invests.ant());
		return report;
	}
	
}
