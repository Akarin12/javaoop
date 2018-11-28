package com.soft1841.oop.book;
import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

/**
 * 图书类的数据访问对象
 * Book Data access object
 * 用来定义增删改查操作 CRUD
 */
public interface BookDAO {
    /**
     * 查询所有图书信息
     * @return
     */
    List<Entity> getAllBooks() throws SQLException;

    /**
     * 新增图书
     * @param book
     * @return
     * @throws SQLException
     */
    int insert(Book book) throws SQLException;
    /**
     * 根据id删除图书
     *
     * @param id
     * @return
     * @throws SQLException
     */
    int delete(int id) throws SQLException;

    int update(Book book)throws SQLException;
}