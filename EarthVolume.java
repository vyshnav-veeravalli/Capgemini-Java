public class EarthVolume{
	public static void main(String[] args){
		double radiusKm = 6378;
		double VolumeKm = (4.0/3.0)*Math.PI*Math.pow(radiusKm, 3);
		double VolumeMile = VolumeKm / Math.pow(1.6,3);
		System.out.println("The Volume of earth in cubic KiloMeter is " + VolumeKm + " and cubic miles is " + VolumeMile);
	}
}