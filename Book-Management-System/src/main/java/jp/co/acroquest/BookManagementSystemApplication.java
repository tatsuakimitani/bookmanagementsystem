package jp.co.acroquest;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import jp.co.acroquest.entity.Book;
import jp.co.acroquest.mapper.BookMapper;

@SpringBootApplication
public class BookManagementSystemApplication implements CommandLineRunner
{

    /**
     * メインクラス
     * @param args 起動引数
     */
    public static void main(String[] args)
    {
        SpringApplication.run(BookManagementSystemApplication.class, args);
    }
    
    /** BookMapper */
    private final BookMapper bookMapper;

    /**
     * コンストラクタ
     * @param bookMapper BookMapper
     */
    public BookManagementSystemApplication(BookMapper bookMapper) {
        this.bookMapper = bookMapper; // Mapperをインジェクションする
    }

    // Spring Boot起動時にCommandLineRunner#runメソッドが呼び出される
    @Transactional
    @Override
    public void run(String... args) throws Exception { 
        Book newBook = new Book();
        newBook.setBookName("testbook");
        newBook.setAuthorName("testAuthor");
        newBook.setPublishedDate(new Date());
        newBook.setPublisher("testPublisher");
        newBook.setCategory("category");
        newBook.setBookAbstract("testtete");

        bookMapper.insert(newBook); // 新しいTodoをインサートする

        Book loadedBook = bookMapper.findById(newBook.getId()); // インサートしたBookを取得して標準出力する
        System.out.println("bookname is " + loadedBook.getBookName());
    }
}
