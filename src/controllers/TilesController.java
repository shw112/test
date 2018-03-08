package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 이전 수동으로 게시판 만들때 SubController들만 만들면 된다.
 * POJO 지원으로 기타 인터페이스나 추상클래스의 구현 상속 필요 없음.
 * (= 대충 만들어도 된다.)
 */

@Controller
public class TilesController {
	
	@RequestMapping("/tiles.do")
	private String excute() {
		return "tiles";
	}
}
