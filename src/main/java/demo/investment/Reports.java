package demo.investment;

import java.time.LocalDate;
import java.util.List;

import demo.investment.domain.AccountReport;
import demo.investment.domain.Report;

public class Reports {
	
	public static Report dueTo20180228() {
		Report report = new Report();
		report.setEnd(LocalDate.parse("2018-02-28"));
		List<AccountReport> accountReports = report.getAccountReports();
		accountReports.add(Invests.fundFranklin());
		accountReports.add(Invests.fundFedility());
		accountReports.add(Invests.fundAbc());
		accountReports.add(Invests.equityCn());
		accountReports.add(Invests.ant());
		return report;
	}
	
}
