package demo.investment.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SimpleInvest extends AbstractInvest {

	private double principal;
	private double interest;
	private LocalDate start;
	private LocalDate end = LocalDate.now();

	public SimpleInvest() {
	}

	public SimpleInvest(double principal, double interest, LocalDate start) {
		this.principal = principal;
		this.interest = interest;
		this.start = start;
	}

	public SimpleInvest(double principal, double interest, LocalDate start, LocalDate end) {
		this.principal = principal;
		this.interest = interest;
		this.start = start;
		this.end = end;
	}

	public long getDays() {
		return ChronoUnit.DAYS.between(start, end);
	}

}
