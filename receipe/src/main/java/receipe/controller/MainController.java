package receipe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@Tag(name = "테스트 API", description ="테스 API입니다.")
public class MainController {
	
	 @GetMapping("/main")
	 @Operation(summary = "테스트", description = "스웨거 테스트 입니.")
	 public void mainTest() {

	 }

}
