package org.generation;

public class UserProfileTest {

	public static void main(String[] args) {
		
		UserProfile userProfile = new UserProfile();
		
		boolean isValid = userProfile.isValidEmail(null);
		System.out.println("El valor null es valido?" +isValid);
		
		isValid = userProfile.isValidEmail("myemail_gmail_com");
		System.out.println("El valor 'myemail_gmail_com' es válido? " + isValid); // false 
		
		isValid = userProfile.isValidEmail("myemail@gmail.com");
		System.out.println("El valor 'myemail@gmail.com' es válido? " + isValid); // true

		
		//==============================
		
		String nombreValido = userProfile.nombreValido("            osWalDo  ");
        System.out.println("El nombre 'osWalDo ' bien es: " + nombreValido); 
	
        //=============================
        userProfile.logError("Tengo hambre y ya no estoy pensando");
        
        
        
	
	}
	

}
