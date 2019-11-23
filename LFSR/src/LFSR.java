
public class LFSR {
	
	static void displayBoolean(boolean entry) {
		if(entry) {
			System.out.print("1");
		}else{
			System.out.print("0");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean state[] = {false,false,true,false,false,true,true,false,true,false,false,true,true,true,false,false,false,true,true
				,false,false,false,true,false,true,false,true
				,true,true,true,true,false,true,false,true
				,true,false,true,true,false,true,true,true,true
				,false,true,false,false,false,false,false,true,true
				,false,false,true,false,true,false,false,true,true
				,true,false,false,true,true,false,true,true,false
				,true,false,false,true,true,true,false,false,false
				,false,true,false,true,false,true,true,false,false
				,false,false,false,true,true,false,false,true,false
				,true,true,false,false,true,true,true,false,true
				,true,true,false,true,true,true,true,false
				,false,false,true,true,false,true,true,false,false,true,false,false,true};

		
		System.out.println("");
		boolean temp;
		for(int j = 0 ; j < 256 ; j++) {
			temp = state[0];
			
			//displayBoolean(temp);
			
			displayBoolean(temp);
			
			temp = temp^state[1];
				
			temp = temp^state[47];
			
			temp = temp^state[94];
			
			
			
			for(int i = 0 ; i < state.length -1 ; i++) {
				state[i] = state[i+1];
			}
			
			state[(state.length) - 1 ] = temp;
			
		}
		
		
		
	}

}
