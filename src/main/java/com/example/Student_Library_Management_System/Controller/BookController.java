package com.example.Student_Library_Management_System.Controller;

//import com.example.Student_Library_Management_System.DTOs.BookRequestDto;
import com.example.Student_Library_Management_System.Models.Book;
import com.example.Student_Library_Management_System.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("add")
    public String addBook(@RequestBody Book book){

    //    System.out.println(book.getName()+"we are in controller layer"+book.getAuthor()+"this is author"+book.getPages()+"this pages");

        return bookService.addBook(book);
    }
}
