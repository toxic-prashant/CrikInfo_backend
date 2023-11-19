package com.app.backend.CrikInfo.controllers;

import com.app.backend.CrikInfo.models.Match;
import com.app.backend.CrikInfo.service.MatchService;
import java.util.List;
import javax.annotation.Resource;
import javax.xml.ws.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {
  @Resource
  private MatchService matchService;

  @GetMapping("/live")
  public ResponseEntity<List<Match>>  getLiveMatches() {
    return new ResponseEntity<>(matchService.getLiveMatches(), HttpStatus.OK);
  }
  @GetMapping
  public ResponseEntity<List<Match>> getAllMatches() {
    return new ResponseEntity<>(matchService.getAllMatches(), HttpStatus.OK);
  }

  @GetMapping("/point-table")
  public ResponseEntity<?> getPointTable() {
    return new ResponseEntity<>(matchService.getPointTable(), HttpStatus.OK);
  }
}
