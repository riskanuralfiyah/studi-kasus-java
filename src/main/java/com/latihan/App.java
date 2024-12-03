//package com.latihan;
//
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.support.DefaultListableBeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.latihan.domain.Author;
//import com.latihan.domain.Book;
//import com.latihan.dto.BookDetailDTO;
//import com.latihan.service.BookService;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
////        Author author = new Author();
//        ClassPathXmlApplicationContext appContext= new ClassPathXmlApplicationContext("application-context.xml");
//        BookService bookService = (BookService) appContext.getBean("bookService");
//        BookDetailDTO bookDetailDTO = bookService.findBookDetailById(1L);
//        System.out.println("Book Detail = " + bookDetailDTO);
//        
////        Author author = (Author) appContext.getBean("author");
////        System.out.println("Author : " + author);
//    }
//}

package com.latihan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//import com.latihan.config.AppConfig;
import com.latihan.domain.Author;
import com.latihan.dto.BookDetailDTO;
import com.latihan.service.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Author author = new Author();
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
        BookService bookService = (BookService) appContext.getBean("bookService");
        BookDetailDTO bookDetailDTO = bookService.findBookDetailById(2L);
        System.out.println("Book Detail = "+ bookDetailDTO);
        
//        Author author = (Author) appContext.getBean("author");
//        System.out.println("Author = "+author);
//        FileSystemXmlApplicationContext appContext = new FileSystemXmlApplicationContext("C:\Users\AVITA\eclipse-springboot\projectPertama\src\main\resources\application-context.xml");
//        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        BookService bs = (BookService) appContext.getBean("bookService");
        BookDetailDTO dto = bs.findBookDetailById(1L);
        System.out.println("Book Detail = "+dto);
    }
}