
public class googleMaps {
	public static final double RADIUS = 3963.1676;
	private double latitude;
    private double longitude;
    public googleMaps(double lat, double longg) 
    {
    	latitude = lat;
    	longitude = longg;
    	
    }
    public double distanceFrom(googleMaps other) 
    {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);
        // apply the spherical law of cosines with a triangle composed of the
        // two locations and the north pole
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS;
    }
}
