package com.example.Student_Library_Management_System;

import com.example.Student_Library_Management_System.Models.Author;
import com.example.Student_Library_Management_System.Models.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentLibraryManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentLibraryManagementSystemApplication.class, args);
//		Book book = new Book();
//		book.setName("Godan");
//		book.setPages(200);
//		Author author = new Author();
//		author.setId(1);
//		book.setAuthor(author);
//		int authorId=  book.getAuthor().getId();
//		System.out.print(authorId);
	}

}
