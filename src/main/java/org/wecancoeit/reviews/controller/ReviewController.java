package org.wecancoeit.reviews.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancoeit.reviews.entity.Review;
import org.wecancoeit.reviews.repository.ReviewRepository;


@Controller
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @GetMapping("/review")
    public String showReview(Model model){

        model.addAttribute("newreviews", new Review());
        model.addAttribute("msglist", reviewRepository.findAll());

        return "ReviewPage";
    }

    @PostMapping("/review")
    public String getReview(@ModelAttribute Review newreviews){
        Review review = new Review(newreviews.getId(),newreviews.getTitle(),newreviews.getUrl(),newreviews.getCategory(),newreviews.getContent());
        reviewRepository.save(review);

        return "redirect:review";
    }


    @GetMapping("/review/1")
    public String showReview0(Model model){

        model.addAttribute("newreviews", new Review());
        model.addAttribute("msglist", reviewRepository.findAll());

        return "reviewcategory";
    }
    @GetMapping("/review/Beach1")
    public String showReview1(Model model){

        model.addAttribute("newreviews", new Review());
        model.addAttribute("msglist", reviewRepository.findAll());

        return "reviewimage";
    }
    @GetMapping("/review/Beach2")
    public String showReview2(Model model){

        model.addAttribute("newreviews", new Review());
        model.addAttribute("msglist", reviewRepository.findAll());

        return "reviewimage2";
    }
    @GetMapping("/review/Beach3")
    public String showReview3(Model model){

        model.addAttribute("newreviews", new Review());
        model.addAttribute("msglist", reviewRepository.findAll());

        return "reviewimage3";
    }
}
