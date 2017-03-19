package jp.co.acroquest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.acroquest.entity.Book;

@Mapper
public interface BookMapper
{
    /**
     * 書籍情報
     * @param book 書籍情報
     */
    void insert(Book book);

    /**
     * IDをもとに書籍情報を取得する
     * @param id 書籍ID
     * @return 書籍情報
     */
    Book findById(int id);

    /**
     * すべての書籍情報を取得する
     * @return 全書籍情報
     */
    List<Book> findAll();

}
