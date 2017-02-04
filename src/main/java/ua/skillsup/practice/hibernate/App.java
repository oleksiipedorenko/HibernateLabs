package ua.skillsup.practice.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.skillsup.practice.hibernate.dao.ItemDao;
import ua.skillsup.practice.hibernate.dao.LotDao;
import ua.skillsup.practice.hibernate.model.ItemDto;
import ua.skillsup.practice.hibernate.model.LotDto;
import ua.skillsup.practice.hibernate.service.AuctionService;

import java.util.List;

/**
 * Created by oleksii on 10/10/15.
 */
public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("app-context.xml");
		LotDao lotDao = context.getBean(LotDao.class);
		List<LotDto> list = lotDao.findAll();
		System.out.println(list);

		ItemDao itemDao = context.getBean(ItemDao.class);
		ItemDto itemDto = itemDao.findAll().get(2);

		LotDto lot = new LotDto();
		lot.setItem(itemDto);
		lotDao.create(lot);

		list = lotDao.findAll();
		System.out.println(list);

		AuctionService service = context.getBean(AuctionService.class);

		context.stop();
	}
}
