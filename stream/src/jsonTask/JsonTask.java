package jsonTask;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTask {
	
	public static String addRoot(String url) {
		return "/app" + url;
	} 
	public static void main(String[] args) {
		
//      "/news", "/game", "/brand", "/rank"
//      위 4개 경로를 모두 ArrayList에 추가하고,
//      경로 앞에 "/app"을 붙인 뒤
//      JSONArray로 변경하기
		
		ArrayList<String> urls = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"));
		
		JSONObject urlJSON = new JSONObject();
		JSONArray urlsJSON = new JSONArray();
		
		System.out.println(new JSONObject(new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"))));
		
		urls.stream().map(p -> "/app" + p).forEach(urlsJSON::put);
		urls.stream().map(JsonTask::addRoot).forEach(urlsJSON::put);
		
		System.out.println(urlsJSON);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
