package com.example.remote_APIs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/remote")
public class RemoteApiController {
    @Autowired
    RestTemplate  restTemplate;
    @GetMapping("/get")
    public Object getMoviesDetails(){

        String url= "https://api.themoviedb.org/3/movie/157336?api_key=20afa3e2bea2b2a5e36980d88343c6f0";
      Object ResponceObject=  restTemplate.getForEntity(url, Object.class);
      return ResponceObject;



    }
}

