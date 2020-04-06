package ArrayEx;

import java.util.Arrays;
public class NewFEED {
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};

    public NewFEED(){
    }

    public String[] getTopics(){

        return topics;
    }

    public String getTopTopic(){
        return topics[0];

    }

    public void viewTopic(int topicIndex){

        views[topicIndex] ++;
    }

    public static void main(String[] args) {
        NewFEED sampleFeed = new NewFEED();
        System.out.println("The top topic is " + sampleFeed.getTopTopic());

        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(1);
        System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");

        // NEED this two statement in order to ust Arrays.toSting() method
        //NewFEED SampleFeed = new NewFEED();
        //String[] topics = SampleFeed.getTopics();

        // OR use Arrays.toString(sampleFeed.topics) for what NewFEED is
        System.out.println(Arrays.toString(sampleFeed.topics));

        // using the length method
        System.out.println(sampleFeed.topics.length);
    }
}

