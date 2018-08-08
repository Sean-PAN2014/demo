package demo.investment;

import java.time.LocalDate;
import java.util.List;

import demo.investment.domain.Cashflow;
import demo.investment.domain.MultidayInvest;
import demo.investment.domain.SimpleInvest;

public class Invests {
	public static LocalDate END = LocalDate.parse("2018-02-28");
//	private static LocalDate END = LocalDate.now();

	public static SimpleInvest fundFranklin() {
		LocalDate start = LocalDate.parse("2016-12-20");
		SimpleInvest simpleInvest = new SimpleInvest(25000*6.828, 3755.97*6.828, start, END);
		simpleInvest.setName("富兰克林");
		return simpleInvest;
	}

	public static SimpleInvest fundFedility() {
		LocalDate start = LocalDate.parse("2017-07-14");
		SimpleInvest simpleInvest = new SimpleInvest(104_000, 7048, start, END);
		simpleInvest.setName("富达科技");
		return simpleInvest;
	}

	public static SimpleInvest fundAbc() {
		LocalDate start = LocalDate.parse("2017-11-17");
		SimpleInvest simpleInvest = new SimpleInvest(50000, -1239.98, start, END);
		simpleInvest.setName("农行基金");
		return simpleInvest;
	}

	public static MultidayInvest equityCn() {
		MultidayInvest multidayInvest = new MultidayInvest();
		multidayInvest.setName("长江证券");
		multidayInvest.setInterest(1728.30);
		multidayInvest.setEnd(END);
		List<Cashflow> cashflows = multidayInvest.getAccount().getCashflows();
		cashflows.add(new Cashflow(20_000, LocalDate.parse("2017-09-12")));
		cashflows.add(new Cashflow(20_000, LocalDate.parse("2017-09-13")));
		cashflows.add(new Cashflow(20_000, LocalDate.parse("2017-09-14")));
		cashflows.add(new Cashflow(10_000, LocalDate.parse("2017-09-20")));

		cashflows.add(new Cashflow(20_000, LocalDate.parse("2017-10-20")));
		cashflows.add(new Cashflow(10_000, LocalDate.parse("2017-12-05")));
		cashflows.add(new Cashflow(50_000, LocalDate.parse("2017-12-26")));

		cashflows.add(new Cashflow(30_000, LocalDate.parse("2018-01-19")));
		return multidayInvest;
	}

	public static SimpleInvest ant() {
		LocalDate start = LocalDate.parse("2018-02-06");
		SimpleInvest simpleInvest = new SimpleInvest(20000, 1733.04, start, END);
		simpleInvest.setName("蚂蚁金服");
		return simpleInvest;
	}

}
