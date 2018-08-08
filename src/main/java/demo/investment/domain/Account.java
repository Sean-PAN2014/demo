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
		return this.getDayCash(end) / this.getPrincipal(end);
	}

	public double getDayCash(LocalDate end) {
		return cashflows.stream()//
			.filter(cashflow -> !cashflow.getDate().isAfter(end))//
			.mapToDouble(e -> e.getDayMoney(end))//
			.sum();
	}

	public double getPrincipal(LocalDate end) {
		return cashflows.stream()//
			.filter(cashflow -> !cashflow.getDate().isAfter(end))//
			.mapToDouble(e -> e.getPrincipal())//
			.sum();
	}

}
