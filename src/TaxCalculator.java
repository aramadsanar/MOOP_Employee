
public class TaxCalculator {

	private static int getPKP(int totalIncome, boolean isMarried, int childCount) {
		int ptkp = 54000000;

		if (childCount >= 0 && childCount <= 3) {
			ptkp += ((childCount + 1) * 4500000);
		}

		else if (childCount > 3) {
			ptkp += (4 * 4500000);	
		}
		if (isMarried) {
            childCount++;
   		}
		//totalIncome -=ptkp;
		//System.out.println("Total income : " + totalIncome);
		return totalIncome - ptkp;
		//return ptkp;
	}

	public static int getTax(int pkp) {
		int total = 0;
		int calculate = 0;
		if (pkp <= 50000000) {
			total += (int) ((float)pkp * 0.05);
			return total;
		}

		else if (pkp > 50000000 && pkp <= 250000000) {
			calculate += 50000000;
			total += (int) (((float)calculate * 0.05));

			pkp-=calculate;

			total += (int) (((float)pkp * 0.15));
		}

		else if (pkp > 250000000 && pkp <= 500000000) {
			calculate += 50000000;
			total += (int) (((float)calculate * 0.05));
			pkp -= calculate;

			calculate = 0;
			calculate += 200000000;
			total += (int) (((float)calculate * 0.15));
		
			pkp -= calculate;

			total += (int) (((float)pkp * 0.25));
		}

		else if(pkp > 50000000) {
			calculate += 50000000;
			total += (int) (((float)calculate * 0.05));
			pkp -= calculate;

			calculate = 0;
			calculate += 200000000;
			total += (int) (((float)calculate * 0.15));
		
			pkp -= calculate;


			calculate += 250000000;

			total += (int) (((float)calculate * 0.25));
			pkp -= calculate;

			total += (int) (((float)pkp * 0.25));
		}
		return total;
	}

	
	public static int calculateTax(Employee e) {
		int totalSalary = e.getTotalSalary();
		return getTax(getPKP(totalSalary, e.isMarried(), e.getChildCount()));
	}

}
