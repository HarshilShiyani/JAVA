class Lab81{
	public static void main(String[] args) {

		double ans=0;
		try{	
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		
		
			ans=Math.pow(x,y);
			System.out.println("answer="+ans);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Enetr Only Integer Number"+e);
		}
		System.out.println("Programme Completed");
	}
}