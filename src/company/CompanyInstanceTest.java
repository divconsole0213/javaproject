package company;

import java.util.Calendar;

public class CompanyInstanceTest {

	public static void main(String[] args) {
	Company	company1 = Company.getInstance();
   Company company2 = Company.getInstance();
   System.out.println(company1);
   System.out.println(company2);
   Calendar calendar = Calendar.getInstance();
   calendar.add(7, 31);
   System.out.println(calendar);
	}

}
