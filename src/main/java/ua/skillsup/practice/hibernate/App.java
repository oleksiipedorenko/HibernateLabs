package ua.skillsup.practice.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.skillsup.practice.hibernate.dao.ItemDao;
import ua.skillsup.practice.hibernate.dao.LotDao;
import ua.skillsup.practice.hibernate.dao.UserDao;
import ua.skillsup.practice.hibernate.model.LotDto;
import ua.skillsup.practice.hibernate.model.filter.ItemFilter;
import ua.skillsup.practice.hibernate.service.AuctionService;

import java.math.BigDecimal;
import java.util.Collections;

/**
 * Created by oleksii on 10/10/15.
 */
public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		LotDao lotDao = context.getBean(LotDao.class);

		System.out.println(lotDao.findAll());
//
//		AuctionService service = context.getBean(AuctionService.class);
//
//		LotDto lot = service.createLot("Odin", "Dinning table",
//				BigDecimal.valueOf(100), 7);
//
//		System.out.println(lot);
//
//
//		System.out.println(lotDao.findAll().size());

		ItemDao itemDao = context.getBean(ItemDao.class);

		System.out.println(itemDao.findByCategories(Collections.singleton("Movie")));


		context.stop();
	}
}
