package collections_exceptions.generic.document;

public class Client {
    public static void main(String[] args) {
        PDF pdf=new PDF("Hello I am Pdf type document and I am a child of Doc class");
        DocPrinter dp=new DocPrinter<>(pdf);
        dp.print();

        FakeDoc fd=new FakeDoc("I am not a child of doc class so i can't use DocPrinter generic class");
        // dp=new DocPrinter<>(fd); //--> will giver error
    }
}
