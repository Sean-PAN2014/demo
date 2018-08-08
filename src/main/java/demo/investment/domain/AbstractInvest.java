package demo.investment.domain;

import lombok.Data;

@Data
public abstract class AbstractInvest implements AccountReport {
	private String name;
	
}
