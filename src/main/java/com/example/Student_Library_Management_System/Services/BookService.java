package com.example.Student_Library_Management_System.Services;

//import com.example.Student_Library_Management_System.DTOs.BookRequestDto;
import com.example.Student_Library_Management_System.Models.Author;
import com.example.Student_Library_Management_System.Models.Book;
import com.example.Student_Library_Management_System.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
@Service
public class BookService {
    @Autowired
    AuthorRepository authorRepository;
    public  String addBook(Book book) {


//System.out.println(book.getName()+"this is name"+book.getAuthor()+"this is author"+book.getPages()+"this pages");
        int authorId = book.getId();



        //Now i will be Fetching the Author Entity
        Author author = authorRepository.findById(authorId).get();

        //Basic attributes are already set fom Postman

        //Setting the Foreign key Attribute in child class

        // Now , We need to update the listOfBooks written in the parent class
        List<Book> currentBooksWritten = author.getBooksWritten();
      //  Book book = new Book();
        book.setAuthor(author);
//        book.setName(bookRequestDto.getName());
//        book.setPages(bookRequestDto.getPages());
//        book.setGenre(bookRequestDto.getGenre());
        currentBooksWritten.add(book);
        author.setBooksWritten(currentBooksWritten);

        //Now the book is to be saved, but also author is alsoooo to be saved.

        //Why do we need to again save (updating) the author ?? bcz
        //because the author Entity has been updated....we need to resave/update it.

        authorRepository.save(author); //Date was modified

        //.save function works both as save function and as update function


        //bookRepo.save is not required : bcz it will be autocalled by cascading
        //effect

        return "Book Added successfully";



    }
}
