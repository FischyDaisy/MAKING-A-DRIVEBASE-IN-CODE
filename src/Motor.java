
public class Motor 
{
	private String type;
	private double RPM;
	private double torque;
	public Motor()
	{
		setType("");
		setRPM(0.0);
		setTorque(0.0);
	}
	public Motor(String t, double r, double to)
	{
		setType(t);
		setRPM(r);
		setTorque(to);
	}
	public String getType() 
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	public double getRPM() 
	{
		return RPM;
	}
	public void setRPM(double rPM) 
	{
		RPM = rPM;
	}
	public double getTorque() 
	{
		return torque;
	}
	public void setTorque(double torque) {
		this.torque = torque;
	}
}
