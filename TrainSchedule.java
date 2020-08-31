package Train;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
public class TrainSchedule{
	public static void main(String[] args){
		ArrayList trainList = new ArrayList<Train>();
		 ArrayList stationList = new ArrayList<Station>();
		 HashSet<String> stationFacility = new HashSet<>();
		 
		
		
		Train mumbaiExpress = new Train();
		mumbaiExpress.initialize(123,"Mumbai Express","Chennai","Mumbai","06:00 AM","10:AM");
		
		
		
		Station chennai = new Station();
		stationFacility.add("ATM");
		stationFacility.add("Kids Playing Area");
		chennai.initialize("MAA","Chennai",true);
		chennai.addFacility(stationFacility);
		stationFacility.clear();
		stationList.add(chennai);
		
		
		Station vijayawada = new Station();
		stationFacility.add("Electronic Ticket counter");
		stationFacility.add("Restrooms");
		vijayawada.initialize("VJD","Vijayawada",false);
		vijayawada.addFacility(stationFacility);
		stationFacility.clear();
		stationList.add(vijayawada);
	
	
		Station pune = new Station();
		stationFacility.add("Free Wifi Unlimited");
		stationFacility.add("Mobile charging Stations");
		pune.initialize("PUN","Pune",true);
		pune.addFacility(stationFacility);
		stationFacility.clear();
		stationList.add(pune);
	
	
		Station wadi = new Station();
		stationFacility.add("Free Cloak Room");
		stationFacility.add("Secured Baggage counters");
		wadi.initialize("WDI","Wadi",true);
		wadi.addFacility(stationFacility);
		stationFacility.clear();
		stationList.add(wadi);
		
		
		Station solapur = new Station();
		stationFacility.add("AI based ticket counter");
		stationFacility.add("Queueless PNR checking machine");
		solapur.initialize("SPR","Solapur",true);
		solapur.addFacility(stationFacility);
	    stationFacility.clear();
	    stationList.add(solapur);
		
		
		mumbaiExpress.addStations(stationList);
		trainList.add(mumbaiExpress);
		stationList.clear();
	
		
		
		Train maduraiExpress = new Train();
		maduraiExpress.initialize(456,"Madurai Express","Kovilpatti","Madurai","07:00 AM","10:29 AM");
		
		Station madurai = new Station();
		stationFacility.add("Automated ticket machines");
		madurai.initialize("IXM","Madurai",false);
		madurai.addFacility(stationFacility);
		stationFacility.clear();
		stationList.add(madurai);
		
		
		Station sattur = new Station();
		stationFacility.add("Convenience Stores");
		sattur.initialize("STR","Sattur",true);
		sattur.addFacility(stationFacility);
		stationFacility.clear();
		stationList.add(sattur);
		
		
		
		Station thiruparangundram = new Station();
		stationFacility.add("Lost and Found centres");
		thiruparangundram.initialize("TPR","Thiruparangundram",false);
		thiruparangundram.addFacility(stationFacility);
		stationFacility.clear();
		stationList.add(thiruparangundram);
		
	 
	 

		maduraiExpress.addStations(stationList);
		trainList.add(maduraiExpress);
		stationList.clear();

	

		
		Train nagercoilExpress = new Train();
		nagercoilExpress.initialize(678,"Nagercoil Express","Virudhunagar","Nagercoil","08:00 AM","12:00 PM");
		
		Station virudhunagar = new Station();
		stationFacility.add("Arrival and Departure Boards Digitalized");
		virudhunagar.initialize("VNR","Virudhunagar",false);
		virudhunagar.addFacility(stationFacility);
		stationFacility.clear();
		stationList.add(virudhunagar);
		
		
		Station kovilpatti = new Station();
		stationFacility.add("Waiting rooms");
		kovilpatti.initialize("CVP","Kovilpatti",true);
		kovilpatti.addFacility(stationFacility);
		stationFacility.clear();
		stationList.add(kovilpatti);
		
		
		Station kayathar = new Station();
		stationFacility.add("Taxi Ranks");
		kayathar.initialize("KPY","Kayathar",false);
		kayathar.addFacility(stationFacility);
		stationFacility.clear();
		stationList.add(kayathar);
		
		
		Station aralvaiMozhi = new Station();
		stationFacility.add("Car Parking Paid ");
		aralvaiMozhi.initialize("AVL","AralvaiMozhi",false);
		aralvaiMozhi.addFacility(stationFacility);
		stationFacility.clear();
	    stationList.add(aralvaiMozhi);
		
		
		nagercoilExpress.addStations(stationList);
		trainList.add(nagercoilExpress);
		stationList.clear();
      
		

	
		
		
		Train vaigaiExpress = new Train();
		vaigaiExpress.initialize(246,"Vaigai Express","Madurai","Trichy","09:00 AM","1:00 AM");
		
		Station kallupatti = new Station();
		stationFacility.add("Passenger Lounge");
        kallupatti.initialize("KPI","Kallupatti",true);
		kallupatti.addFacility(stationFacility);
		stationFacility.clear();
		stationList.add(kallupatti);
		
		
		Station malamadai = new Station();
		stationFacility.add("Left luggage finding Squads");
		malamadai.initialize("MDI","Malamadai",false);
		malamadai.addFacility(stationFacility);
		stationFacility.clear();
		stationList.add(malamadai);
		
		
		Station tiruchirapalli = new Station();
		stationFacility.add("Tourist guide from Railway Department");
		tiruchirapalli.initialize("TCY","Tiruchirapalli",false);
		tiruchirapalli.addFacility(stationFacility);
		stationFacility.clear();
		stationList.add(tiruchirapalli);
		
		
		vaigaiExpress.addStations(stationList);
		trainList.add(vaigaiExpress);
		stationList.clear();
		
	
		
		System.out.println("Please enter your Destination-------->");
		Scanner destinationPoint = new Scanner(System.in);
		String dest = destinationPoint.next();
		
		
		
		System.out.println("Please enter  the facility of a station----->");
		Scanner trainStops = new Scanner(System.in);
		String cde = trainStops.nextLine();
		
		
		for(int i=0;i<trainList.size();i++){
			Train currentTrain = (Train)trainList.get(i);
			if(currentTrain.destination.equals(dest)){
				//currentTrain.print();
				
				
	        for( int j=0;j<currentTrain.stationList.size();j++){
				Station currentStation = (Station)currentTrain.stationList.get(j);
				
				
				
				
					 if(currentStation.stationFacility.contains(cde)){
					 System.out.println("The station which having this facility is as follows......");
					 currentStation.print();
					 currentTrain.print();
					 }

				}
			
			}
			
			else {
					System.out.println("The facility " + cde + " is not found in any  station on the route of train " + currentTrain.trainName);
					
				}
				
				
	    }
				
				
			
        }
	}



	
		
			
		
			


		
		
	
			
		
		
	

		
		
