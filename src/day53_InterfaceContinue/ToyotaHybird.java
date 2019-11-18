package day53_InterfaceContinue;

public class ToyotaHybird implements Cars, ElectricVehicles, GasVehicles {

	@Override
	public void PumpGas() {
		System.out.println("Pumping Gas");
		
	}

	@Override
	public void Charge() {
		System.out.println("Charging");
		
	}

	@Override
	public void SelfDrive() {
		System.out.println("Self Driving mode");
	
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SelfParking() {
		System.out.println("Self Parking");
		
	}

	@Override
	public void fly() {
		System.out.println("Toyota is flying");
		
	}

}
