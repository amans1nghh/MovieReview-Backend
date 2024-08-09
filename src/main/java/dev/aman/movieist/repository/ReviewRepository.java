package dev.aman.movieist.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.aman.movieist.model.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}