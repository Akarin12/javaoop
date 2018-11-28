package com.soft1841.oop.book;

import cn.hutool.db.Entity;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class BookDAOTest {
    //通过接口回调，
    private BookDAO bookDAO = new BookDAOImpl();

    @Test
    public void getAllBooks() throws SQLException {
        //通过bookDAO接口调用查询所用图书的方法，得到一个集合
        List<Entity> bookList = bookDAO.getAllBooks();
        //通过Lambda遍历集合，输出结果
        bookList.forEach(entity -> System.out.println(entity.get("name") + ";" + entity.get("price")));
    }

    @Test
    public void insert() throws SQLException {
        //创建一个Book对象,用来插入
        Book book = new Book("好啊好", 45.0);
        //受影响的记录行数n
        int n;
        n = bookDAO.insert(book);
        //用断言判定
        assertEquals(1, n);
    }

    @Test
    public void delete() throws SQLException {
        int n = bookDAO.delete(1);
        assertEquals(1,n);
    }

    @Test
    public void update() throws SQLException {
        Book book = new Book();
        book.setPrice(98.0);
        book.setId(1);
        int n =bookDAO.update(book);
        assertEquals(1,n);

    }
}