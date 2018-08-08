package demo.investment.domain;

public interface Invest {

	String getName();

	double getInterest();

	double getPrincipal();

	default long getDays() {
		return (long) this.getAvgDays();
	}

	default double getAvgDays() {
		return this.getDays();
	}

	default double getReturn() {
		return this.getInterest() / this.getPrincipal();
	}

	default double getAnnualReturn() {
		return this.getInterest() * 365 / (this.getPrincipal() * this.getAvgDays());
	}

	default String getSummary() {
		return String.format("%s - 年化收益%.2f%%(平均持有天数%s/金额%s,总收益%.2f%%)", this.getName(), this.getAnnualReturn() * 100, this.getDays(), this.getPrincipal(), this.getReturn() * 100);
	}

}
