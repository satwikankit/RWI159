class GetterSetter 
{
	int id;
	String name;
	private void setName(String = n){
		name = n;
	}
	private int setId (int = i){
		id = i;
	}
	private String getName(){
		return name;
	}
	Private int getId(){
		return id;
	}



	public static void main(String[] args) 
	{
		GetterSetter Ankit = new GetterSetter();
		Ankit.setName("satwik")
			System.out.println(Ankit.getName());

	}
}
