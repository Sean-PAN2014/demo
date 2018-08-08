package demo.investment;

import java.time.LocalDate;
import java.util.List;

import demo.investment.domain.AccountReport;
import demo.investment.domain.Cashflow;
import demo.investment.domain.InterestList;
import demo.investment.domain.Report;

public class Reports {
	
	public static Report dueTo20180228() {
		LocalDate end = LocalDate.parse("2018-02-28");
		double franklin = 3755.97*Accounts.FX_RATE;
		double fidelity = 7048;
		double abc = -1239.98;
		double stock = 1728.30;
		double ant = 1733.04;
		InterestList interestList = new InterestList(end, franklin, fidelity, abc, stock, ant);
		return buildReport(end, interestList);
	}
	
	public static Report dueTo20180807() {
		LocalDate end = LocalDate.parse("2018-08-07");
		double franklin = 2832.72*Accounts.FX_RATE;
		double fidelity = 20197.39;
		double abc = -8398.88;
		double stock = -15752.28;
		double ant = 6134.73;
		InterestList interestList = new InterestList(end, franklin, fidelity, abc, stock, ant);
		return buildReport(end, interestList);
	}

	private static Report buildReport(LocalDate end, InterestList interestList) {
		Report report = new Report();
		report.setEnd(interestList.getEnd());
		List<AccountReport> accountReports = report.getAccountReports();
		accountReports.add(AccountReports.fundFranklin(new Cashflow(interestList.getFranklin(), end)));
		accountReports.add(AccountReports.fundFedility(new Cashflow(interestList.getFidelity(), end)));
		accountReports.add(AccountReports.fundAbc(new Cashflow(interestList.getAbc(), end)));
		accountReports.add(AccountReports.equityCn(new Cashflow(interestList.getStock(), end)));
		accountReports.add(AccountReports.ant(new Cashflow(interestList.getAnt(), end)));
		return report;
	}
	
}
