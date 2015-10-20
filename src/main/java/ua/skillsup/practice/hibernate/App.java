package ua.skillsup.practice.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.skillsup.practice.hibernate.dao.ItemDao;
import ua.skillsup.practice.hibernate.dao.LotDao;
import ua.skillsup.practice.hibernate.model.LotDto;
import ua.skillsup.practice.hibernate.model.filter.ItemFilter;
import ua.skillsup.practice.hibernate.service.AuctionService;

/**
 * Created by oleksii on 10/10/15.
 */
public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		ItemDao itemDao = context.getBean(ItemDao.class);
		System.out.println(itemDao.findAll());
		System.out.println(itemDao.findByTitle("Dinning table"));
		ItemFilter filter = new ItemFilter();
		filter.setWeightFrom(3.0);

		System.out.println(itemDao.findByFilter(filter));

		LotDao lotDao = context.getBean(LotDao.class);
		System.out.println(lotDao.findAll());
		LotDto lot = lotDao.findAll().get(0);
		LotDto newOne = new LotDto();
		newOne.setItem(lot.getItem());
		newOne.setOwner(lot.getOwner());
		long id = lotDao.create(newOne);
		System.out.println(id);
		AuctionService service = context.getBean(AuctionService.class);

		context.stop();
	}
}
