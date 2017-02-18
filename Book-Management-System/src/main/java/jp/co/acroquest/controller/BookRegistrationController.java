package jp.co.acroquest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookRegistrationController
{
    /**
     * 書籍情報一覧画面を表示
     * @return 書籍情報一覧画面
     */
    @RequestMapping("/list")
    public String home()
    {
        return "/list";
    }

    /**
     * 書籍情報詳細画面を表示
     * @return 書籍情報詳細画面
     */
    @RequestMapping("/detail")
    public String detail()
    {
        return "/detail";
    }

    /**
     * 貸出状況変更画面を表示
     * @return 貸出状況変更画面
     */
    @RequestMapping("/borrow")
    public String borrow()
    {
        return "/borrow";
    }

    /**
     * 書籍情報登録画面を表示
     * @return 書籍情報登録画面
     */
    @RequestMapping("/create")
    public String create()
    {
        return "/create";
    }

    /**
     * 書籍情報登録確認画面を表示
     * @return 書籍情報登録確認画面
     */
    @RequestMapping("/createConfirm")
    public String createConfirm()
    {
        return "/createConfirm";
    }

    /**
     * 書籍情報更新画面を表示
     * @return 書籍情報更新画面
     */
    @RequestMapping("/update")
    public String update()
    {
        return "/update";
    }

    /**
     * 書籍情報更新確認画面を表示
     * @return 書籍情報更新確認画面
     */
    @RequestMapping("/updateConfirm")
    public String updateConfirm()
    {
        return "/updateConfirm";
    }

    /**
     * 書籍情報削除確認画面を表示
     * @return 書籍情報削除確認画面
     */
    @RequestMapping("/deleteConfirm")
    public String deleteConfirm()
    {
        return "/deleteConfirm";
    }

}
