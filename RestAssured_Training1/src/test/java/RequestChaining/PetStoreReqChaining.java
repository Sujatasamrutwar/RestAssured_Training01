package RequestChaining;

import org.testng.annotations.Test;

public class PetStoreReqChaining {

	@Test(priority  = 1)
	
	public void createUser( ) {
		System.out.println("=============Create pet=============");
	}
	
   @Test(priority  = 2)
	
	public void getUser( ) {
		System.out.println("=============Get pet=============");
	}

   @Test(priority  = 3)

     public void UpdateUser( ) {
	System.out.println("=============Update pet=============");
    }

     @Test(priority  = 4)

    public void deleteUser( ) {
	System.out.println("=============Delete pet=============");
  }
}
