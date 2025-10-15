package Session12;

public class AccountMain 
{

	public static void main(String[] args) 
	{
		Account account=new Account();
		account.setAccno(1000);
		account.setAccno("Kaveri");
		account.setAmount(65000);
		System.out.println(account.getAccno());
		System.out.println(account.getName());
		System.out.println(account.getAmount());

	}

}
