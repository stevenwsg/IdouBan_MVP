package com.shrimpcolo.johnnytam.ishuying.books;

import com.shrimpcolo.johnnytam.ishuying.BasePresenter;
import com.shrimpcolo.johnnytam.ishuying.BaseView;
import com.shrimpcolo.johnnytam.ishuying.beans.Book;

import java.util.List;

/**
 * Created by Johnny Tam on 2017/3/21.
 */

public interface BooksContract {

    interface View extends BaseView<Presenter> {
        void showRefreshedBooks(List<Book> books);

        void showLoadedMoreBooks(List<Book> books);

        void showNoBooks();

        void showNoLoadedMoreBooks();

        void setRefreshedIndicator(boolean active);
    }

    interface Presenter extends BasePresenter {

        void loadRefreshedBooks(boolean forceUpdate);

        void loadMoreBooks(int start);

        void cancelRetrofitRequest();

        void unSubscribe();

    }


}
