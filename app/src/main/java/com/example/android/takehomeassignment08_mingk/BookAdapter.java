package com.example.android.takehomeassignment08_mingk;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookViewHolder>  {

    private List<Book> books;
    private Context context;

    public  BookAdapter(List<Book> books,Context context){
        this.books = books;
        this.context = context;

    }

    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_book,parent,false);
        return new BookViewHolder(view,context);

    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {
        Book book = books.get(position);
        holder.bookName.setText(book.name);
        holder.bookAuthor.setText(book.author);
        holder.bookImage.setImageResource(book.photoID);
        holder.bookGenre.setText(book.genre);
        holder.finish = book.finish;

    }




    @Override
    public int getItemCount() {
        return books.size();
    }
}

