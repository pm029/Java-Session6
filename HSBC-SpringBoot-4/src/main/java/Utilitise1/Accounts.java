package Utilitise1;

import org.springframework.stereotype.Service;

@Service
public class Accounts {

	public float tax(int salary) {
		float t=0;
		if (salary>=2000) {
			t=(float)salary*25/100;
		}else {
			if(salary>=1000) {
				t=(float)salary*15/100;
			}else {
				t=0;
			}			
	}
		return t;
}
	}


