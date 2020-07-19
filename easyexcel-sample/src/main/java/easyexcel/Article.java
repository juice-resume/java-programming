package easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;

public class Article {
    @ExcelProperty("文章标题")
    private String title;
    @ExcelProperty("文章链接")
    private String link;
    @ExcelProperty("阅读数")
    private Integer view;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }
}
