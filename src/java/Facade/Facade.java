package Facade;

import lombok.Data;

@Data
public class Facade {
    Commic commic;
    WordBook wordBook;
    Novel novel;
    public void readCommic(){
        commic.read();
    }
    public void setWordBook(){
        wordBook.read();
    }
    public void readNovel(){
        novel.read();
    }
}
