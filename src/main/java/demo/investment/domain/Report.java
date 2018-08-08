package demo.investment.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Report {
	private LocalDate end;
	private final List<AccountReport> accountReports = new ArrayList<>();

	public String getSummary() {
		StringBuilder sb = new StringBuilder();
		//
		sb.append("截止 ").append(end).append(System.lineSeparator());
		double totalInterest = 0.0;
		double dayCash = 0.0;
		for (AccountReport accountReport : accountReports) {
			sb.append(accountReport.getSummary()).append(System.lineSeparator());
			totalInterest += accountReport.getInterest();
			dayCash += accountReport.getAvgDays() * accountReport.getPrincipal();
		}
		sb.append(String.format("整体年化收益 %.2f%%", totalInterest * 365 / dayCash * 100)).append(System.lineSeparator());
		return sb.toString();
	}

}
