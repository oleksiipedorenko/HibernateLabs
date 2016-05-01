package ua.skillsup.practice.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.skillsup.practice.hibernate.dao.ItemDao;
import ua.skillsup.practice.hibernate.dao.UserDao;
import ua.skillsup.practice.hibernate.model.filter.ItemFilter;
import ua.skillsup.practice.hibernate.service.AuctionService;

import java.math.BigDecimal;

/**
 * Created by oleksii on 10/10/15.
 */
public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		ItemDao itemDao = context.getBean(ItemDao.class);

		AuctionService service = context.getBean(AuctionService.class);

		System.out.println(service.getAllItems());

//		System.out.println(itemDao.findByTitle("Biliberda"));
//		System.out.println(itemDao.findByTitle("Dinning table"));
//
//		ItemFilter filter = new ItemFilter();
//		filter.setWeightFrom(2.0);
//		filter.setWeightTo(5.0);
//		System.out.println(itemDao.findByFilter(filter));

		System.out.println("Before!");
		System.out.println(service.getAllLots().size());

		System.out.println(service.createLot("Odin", "Dinning table",
				BigDecimal.valueOf(1856.98), 5));
		System.out.println("After");
		System.out.println(service.getAllLots().size());

		System.out.println(service.getItemsOfCategory("Movie"));

		context.stop();
	}
}
