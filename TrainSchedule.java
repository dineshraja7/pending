package Train;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class TrainSchedule{
	public static void main(String[] args){
		ArrayList trainList = new ArrayList<Train>();
		 ArrayList stationList = new ArrayList<Station>();
		
		
		Train mumbaiExpress = new Train();
		Station chennai = new Station();
		Station Vijayawada = new Station();
		Station Pune = new Station();
		Station Wadi = new Station();
		Station Solapur = new Station();
		mumbaiExpress.initialize(123,"Mumbai Express","Chennai","Mumbai","06:00 AM","10:AM");
		chennai.initialize("MAA","Chennai",true);
		Vijayawada.initialize("VJD","Vijayawada",false);
		Pune.initialize("PUN","Pune",true);
		Wadi.initialize("WDI","Wadi",true);
		Solapur.initialize("SPR","Solapur",true);
		stationList.add(chennai);
		stationList.add(Vijayawada);
	    stationList.add(Pune);
		stationList.add(Wadi);
	    stationList.add(Solapur);
		mumbaiExpress.addStations(stationList);
		trainList.add(mumbaiExpress);
		stationList.clear();
	
		
		
		Train maduraiExpress = new Train();
		Station Madurai = new Station();
		Station Sattur = new Station();
		Station Thiruparangundram = new Station();
		maduraiExpress.initialize(456,"Madurai Express","Kovilpatti","Madurai","07:00 AM","10:29 AM");
		Madurai.initialize("IXM","Madurai",false);
		Sattur.initialize("STR","Sattur",true);
		Thiruparangundram.initialize("TPR","Thiruparangundram",false);
	    stationList.add(Madurai);
	    stationList.add(Sattur);
		stationList.add(Thiruparangundram);
		maduraiExpress.addStations(stationList);
		trainList.add(maduraiExpress);
	    stationList.clear();
	

		
		Train nagercoilExpress = new Train();
		Station Virudhunagar = new Station();
		Station Kovilpatti = new Station();
		Station Kayathar = new Station();
		Station AralvaiMozhi = new Station();
		nagercoilExpress.initialize(678,"Nagercoil Express","Virudhunagar","Nagercoil","08:00 AM","12:00 PM");
		Virudhunagar.initialize("VNR","Virudhunagar",false);
		Kovilpatti.initialize("CVP","Kovilpatti",true);
		Kayathar.initialize("KPY","Kayathar",false);
		AralvaiMozhi.initialize("AVL","AralvaiMozhi",false);
	    stationList.add(Virudhunagar);
		stationList.add(Kovilpatti);
		stationList.add(Kayathar);
		stationList.add(AralvaiMozhi);
		nagercoilExpress.addStations(stationList);
		trainList.add(nagercoilExpress);
        stationList.clear();
		

	
		
		
		Train vaigaiExpress = new Train();
		Station Kallupatti = new Station();
		Station Malamadai = new Station();
		Station Tiruchirapalli = new Station();
		vaigaiExpress.initialize(246,"Vaigai Express","Madurai","Trichy","09:00 AM","1:00 AM");
		Kallupatti.initialize("KPI","Kallupatti",true);
		Malamadai.initialize("MDI","Malamadai",false);
		Tiruchirapalli.initialize("TCY","Tiruchirapalli",false);
		stationList.add(Kallupatti);
		stationList.add(Malamadai);
		stationList.add(Tiruchirapalli);
		vaigaiExpress.addStations(stationList);
		trainList.add(vaigaiExpress);
		stationList.clear();
		
	
		
		
		System.out.println("Please enter  stationCode----->");
		Scanner trainStops = new Scanner(System.in);
		String cde = trainStops.next();
		
		
		for(int i=0;i<trainList.size();i++){
			Train currentTrain = (Train)trainList.get(i);
	        for( int j=0;j<currentTrain.stationList.size();j++){
				Station currentStation = (Station)currentTrain.stationList.get(j);
				if(currentStation.stationCode.equals(cde)&& (currentStation.isStop == true)){
					currentStation.print();
			}

	

				}
		}
			
	}
}


	
		
			
		
			


		
		
	
			
		
		
	

		
		