package org.wecancoeit.reviews.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.wecancoeit.reviews.entity.Review;

@Service
public interface ReviewRepository extends CrudRepository<Review, Long> {
}
