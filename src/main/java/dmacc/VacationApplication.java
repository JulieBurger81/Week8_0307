package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Vacation;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.VacationRepository;

@SpringBootApplication
public class VacationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VacationApplication.class, args);
		
		System.out.println("end of main");
	}

	@Autowired
	VacationRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Vacation paris = appContext.getBean("vacation", Vacation.class);
		repo.save(paris);
		
		Vacation capeCode = new Vacation("InnSeason Resorts Captain's Quarters", 1354);
		repo.save(capeCode);
		
		Vacation washingtonDC = new Vacation("Susan's house", 1017, true, 'A');
		repo.save(washingtonDC);
		
		List<Vacation> allVacations = repo.findAll();
		for(Vacation vaca: allVacations) {
			System.out.println(vaca.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}


/*
@SpringBootApplication
public class VacationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VacationApplication.class, args);
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Vacation v = appContext.getBean("vacation", Vacation.class);
		
		System.out.println(v.toString());
	}

}
*/