package Train;
import java.util.*;
import java.util.ArrayList;
public class Station{
	String stationCode;
	String stationName;
	boolean isStop;
	 
	
	
	


public void initialize(String statcde, String stnname,boolean flg){
	this.stationCode = statcde;
	this.stationName = stnname;
	this.isStop = flg;

	
	}
	
public void print(){
	System.out.println("Your Station Code is --->"+stationCode);
	System.out.println("Your Station name is----->"+stationName);
	System.out.println("The train will---->"+isStop);
}


	
}
	
	
	
	

