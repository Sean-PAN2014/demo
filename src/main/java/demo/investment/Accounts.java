package demo.investment;

import java.time.LocalDate;
import java.util.List;

import demo.investment.domain.Account;
import demo.investment.domain.Cashflow;

public class Accounts {
	public static final double FX_RATE = 6.828;

	public static Account fundFranklin() {
		Account account = new Account();
		account.setName("富兰克林");
		List<Cashflow> cashflows = account.getCashflows();
		cashflows.add(new Cashflow(25000 * FX_RATE, LocalDate.parse("2016-12-20")));
		return account;
	}

	public static Account fundFedility() {
		Account account = new Account();
		account.setName("富达科技");
		List<Cashflow> cashflows = account.getCashflows();
		cashflows.add(new Cashflow(104_000, LocalDate.parse("2017-07-14")));
		return account;
	}

	public static Account fundAbc() {
		Account account = new Account();
		account.setName("农行基金");
		List<Cashflow> cashflows = account.getCashflows();
		cashflows.add(new Cashflow(50000, LocalDate.parse("2017-11-17")));
		cashflows.add(new Cashflow(50000, LocalDate.parse("2018-06-12")));
		return account;
	}

	public static Account equityCn() {
		Account account = new Account();
		account.setName("长江证券");
		List<Cashflow> cashflows = account.getCashflows();
		cashflows.add(new Cashflow(20_000, LocalDate.parse("2017-09-12")));
		cashflows.add(new Cashflow(20_000, LocalDate.parse("2017-09-13")));
		cashflows.add(new Cashflow(20_000, LocalDate.parse("2017-09-14")));
		cashflows.add(new Cashflow(10_000, LocalDate.parse("2017-09-20")));
		cashflows.add(new Cashflow(20_000, LocalDate.parse("2017-10-20")));
		cashflows.add(new Cashflow(10_000, LocalDate.parse("2017-12-05")));
		cashflows.add(new Cashflow(50_000, LocalDate.parse("2017-12-26")));
		cashflows.add(new Cashflow(30_000, LocalDate.parse("2018-01-19")));
		cashflows.add(new Cashflow(-2278.82, LocalDate.parse("2018-06-08")));
		return account;
	}

	public static Account ant() {
		Account account = new Account();
		account.setName("蚂蚁金服");
		List<Cashflow> cashflows = account.getCashflows();
		cashflows.add(new Cashflow(20_000, LocalDate.parse("2018-02-06")));
		cashflows.add(new Cashflow(10_000, LocalDate.parse("2018-03-01")));
		cashflows.add(new Cashflow(10_000, LocalDate.parse("2018-03-02")));
		cashflows.add(new Cashflow(5_000, LocalDate.parse("2018-03-29")));
		cashflows.add(new Cashflow(10_000, LocalDate.parse("2018-04-02")));
		cashflows.add(new Cashflow(10_000, LocalDate.parse("2018-04-22")));
		cashflows.add(new Cashflow(25_000, LocalDate.parse("2018-06-27")));
		cashflows.add(new Cashflow(15_000, LocalDate.parse("2018-07-04")));
		return account;
	}

}
