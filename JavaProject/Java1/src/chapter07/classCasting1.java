package chapter07;

public class classCasting1 {

	public static void main(String[] args) {
		androidPhone adp = new androidPhone("010-1111-2222");
		
		inheritance ih = new androidPhone("11");
		
		inheritance p = new iPhone("22");
		
		inheritance phone1 = adp;
		
		inheritance ih1 = (inheritance)adp;
		inheritance ih2 = adp; //하위타입의 참조변수를 상위타입으로 변경은 생략 가능
		
		androidPhone ih3 = (androidPhone) ih;
		
		iPhone i = null;
		androidPhone a = null;
		if(p instanceof iPhone) {
			
			i = (iPhone)p;
			
			i.call();
		}else if(p instanceof androidPhone){
			a = (androidPhone)ih;
			a.call();
		}
		//androidPhone ih4 = (androidPhone) p; //new IPhone("222");
	}
}
