package com.kai.demo5.Test;

import com.kai.demo5.entity.Book;
import com.kai.demo5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/12/1
 **/
public class TestBook {

    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        // 添加
        // Book book = new Book();
        // book.setUserId("2");
        // book.setUsername("java");
        // book.setUstatus("ok");
        // bookService.addBook(book);

        // 修改
        // Book book = new Book();
        // book.setUserId("1");
        // book.setUsername("javaScript");
        // book.setUstatus("false");
        // bookService.updateBook(book);

        // 删除
        // bookService.deleteBook("2");

        // 查询单个值
        // int count = bookService.findCount();
        // System.out.println(count);

        // 查询单个实体对象
        // System.out.println(bookService.findBook("2"));
        // 查询集合
        // System.out.println(bookService.findBookList());

        // 批量添加操作
        // ArrayList<Object[]> batchArgs = new ArrayList<>();
        // Object[] o1 = {"3","java","a"};
        // Object[] o2 = {"4","c","b"};
        // Object[] o3 = {"5","php","c"};
        // batchArgs.add(o1);
        // batchArgs.add(o2);
        // batchArgs.add(o3);

        // bookService.batchAddBook(batchArgs);

        // 批量修改
        // ArrayList<Object[]> batchArgs = new ArrayList<>();
        // Object[] o1 = {"333","java=","3"};
        // Object[] o2 = {"444","c=","4"};
        // Object[] o3 = {"555","php=","5"};
        // batchArgs.add(o1);
        // batchArgs.add(o2);
        // batchArgs.add(o3);
        //
        // bookService.batchUpdateBook(batchArgs);

        // 批量删除
        ArrayList<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        batchArgs.add(o1);
        batchArgs.add(o2);

        bookService.batchDeleteBook(batchArgs);

    }

}
