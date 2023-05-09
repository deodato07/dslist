package com.devsuperior.dslist.controlers;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameControler {
    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameMinDTO> findAllGames(){
        List<GameMinDTO> result = gameService.findAll();
        return result;

    }
}
