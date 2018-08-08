package demo.investment.domain;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MultidayInvest extends AbstractInvest {

	private final Account account = new Account();
	private double interest;
	private LocalDate end = LocalDate.now();

	@Override
	public double getPrincipal() {
		return account.getPrincipal();
	}

	@Override
	public double getAvgDays() {
		return account.getAvgDays(end);
	}

}
