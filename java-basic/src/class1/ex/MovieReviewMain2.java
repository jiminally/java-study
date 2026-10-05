package class1.ex;

public class MovieReviewMain2 {
    static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview(); // 객체 생성해서 참조값 반환, 반환한 참조값을 무비리뷰타입 변수에 대입
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";

        MovieReview movieReview2 = new MovieReview(); // 객체 생성해서 참조값 반환, 반환한 참조값을 무비리뷰타입 변수에 대입
        movieReview2.title = "어바웃타임";
        movieReview2.review = "인생 시간 영화!";

        MovieReview[] movieReviews = new MovieReview[]{movieReview1, movieReview2};

        for (MovieReview m : movieReviews) {
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }

    }
}
