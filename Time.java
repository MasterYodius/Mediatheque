package systemSimplifie;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Time {

	public static LocalDate current_time(){
		LocalDate localDate = LocalDate.now();
		return localDate;
	}
	public static long diff_time(LocalDate date){
		LocalDate localDate = LocalDate.now();
		return ChronoUnit.DAYS.between(localDate , date);
	}
	public static boolean exces_time(LocalDate date, int max_day){
		if  ((long) max_day >= diff_time(date)){
			return false;
		}
		return true;
	}
	public static LocalDate add_time(LocalDate date, int max_day){
		return date.plusDays(max_day);
	}
}
