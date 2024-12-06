package LLD_1_Part_2.collections_exceptions.generic.document;

// now d can be only doc type or its parent others are not allowed
public class DocPrinter <D extends Doc>{
    D doc;
    public DocPrinter(D d){
        this.doc=d;
    }

    public void print(){
        System.out.println(doc.content);
    }
}
