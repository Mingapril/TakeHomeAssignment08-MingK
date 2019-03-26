package com.example.android.takehomeassignment08_mingk;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class BookViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public TextView bookName;
    public TextView bookAuthor;
    public TextView bookGenre;
    public ImageView bookImage;
    public boolean finish;

    public BookViewHolder(View itemView, final Context context){
        super(itemView);

        cardView = (CardView)itemView.findViewById(R.id.card_view);
        bookName = (TextView)itemView.findViewById(R.id.book_name);
        bookAuthor = (TextView)itemView.findViewById(R.id.book_author);
        bookGenre = (TextView)itemView.findViewById(R.id.book_genre);
        bookImage = (ImageView)itemView.findViewById(R.id.book_image);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (finish) {
                    Toast.makeText(context, R.string.finish, Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(context, R.string.reading, Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

}
