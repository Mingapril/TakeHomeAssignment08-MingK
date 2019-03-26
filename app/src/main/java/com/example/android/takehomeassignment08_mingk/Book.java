package com.example.android.takehomeassignment08_mingk;

public class Book {
    public int name;
    public int author;
    public int genre;
    public int photoID;
    public boolean finish;

    public int getName(){return name;}

    public void setName(int name){
        this.name = name;

    }

    public int getAuthor(){
        return author;
    }

    public void setAuthor(int author){
        this.author = author;
    }

    public int getGenre(){
        return genre;
    }

    public void setGenre(int genre){
        this.genre = genre;
    }


    public int getPhotoID(){
        return photoID;
    }

    public void setPhotoId(int photoID){
        this.photoID = photoID;
    }

    public boolean isFinish(){
        return finish;
    }

    public void setFinish(boolean isFinish){
        this.finish = isFinish;
    }

    public Book (int name, int author, int genre, int photoID,boolean finish){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.photoID = photoID;
        this.finish = finish;

    }
}
