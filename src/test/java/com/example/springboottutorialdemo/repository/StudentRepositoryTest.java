package com.example.springboottutorialdemo.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.example.springboottutorialdemo.entity.StudentEntity;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StudentRepositoryTest {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private TestEntityManager entityManager;
	
	void setup() {
		StudentEntity studentEntity = new StudentEntity(44, "Rahul", 11, "Madhyamgram");
		entityManager.persist(studentEntity);
	}
	
	public void findByStudentId() {
		StudentEntity student = studentRepository.findById(44).get();
		assertEquals("Rahul", student.getName());
	}

}
