package easyexcel;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleDao {
    private List<Article> articles = new ArrayList<>();

    public void save(List<Article> raws) {
        articles = raws;
    }

    public List<Article> list() {
        return articles;
    }
}
