
public class trans_unit {

	  private final String id;
	  private final String source;
	  private final String target;

	  public trans_unit(String identification, String s, String t){
		    id = identification;
		    source    = s;
		    target     = t;
		  }

			public String toString() {
		  return "ID: " + id + ", Source: " + source + ", Target:" + target;
	  }

}
