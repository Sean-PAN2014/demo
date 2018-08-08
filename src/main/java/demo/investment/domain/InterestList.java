package demo.investment.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterestList {

	private LocalDate end;
	private double franklin;
	private double fidelity;
	private double abc;
	private double stock;
	private double ant;

}
