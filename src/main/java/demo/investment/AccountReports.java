package demo.investment;

import demo.investment.domain.AccountReport;
import demo.investment.domain.Cashflow;

public class AccountReports {

	public static AccountReport fundFranklin(Cashflow earning) {
		AccountReport accountReport = new AccountReport();
		accountReport.setAccount(Accounts.fundFranklin());
		accountReport.setEarning(earning);
		return accountReport;
	}

	public static AccountReport fundFedility(Cashflow earning) {
		AccountReport accountReport = new AccountReport();
		accountReport.setAccount(Accounts.fundFedility());
		accountReport.setEarning(earning);
		return accountReport;
	}

	public static AccountReport fundAbc(Cashflow earning) {
		AccountReport accountReport = new AccountReport();
		accountReport.setAccount(Accounts.fundAbc());
		accountReport.setEarning(earning);
		return accountReport;
	}

	public static AccountReport equityCn(Cashflow earning) {
		AccountReport accountReport = new AccountReport();
		accountReport.setAccount(Accounts.equityCn());
		accountReport.setEarning(earning);
		return accountReport;
	}

	public static AccountReport ant(Cashflow earning) {
		AccountReport accountReport = new AccountReport();
		accountReport.setAccount(Accounts.ant());
		accountReport.setEarning(earning);
		return accountReport;
	}

}
