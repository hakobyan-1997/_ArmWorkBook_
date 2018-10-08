package concurrency.GasStationTest;

import java.util.Queue;
import java.util.Random;

import gasstation.Car.TypeFuel;

public class FuelBoy extends Thread{

	public static Gasstation station;
	
	@Override
	public void run() {
		while(true){
			for(int i=0; i<station.getColumns().size(); i++){
				Queue<Car> tmpCol=station.getColumns().get(i);
				Car car;
				//if first thread take from queue, next thread has to wait
				synchronized (tmpCol) {					
					if(tmpCol.isEmpty()){
						continue;
					}
					car=tmpCol.poll();
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println("Loading was interrupted");
				}
				int randAmount=new Random().nextInt(31)+10;
				TypeFuel randTypeFuel=TypeFuel.values()[new Random().nextInt(3)];
				car.setAmount(randAmount);
				car.setFuel(randTypeFuel);
				car.setNumColumn(i+1);
				System.out.println("FuelBoy load "+ randAmount + " liters "+ randTypeFuel.toString()+" at column "+ (i+1));
				station.requireToPay(car);
			}
		}
	}
}
