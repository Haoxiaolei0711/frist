package TestServlet;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.sun.xml.internal.fastinfoset.sax.Properties;

@Component("user")
public class User {
	
	public void write(){
		System.out.println("你好吗");
	}
}
