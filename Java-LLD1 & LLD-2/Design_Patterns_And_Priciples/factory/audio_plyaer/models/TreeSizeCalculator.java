package Design_Patterns_And_Priciples.factory.audio_plyaer.models;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

// calculating tree size in multi threading using semaphores
public class TreeSizeCalculator implements Callable<Integer>{

    public Node node;
    public ExecutorService es;
    public TreeSizeCalculator(Node node, ExecutorService es){
        this.node=node;
        this.es=es;
    }

    @Override
    public Integer call() throws Exception{
        if(node ==null){
            return 0;
        }

        TreeSizeCalculator leftTree=new TreeSizeCalculator(node.left, es);
        TreeSizeCalculator rightTree=new TreeSizeCalculator(node.right, es);


        Future<Integer> left=es.submit(leftTree);
        Future<Integer> right=es.submit(rightTree);
        return left.get()+ right.get()+1;
    }
}
