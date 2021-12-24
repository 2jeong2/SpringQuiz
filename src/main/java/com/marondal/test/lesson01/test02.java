package com.marondal.test.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.Data;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lesson01/test02")
public class test02 {
	
	@RequestMapping("/1")
	public List<Map<String,Object>> movie(){
		List<Map<String, Object>> movieList = new ArrayList<>();
		
			Map<String,Object> movieMap1 = new HashMap<String,Object>();
			
			movieMap1.put("rate", 15);
			movieMap1.put("director", "봉준호");
			movieMap1.put("time", 131);
			movieMap1.put("title", "기생충");
			movieList.add(movieMap1);
			
			Map<String,Object> movieMap2 = new HashMap<>();
			
			movieMap2.put("rate", 0);
			movieMap2.put("director", "로베르토 베니니");
			movieMap2.put("time", 116);
			movieMap2.put("title", "인생은 아름다워");
			movieList.add(movieMap2);
			
			Map<String,Object> movieMap3 = new HashMap<>();
			
			movieMap3.put("rate", 12);
			movieMap3.put("director", "크리스토퍼 놀란");
			movieMap3.put("time", 147);
			movieMap3.put("title", "인셉션");
			movieList.add(movieMap3);
			
			Map<String,Object> movieMap4 = new HashMap<>();
			
			movieMap4.put("rate", 19);
			movieMap4.put("director", "윤종빈");
			movieMap4.put("time", 133);
			movieMap4.put("title", "범죄와의 전쟁: 나쁜놈들 전성시대");
			movieList.add(movieMap4);
			
			Map<String,Object> movieMap5 = new HashMap<>();
			
			
			movieMap5.put("rate", 15);
			movieMap5.put("director", "프린시스 로렌스");
			movieMap5.put("time", 137);
			movieMap5.put("title", "헝거게임");
			movieList.add(movieMap5);
			
			
		
		return movieList;
		
		
	}
	
	@RequestMapping("/2")
	
		public List<BoardContent> boardList(){
			List<BoardContent> boardList = new ArrayList<>();
		
			BoardContent content = new BoardContent();
			content.setTitle("안녕하세요 가입인사 드립니다.");
			content.setUser("hagulu");
			content.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
			boardList.add(content);
			
			BoardContent content2 = new BoardContent();
			content2.setTitle("헐.대박");
			content2.setUser("bada");
			content2.setContent("오늘 목요일이 었어... 금요일인줄");
			boardList.add(content2);
			
			BoardContent content3 = new BoardContent();
			content3.setTitle("오늘 데이트 한 이야기 해드릴게요.");
			content3.setUser("dulumary");
			content3.setContent(". . . .");
			boardList.add(content3);
			
			return boardList;
	}
	@RequestMapping("/3")
	public ResponseEntity<BoardContent> entity(){
		
		BoardContent content = new BoardContent();
		content.setTitle("안녕하세요 가입인사 드립니다.");
		content.setUser("hagulu");
		content.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		
		ResponseEntity<BoardContent> entity = new ResponseEntity<>(content, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
		
		
	}
			
			
			
		
		
		
		
		
	

	

}
