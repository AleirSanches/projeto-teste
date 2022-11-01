package empresa;

public class Account {
	
	private String name;
	private Double balance;
	
	public Account( String name, Double balance){
		this.name=name;
		
		if (balance >0) {
			this.balance=balance;
		}
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public Double getBalance() {
		return balance;
	}
	public void valorDeposito(Double valor) {
		if (valor>0) {
			balance+=valor;
		}
		else {
			System.out.println("Deposite um valor maior que R$ 0,00");
		}
     		
	}
    public void setBalance(Double balance) {
		this.balance = balance;
	}
	public void valorTranferido (Double valor, Account c2 ) {
    	if( valor>0) {
    		balance-=valor;
    		c2.balance+=valor;		
    	}
    	else {
    		System.out.println("O Valor da transferencia e igual a 0, não foi possivel finalizar");
    	}
    
    	
    
  
		
 
    }
    	
    
	
	
}
	


