package jp.co.acroquest.entity;

import java.util.Date;

/**
 * Bookエンティティクラス
 * 
 * @author mitani
 */
public class Book
{
    /** 書籍ID */
    private int    id;

    /** 書籍名 */
    private String bookName;

    /** 著者名 */
    private String authorName;

    /** 出版社 */
    private String publisher;

    /** 書籍カテゴリ */
    private String category;

    /** 出版日 */
    private Date   publishedDate;

    /** 書籍概要 */
    private String bookAbstract;

    /**
     * コンストラクタ
     */
    public Book()
    {
        // Do nothing
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return the bookName
     */
    public String getBookName()
    {
        return bookName;
    }

    /**
     * @param bookName the bookName to set
     */
    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    /**
     * @return the authorName
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * @param authorName the authorName to set
     */
    public void setAuthorName(String authorName)
    {
        this.authorName = authorName;
    }

    /**
     * @return the publisher
     */
    public String getPublisher()
    {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    /**
     * @return the category
     */
    public String getCategory()
    {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category)
    {
        this.category = category;
    }

    /**
     * @return the publishedDate
     */
    public Date getPublishedDate()
    {
        return publishedDate;
    }

    /**
     * @param publishedDate the publishedDate to set
     */
    public void setPublishedDate(Date publishedDate)
    {
        this.publishedDate = publishedDate;
    }

    /**
     * @return the bookAbstract
     */
    public String getBookAbstract()
    {
        return bookAbstract;
    }

    /**
     * @param bookAbstract the bookAbstract to set
     */
    public void setBookAbstract(String bookAbstract)
    {
        this.bookAbstract = bookAbstract;
    }
}
