package class1;

public class ClassEx1 {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];
        MovieReview inception = new MovieReview();
        movieReviews[0] = inception;
        inception.title = "인셉션";
        inception.review = "굿";

        MovieReview aboutTime = new MovieReview();
        movieReviews[1] = aboutTime;
        movieReviews[1].title = "어바웃타임";
        movieReviews[1].review ="밷";

        for (MovieReview movieReview : movieReviews) {
            System.out.println(movieReview.title + movieReview.review);

        }


    }
}
