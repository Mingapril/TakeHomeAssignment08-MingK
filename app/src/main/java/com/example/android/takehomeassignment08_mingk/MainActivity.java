package com.example.android.takehomeassignment08_mingk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Book> books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new BookAdapter(books, this));

    }

    private void initialData(){
        books = new ArrayList<>();
        books.add(new Book(R.string.book_game, R.string.book_game_author, R.string.book_game_genre, R.drawable.image_game,false));
        books.add(new Book(R.string.book_harry_potter,R.string.book_harry_potter_author, R.string.book_harry_potter_genre,R.drawable.image_harry,true));
        books.add(new Book(R.string.book_da_vinci, R.string.book_da_vinci_author,R.string.book_da_vinci_genre,R.drawable.image_davinci,false));
        books.add(new Book(R.string.book_wuthering_heights,R.string.book_wuthering_author,R.string.book_wuthering_genre,R.drawable.image_wuthering,true));
    }
}
