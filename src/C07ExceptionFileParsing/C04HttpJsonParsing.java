package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C04HttpJsonParsing {
    public static void main(String[] args) throws IOException, InterruptedException {
//        외부데이터(api) 요청 : 서버간의 통신
//        RestTemplate, RestClient : 스프링에서 가장 많이 사용하는 라이브러리

//        HttpClient는 자바의 내장클래스로서 별도의 역직렬화, 직렬화 작업이 필요
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String postString = response.body();

        ObjectMapper objectMapper = new ObjectMapper();

//        System.out.println(postString);
        JsonNode jsonNodes = objectMapper.readTree(postString);

        List<Post> posts = new ArrayList<>();
//
//        List<Post> postList = jsonNodes.valueStream().map((jsonNode) -> {
//            ObjectMapper objectMapper2 = new ObjectMapper();
//
//            objectMapper2.readValue(jsonNode.toString(), Post.class)
//        }).toList();
        for (JsonNode jsonNode : jsonNodes) {
            posts.add(objectMapper.readValue(jsonNode.toString(), Post.class));
        }

        System.out.println(posts);
    }
}

class Post {
    private Long userId;
    private Long id;
    private String title;
    private String body;

    public Post() {
    }

    public Long getUserId() {
        return userId;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}