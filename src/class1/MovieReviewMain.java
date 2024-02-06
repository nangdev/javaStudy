package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview mr1 = new MovieReview();
        MovieReview mr2 = new MovieReview();

        mr1.title = "인셉션";
        mr1.review = "인생은 무한루프";

        mr2.title = "어바웃 타임";
        mr2.review = "인생 시간 영화!";

        MovieReview[] movieReviews = {mr1,mr2};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화제목: " + movieReview.title + ", 리뷰: " + movieReview.review);
        }
    }
}
