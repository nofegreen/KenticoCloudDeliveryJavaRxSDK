package kenticocloud.kenticoclouddancinggoat.app.articles;

import java.util.List;

import kenticocloud.kenticoclouddancinggoat.BasePresenter;
import kenticocloud.kenticoclouddancinggoat.BaseView;
import kenticocloud.kenticoclouddancinggoat.data.models.Article;

/**
 * Created by RichardS on 15. 8. 2017.
 */

public interface ArticlesContract {
    interface View extends BaseView<Presenter>{
        void showArticles(List<Article> articles);
    }

    interface Presenter extends BasePresenter{
        void loadArticles();
    }
}
