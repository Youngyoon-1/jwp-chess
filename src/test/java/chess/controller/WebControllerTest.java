package chess.controller;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebControllerTest {

//    @LocalServerPort
//    int port;
//
//    @BeforeEach
//    void setUp() {
//        RestAssured.port = port;
//    }

//    @Test
//    void indexPage() {
//        RestAssured.given().log().all()
//                .accept(MediaType.APPLICATION_JSON_VALUE)
//                .when().get("/")
//                .then().log().all()
//                .statusCode(HttpStatus.OK.value());
//    }
//
//    @Test
//    void startGame() {
//        RestAssured.given().log().all()
//                .accept(MediaType.APPLICATION_JSON_VALUE)
//                .when().get("/start")
//                .then().log().all()
//                .statusCode(HttpStatus.OK.value())
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .body(containsString("positionsAndPieces"))
//                .body(containsString("whiteScore"))
//                .body(containsString("blackScore"))
//                .body(containsString("result"));
//    }
//
//    @Test
//    void restart() {
//        RestAssured.given().log().all()
//                .accept(MediaType.APPLICATION_JSON_VALUE)
//                .when().get("/restart")
//                .then().log().all()
//                .statusCode(HttpStatus.OK.value())
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .body(containsString("positionsAndPieces"))
//                .body(containsString("38"))
//                .body(containsString("EMPTY"));
//    }
//
//    @Test
//    void move() {
//        RestAssured.given().get("/start");
//        RestAssured.given().log().all()
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .body(new MoveDto("A2", "A3"))
//                .when().put("/move")
//                .then().log().all()
//                .statusCode(HttpStatus.OK.value())
//                .contentType("text/plain;charset=UTF-8")
//                .body(containsString("A3"));
//    }
//
//    @Test
//    @DisplayName("이동시킬 기물이 존재하지 않을 경우")
//    void noPiece() {
//        RestAssured.given().get("/start");
//        RestAssured.given().log().all()
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .body(new MoveDto("A3", "A4"))
//                .when().put("/move")
//                .then().log().all()
//                .statusCode(HttpStatus.BAD_REQUEST.value())
//                .body(containsString("해당 위치에 말이 존재하지 않습니다."));
//    }
//    @Test
//    void indexPage() {
//        RestAssured.given().log().all()
//                .accept(MediaType.APPLICATION_JSON_VALUE)
//                .when().get("/")
//                .then().log().all()
//                .statusCode(HttpStatus.OK.value());
//    }
//
//    @Test
//    void startGame() {
//        RestAssured.given().log().all()
//                .accept(MediaType.APPLICATION_JSON_VALUE)
//                .when().get("/start")
//                .then().log().all()
//                .statusCode(HttpStatus.CREATED.value())
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .body(containsString("positionsAndPieces"))
//                .body(containsString("whiteScore"))
//                .body(containsString("blackScore"))
//                .body(containsString("result"));
//    }
//
//    @Test
//    void restart() {
//        RestAssured.given().log().all()
//                .accept(MediaType.APPLICATION_JSON_VALUE)
//                .when().get("/restart")
//                .then().log().all()
//                .statusCode(HttpStatus.FOUND.value())
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .body(containsString("positionsAndPieces"))
//                .body(containsString("38"))
//                .body(containsString("EMPTY"));
//    }
//
//    @Test
//    void move() {
//        RestAssured.given().get("/start");
//        RestAssured.given().log().all()
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .body(new MoveDto("A2", "A3"))
//                .when().put("/move")
//                .then().log().all()
//                .statusCode(HttpStatus.ACCEPTED.value())
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .body(containsString("A3"));
//    }
//
//    @Test
//    @DisplayName("이동시킬 기물이 존재하지 않을 경우")
//    void noPiece() {
//        RestAssured.given().get("/start");
//        RestAssured.given().log().all()
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .body(new MoveDto("A3", "A4"))
//                .when().put("/move")
//                .then().log().all()
//                .statusCode(HttpStatus.BAD_REQUEST.value())
//                .body(containsString("해당 위치에 말이 존재하지 않습니다."));
//    }
//
//    @Test
//    void createGameRoom() {
//        RestAssured.given().log().all()
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .body(new GameRoomDto("조시네체스", "123"))
//                .when().post("/game")
//                .then().log().all()
//                .statusCode(HttpStatus.CREATED.value());
//    }
}
