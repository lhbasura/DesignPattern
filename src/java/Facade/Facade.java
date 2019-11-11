package Facade;

import lombok.Data;

@Data
public class Facade {
    Commic commic;
    WordBook wordBook;
    Novel novel;
    public Facade(){
        commic = new Commic();
        wordBook = new WordBook();
        novel = new Novel();
    }

    public void readCommic(){
        commic.read();
    }
    public void readWordBook(){
        wordBook.read();
    }
    public void readNovel(){
        novel.read();
    }
}
