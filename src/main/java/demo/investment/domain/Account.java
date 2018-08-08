package demo.investment.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Account {
	private String name;
	private final List<Cashflow> cashflows = new ArrayList<>();

	public double getAvgDays(LocalDate end) {
		return this.getDayCash(end) / this.getPrincipal();
	}

	public double getDayCash(LocalDate end) {
		return cashflows.stream()//
			.mapToDouble(e -> e.getDayMoney(end))//
			.sum();
	}

	public double getPrincipal() {
		return cashflows.stream()//
			.mapToDouble(e -> e.getPrincipal())//
			.sum();
	}

}
