public abstract class AbstractHandler {

//    Створіть проєкт з класом Main.java.
//    Потрібно: Створити клас AbstractHandler.
//    У тілі класу створити методи void open(), void create(), void change(), void save().
//    Створити похідні класи XMLHandler, TXTHandler, DOCHandler від базового класу AbstractHandler.
//    Створити три екземпляри XMLHandler, TXTHandler, DOCHandler.
//
//    Методи мають мати інформацію що саме за хендлер виконує роботу.
//
//    Для прикладу
//
//…. xmlHandler= new XMLHandler();
//xmlHandler.open();
//
//    В консолі буде
//    XMLHandler opens a document

    public abstract void open();
    public abstract void create();
    public abstract void change();
    public abstract void save();

}

class XMLHandler extends AbstractHandler {

    @Override
    public void open() {
        System.out.println("XMLHandler умеет открывать документы...");
        return;
    }

    @Override
    public void create() {
        System.out.println("XMLHandler умеет создавать документы...");
    }

    @Override
    public void change() {
        System.out.println("XMLHandler умеет изменять документы...");
    }

    @Override
    public void save() {
        System.out.println("XMLHandler умеет сохранять документы...");
    }
}

class TXTHandler extends AbstractHandler {

    @Override
    public void open() {
        System.out.println("TXTHandelr умеет открывать текстовые файлы...");
    }

    @Override
    public void create() {
        System.out.println("TXTHandelr умеет создавать текстовые файлы...");
    }

    @Override
    public void change() {
        System.out.println("TXTHandler умеет изменять текстовые файлы...");
    }

    @Override
    public void save() {
        System.out.println("TXTHandelr умеет сохронять текстовые файлы...");
    }
}

class DOCHandler extends AbstractHandler {

    @Override
    public void open() {
        System.out.println("DOCHandler умеет открывать документы...");
    }

    @Override
    public void create() {
        System.out.println("DOCHandler умеет создовать документы...");
    }

    @Override
    public void change() {
        System.out.println("DOCHandler умеет изменять документы...");
    }

    @Override
    public void save() {
        System.out.println("DOCHandler умеет сохронять документы...");
    }
}