package ArrayEx;

import java.util.Arrays;

public class news {
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};
    String[] favoriteArticles;

    public news(){
        // Initialize favoriteArticles here:
        favoriteArticles = new String[10];
    }

    public void setFavoriteArticle(int favoriteIndex, String newArticle){
        // Add newArticle to favoriteArticles:
        favoriteArticles[favoriteIndex] = newArticle;
    }

    public static void main(String[] args){
        news sampleFeed = new news();

        sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
        sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
        sampleFeed.setFavoriteArticle(0, "Oil News");
        sampleFeed.setFavoriteArticle(1, "disney ");
        sampleFeed.setFavoriteArticle(4, "abc");
        sampleFeed.setFavoriteArticle(5, "nbc");
        sampleFeed.setFavoriteArticle(6, "cbs");
        sampleFeed.setFavoriteArticle(7, "espn");
        sampleFeed.setFavoriteArticle(8, "foxs");
        sampleFeed.setFavoriteArticle(9, "hulu");

        System.out.println(Arrays.toString(sampleFeed.favoriteArticles));

    }
}

