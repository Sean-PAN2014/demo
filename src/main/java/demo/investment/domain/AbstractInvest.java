package demo.investment.domain;

import lombok.Data;

@Data
public abstract class AbstractInvest implements Invest {
	private String name;
	
}
