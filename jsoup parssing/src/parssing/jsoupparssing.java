package parssing;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class jsoupparssing {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String articleURL = "http://www.ilbe.com/10292553017";
		Document doc = Jsoup.connect(articleURL).get();
		
		Elements ele = doc.select(".replyContent");
		String str = ele.text();
		
String arr[] = str.split(" ");
		
		for(int i =0; i<arr.length ; i++)
		{
		System.out.println(arr[i]);
		}
		
	
	}

}
