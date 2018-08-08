package demo.investment.domain;

import lombok.Data;

@Data
public class AccountReport {
	private Account account;
	private Cashflow earning;

	public double getInterest() {
		return earning.getPrincipal();
	}

	public double getPrincipal() {
		return account.getPrincipal(earning.getDate());
	}

	public long getDays() {
		return (long) this.getAvgDays();
	}

	public double getAvgDays() {
		return account.getAvgDays(earning.getDate());
	}

	public double getReturn() {
		return this.getInterest() / this.getPrincipal();
	}

	public double getAnnualReturn() {
		return this.getInterest() * 365 / (this.getPrincipal() * this.getAvgDays());
	}

	public String getSummary() {
		return String.format("%s - 年化收益%.2f%%(平均持有天数%s/金额%s,总收益%.2f%%)", account.getName(), this.getAnnualReturn() * 100, this.getDays(), this.getPrincipal(), this.getReturn() * 100);
	}

}
