package Design_Patterns_And_Priciples.factory.audio_plyaer;

import Design_Patterns_And_Priciples.factory.audio_plyaer.models.AudioPlayer;
import Design_Patterns_And_Priciples.factory.audio_plyaer.models.MediaFormat;
import Design_Patterns_And_Priciples.factory.audio_plyaer.models.Node;
import Design_Patterns_And_Priciples.factory.audio_plyaer.models.TreeSizeCalculator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = AudioPlayerFactory.getAudiPlayer(MediaFormat.MP3, 50, 1.0);
        System.out.println(audioPlayer);
        System.out.println(audioPlayer.supportType());

        //
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ExecutorService executor = Executors.newFixedThreadPool(5);

        TreeSizeCalculator calculator = new TreeSizeCalculator(root, executor);

        try {
            Future<Integer> result = executor.submit(calculator);
            int size = result.get();
            System.out.println("Size of the binary tree: " + size);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {

            executor.shutdown();
        }
    }
}
