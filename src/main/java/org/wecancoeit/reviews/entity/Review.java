package org.wecancoeit.reviews.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Review {
    @Id
    private Long id;
    private String title;
    private String url;
    private String category;
    private String content;

    public Review(String title, String url, String category, String content) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.category = category;
        this.content = content;
    }

    public Review() {

    }

    public Review(Long id, String title, String url, String category, String content) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.category = category;
        this.content = content;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String image) {
        this.url = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", image='" + url + '\'' +
                ", category='" + category + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(id, review.id) && Objects.equals(title, review.title) && Objects.equals(url, review.url) && Objects.equals(category, review.category) && Objects.equals(content, review.content) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, url, category, content);
    }

}
