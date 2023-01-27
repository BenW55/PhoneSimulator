import java.util.ArrayList;

public class apps {
	

	ArrayList<String> apps = new ArrayList<String>();
	
	public apps(String app1, String app2) 
	{
		apps.add(app1);
		apps.add(app2);
	}
		
	public void addApp(String add) 
	{
		apps.add(add);
		
	}
	
	public void printApps()
	{
		System.out.println(apps);
	}
	
}
