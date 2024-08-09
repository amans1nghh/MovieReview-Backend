package dev.aman.movieist.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.aman.movieist.model.Review;
import dev.aman.movieist.service.ReviewService;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService service;

    @PostMapping
    public ResponseEntity<?> createReview(@RequestBody Map<String, String> payload) {
        String reviewBody = payload.get("reviewBody");
        String imdbId = payload.get("imdbId");

        if (reviewBody == null || reviewBody.trim().isEmpty()) {
            return new ResponseEntity<>("Review body cannot be empty", HttpStatus.BAD_REQUEST);
        }

        Review review = service.createReview(reviewBody, imdbId);
        return new ResponseEntity<>(review, HttpStatus.OK);
    }
}
