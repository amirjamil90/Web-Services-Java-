import pack.*;
class MyClient
{
	public static void main(String s[])	
	{
		try
		{
			String wsdurl="http://localhost:7001/myServiceApp/Adder?WSDL";
			Adder service=new Adder_Impl(wsdurl);
			AdderPort port=service.getAdderPort();
			System.out.println("invoking add method of web service");
			int result=port.add(25,88);
			System.out.println("sum of 25 and 88 = "+result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

