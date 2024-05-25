package day2_Patterns;
class CharPatterns 
{ 
	
	static void A(int i) {        
       
            for (int j = 0; j < 7; j++) {
                if ((j == 0 || j == 6) && (i > 0) || (i == 0 || i == 3) && (j > 0 && j < 6)) {
                    System.out.print("*");
                } else {
                	 System.out.print(" ");
                }
            }      
            System.out.print(" ");

    }
	
	
	static void B(int i) 
	{ 
		
	        for (int j = 0; j < 6; j++) {
	            if (j == 0 || (i == 0 || i == 2 || i == 4) && (j < 5) || j == 5 && (i > 0 && i < 4 && i != 2)) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	        
	} 
	
	 
	static void C(int i) 
	{ 
		
	         for (int j = 0; j < 6; j++) {
	             if (j == 0 || i == 0 || i == 6) {
	                 System.out.print("*");
	             } else {
	                 System.out.print(" ");
	             }
	         }
	         System.out.print(" ");
	} 
	
	 
	static void D(int i) 
	{ 
		
	        for (int j = 0; j < 6; j++) {
	            if ((j == 0 && (i > 0 && i < 5)) || ((i == 0 || i == 5) && (j < 4)) || (j == 5 && (i != 0 && i != 5))) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	} 
	
	
	static void E(int i) 
	{ 
		
		for (int j = 0; j < 6; j++) {
            if (j == 0 || i == 0 || i == 7/2 || i == 6) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
		 System.out.print(" ");
	} 
	
	
	static void F(int i) 
	{ 
		
		    for (int j = 0; j < 6; j++) {
		        if (j == 0 || i == 0 || (i == 2 && j < 5)) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	
	static void G(int i) 
	{ 
		
		    for (int j = 0; j < 7; j++) {
		        if ((j == 0 && (i > 1 && i < 5)) || 
		            ((i == 1 || i == 5) && ((j > 0 && j < 2) || j > 5)) || 
		            ((i == 0 || i == 6) && (j > 2 && j < 6)) || 
		            (i == 4 && j > 3) || 
		            (i == 7 && j > 5)) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	 
	static void H(int i) 
	{
		
	    for (int j = 0; j < 7; j++) {
	        if (j == 0 || j == 6 || i == 3) {
	            System.out.print("*");
	        } else {
	            System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	
	} 
	
	 
	static void I(int i) 
	{ 
		
		    for (int j = 0; j < 7; j++) {
		        if (i == 0 || i == 6 || j == 3) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	
	static void J(int i) 
	{ 
		
		    for (int j = 0; j < 7; j++) {
		        if ((j == 4 && i != 7) || (i == 6 && (j > 0 && j < 5)) || (i == 5 && j < 1)) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	
	static void K(int i) 
	{ 
		
		    for (int j = 0; j < 5; j++) {
		        if (j == 0 || i + j == 4 || i - j == 2) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	 
	static void L(int i) 
	{ 
		
		    for (int j = 0; j < 6; j++) {
		        if (j == 0 || i == 6) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	
	static void M(int i) 
	{ 
		
		    for (int j = 0; j < 7; j++) {
		        if (j == 0 || ((i - j == 0 || i + j == 6) && i < 4) || j == 6) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	
	static void N(int i) 
	{ 
		
		    for (int j = 0; j < 7; j++) {
		        if (j == 0 || i - j == 0 || j == 6) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	} 
	
	
	static void O(int i) 
	{ 
		
		    for (int j = 0; j < 7; j++) {
		    	if (i==0 || i==6 || j==0 || j==6) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	} 
	
	
	static void P(int i) 
	{ 
		
		    for (int j = 0; j < 6; j++) {
		        if ((j == 0 && i != 0) || 
		            ((i == 0 || i == 3) && j != 0 && j < 5) || 
		            ((i == 1 || i == 2) && (j == 5 || j == 6))) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	
	static void Q(int i) 
	{ 
		
		    for (int j = 0; j < 9; j++) {
		        if (((j == 0 || j == 8) && (i > 1 && i < 4)) || 
		            ((i == 0 || i == 5) && (j == 3 || j == 5)) || 
		            ((i == 1 || i == 4) && (j == 1 || j == 7)) || 
		            ((i - j == 0) && (i > 3 && i < 7))) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	
	static void R(int i) 
	{ 
		
		    for (int j = 0; j < 7; j++) {
		        if (j == 0 || ((i == 0 || i == 3) && (j < 4)) || ((i == 1 || i == 2) && (j > 4 && j != 6)) || (i - j == 0 && i > 3)) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	
	static void S(int i) 
	{ 
		
	        for (int j = 0; j < 7; j++) {
	            if (((i == 0 || i == 3 || i == 6) && (j != 0 && j != 6)) || 
	                (j == 0 && (i == 1 || i == 2 || i == 5)) || 
	                (j == 6 && (i == 1 || i == 4 || i == 5))) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.print(" ");
	
	} 
	
	 
	static void T(int i) 
	{ 
		
		    for (int j = 0; j < 7; j++) {
		        if (i == 0 || j == 3) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	 
	static void U(int i) 
	{ 
		
		    for (int j = 0; j < 7; j++) {
		        if ((j == 0 || j == 6) && (i != 6) || (i == 6 && j > 1 && j < 5)) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	
	static void V(int i) 
	{ 
		
		    for (int j = 0; j < 13; j++) {
		        if (i - j == 0 || i + j == 12) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	
	static void W(int i) 
	{ 
		
		    for (int j = 0; j < 26; j++) {
		        if (i - j == 0 || i + j == 12 || i + j == 24 || (i - j == -12)) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	
	static void X(int i) 
	{ 
		
		    for (int j = 0; j < 7; j++) {
		        if (i - j == 0 || i + j == 6) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	 
	static void Y(int i) 
	{ 
		
		    for (int j = 0; j < 7; j++) {
		        if (((i - j == 0 || i + j == 6) && i < 4) || (j == 3 && i > 3)) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print(" ");
	
	} 
	
	
	static void Z(int i) 
	{ 
		
	    for (int j = 0; j < 7; j++) {
	        if (i == 0 || i == 6 || i + j == 6) {
	            System.out.print("*");
	        } else {
	            System.out.print(" ");
	        }
	    }
	    System.out.print(" ");
	
	} 

	 
	static void printName(String name) {
		for (int i = 0; i < 7; i++) {
			for(int k = 0; k<name.length(); k++) {				
				char ch = name.charAt(k);
				switch(ch) {				
				    case 'A': A(i); break;
				    case 'B': B(i); break;
				    case 'C': C(i); break;
				    case 'D': D(i); break;
				    case 'E': E(i); break;
				    case 'F': F(i); break;
				    case 'G': G(i); break;
				    case 'H': H(i); break;
				    case 'I': I(i); break;
				    case 'J': J(i); break;
				    case 'K': K(i); break;
					case 'L': L(i); break;
				    case 'M': M(i); break;
				    case 'N': N(i); break;
				    case 'O': O(i); break;
				    case 'P': P(i); break;
				    case 'Q': Q(i); break;
				    case 'R': R(i); break;
				    case 'S': S(i); break;
				    case 'T': T(i); break;
				    case 'U': U(i); break;
				    case 'V': V(i); break;
				    case 'W': W(i); break;
				    case 'X': X(i); break;
				    case 'Y': Y(i); break;
				    case 'Z': Z(i); break;
					default : System.out.print("  ");				   
				}
			
			
			}
			System.out.println();
		}

	}
	


}


