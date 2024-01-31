package project.hugofy.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hugofy.client.AuthSpotifyClient;
import project.hugofy.client.GoogleClient;
import project.hugofy.client.LoginRequest;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {

    private final AuthSpotifyClient authSpotifyClient;

    public AlbumController(AuthSpotifyClient authSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
    }

    @GetMapping("/albuns")
    public ResponseEntity<String> helloWord (){
        var request = new LoginRequest(
                "client_credentials",
                "4efeb0d482f44866b19d2da2afab1d3d",
                "c3b2fb5eea18412baa8d0708361eaef6"
        );

        return ResponseEntity.ok(authSpotifyClient.login(request).getAccessToken());
    }
}
