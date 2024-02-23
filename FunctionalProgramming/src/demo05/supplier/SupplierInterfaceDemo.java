package demo05.supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {

	public static void main(String[] args) {
		Supplier<Integer> supplynumber = () -> (int)(Math.random()*1000);
		System.out.println(supplynumber.get());
		
		Supplier<LocalDate> currentDate = () ->LocalDate.now();
		System.out.println(currentDate.get());
		
		Supplier<LocalDateTime> currentTime = () ->LocalDateTime.now();
		System.out.println(currentTime.get());
		
		
	}

}
