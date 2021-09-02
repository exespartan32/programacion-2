package semana_1;

import java.util.ArrayList;

public class CBContainer {
	String name;
	ArrayList<ContactBook> cbContainer;
	
	public CBContainer(String name) {
		this.name = name;
		cbContainer = new ArrayList<ContactBook>();
	}
	
	public void addContactBook(ContactBook miCB) {
		cbContainer.add(miCB);
	}
	
	public String toString() {
		String tmp_Str = "";
		for(int i=0;i<cbContainer.size();i++) {
			tmp_Str = tmp_Str + cbContainer.get(i).toString("&%&");
		}
		return tmp_Str;		
	}
	
	public String toString(String sep) {
		String tmp_Str = "";
		for(int i=0;i<cbContainer.size();i++) {
			//-----------------------------
			if(i==this.cbContainer.size()-1) {
				tmp_Str = tmp_Str + this.cbContainer.get(i).toString("&%&");
			}else {
				tmp_Str = tmp_Str + this.cbContainer.get(i).toString("&%&")+sep;
			}
			//-----------------------------
		}		
		return tmp_Str;		
	}	
}
