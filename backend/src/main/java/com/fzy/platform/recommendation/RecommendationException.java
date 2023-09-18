package com.fzy.platform.recommendation;

public class RecommendationException extends RuntimeException{

    public RecommendationException(String message) {
        super(message);
    }


    public RecommendationException(Throwable cause) {
        super(cause);
    }
}
