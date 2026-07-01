package kr.co.sboard.dao;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Log4j2
@SpringBootTest
class ArticleDAOTest {

    @Autowired
    private ArticleDAO dao;

    @Test
    void insert() {
    }

    @Test
    void select() {
    }

    @Test
    void selectAll() {

        List<ArticleDTO> dtoList = dao.selectAll();

        for(ArticleDTO dto : dtoList){
            log.info(dto);
        }

        log.info(dtoList);
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}