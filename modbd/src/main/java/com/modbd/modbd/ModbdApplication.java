package com.modbd.modbd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class ModbdApplication  implements CommandLineRunner {

	//@Autowired
	//private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ModbdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//String sql = "SELECT * FROM Students";

		//List<Student> students = jdbcTemplate.query(sql,
		//		BeanPropertyRowMapper.newInstance(Student.class));

		//students.forEach(System.out :: println);
	}
}
