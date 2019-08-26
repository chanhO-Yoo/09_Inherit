package kh.java.inherit.product.before.run;

import java.util.Date;

import kh.java.inherit.product.before.model.vo.Desktop;
import kh.java.inherit.product.before.model.vo.SmartPhone;
import kh.java.inherit.product.before.model.vo.Television;

public class Run {

	public static void main(String[] args) {
		//desktop 객체
		Desktop d = new Desktop("삼성", "ss-01234", "삼성 데스크탑", 2000000, new Date(), "windows7", "모니터", "키보드", "마우스");

		//smartphone 객체
		SmartPhone s = new SmartPhone("애플", "apple-01234", "iphoneXs", 1000000, new Date(), "ios13", "skt");
		
		//television 객체
		Television t = new Television("LG", "LG-01234", "LG Television", 1500000, new Date(), "FHD", 50);
				
		//출력
		d.printInfo();
		s.printInfo();
		t.printInfo();
	}

}
