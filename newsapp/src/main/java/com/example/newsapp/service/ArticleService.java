package com.example.newsapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.newsapp.model.Article;
import com.example.newsapp.repository.ArticleRepository;

@Service

public class ArticleService {

    // service/ArticleService.java



    @Autowired
    private ArticleRepository articleRepo;

    public Article saveArticle(Article article) {
        return articleRepo.save(article);
    }

    public List<Article> getAllArticles() {
        return articleRepo.findAll();
    }
}


