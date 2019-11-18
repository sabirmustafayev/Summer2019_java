package day53_InterfaceContinue;


public class DealerShip {
	public static void main(String[] args) {
		
		Tesla_Model3 obj = new Tesla_Model3();
			obj.start();
			obj.fly();
		
		Jeep_Wrangler obj1 = new Jeep_Wrangler();
			obj1.start();
			obj1.PumpGas();
		
		ToyotaHybird obj2 = new ToyotaHybird();
			obj2.PumpGas();
			obj2.Charge();
			
	}

}
