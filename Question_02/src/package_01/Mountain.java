package package_01;

class Mountain {
	  static String name = "Himalaya";
	  static Mountain getMountain() {
	    System.out.println("Getting Name ");
	    return null;
	  }
	  public static void main(String[ ] args) {
	    System.out.println( getMountain().name );
	    
	    Mountain a = getMountain();
	    
	    System.out.println(a.getMountain());
	    
	  }
	}

