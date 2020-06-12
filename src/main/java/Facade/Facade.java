package Facade;

import lombok.Data;

@Data
public class Facade {
    Comic comic;
    WordBook wordBook;
    Novel novel;
    public Facade(){
        comic = new Comic();
        wordBook = new WordBook();
        novel = new Novel();
    }

    public void readCommic(){
        comic.read();
    }
    public void readWordBook(){
        wordBook.read();
    }
    public void readNovel(){
        novel.read();
    }
}
