import java.util.*;
class Bus
{
	String sourcePlace;
	String destinationPlace;
	int charge;
	Bus(String sourcePlace,String destinationPlace,int charge) 
	{
		this.sourcePlace=sourcePlace;
		this.destinationPlace=destinationPlace;
		this.charge=charge;
	}
}

class Ticket
{
	ArrayList<Bus> buslist=new ArrayList<Bus>();
	void addTicket(String sourcePlace,String destinationPlace,int charge)
	{
		Bus b=new Bus(sourcePlace,destinationPlace,charge);
		buslist.add(b);
	}
	ArrayList<String> getAllCity()
	{
		TreeSet<String> cts=new TreeSet<String>();
		Iterator<Bus> it=buslist.iterator();
		while(it.hasNext())
		{
			Bus b1=it.next();
			cts.add(b1.sourcePlace);
			cts.add(b1.destinationPlace);
		}
		return new ArrayList(cts);
	}
	ArrayList<String> getDestination(String sourcePlace)
	{
		TreeSet<String> cts=new TreeSet<String>();
		Iterator<Bus> it=buslist.iterator();
		while(it.hasNext())
		{
			Bus b1=it.next();
			if(b1.sourcePlace.equals(sourcePlace))
				cts.add(b1.destinationPlace);
		}
		return new ArrayList(cts);
	}
}

public class BusTicket_Code
{
	public static void main(String[] args) 
	{
		Ticket obj=new Ticket();
		obj.addTicket("Delhi", "Noida", 100);
		obj.addTicket("Noida", "Mathura", 150);
		obj.addTicket("Noida", "Sagar", 500);
		
		List cities=obj.getAllCity();
		List dcities=obj.getDestination("Noida");
		System.out.println(cities);
		System.out.println(dcities);

	}
}