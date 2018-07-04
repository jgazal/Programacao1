public class TestePessoa{
	public static void main(String[] args){
		Pessoa p1 = null;
		try{
			p1 = new Pessoa("João",18,80.0,1.83);
			p1.setIdade(-18);
		}catch(Exception e){
			System.out.println("erro ao criar pessoa:"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Nome:"+p1.getNome());	
		System.out.println("Idade:"+p1.getIdade());
	}
}