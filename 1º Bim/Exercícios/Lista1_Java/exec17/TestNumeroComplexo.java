/* 17. (DESAFIO) Desenvolva uma classe que modele um objeto número complexo em
conformidade com o paradigma orientado a objeto. O objeto número complexo tem as
seguintes funcionalidades: inicialização do número, adição, subtração,
multiplicação, divisão e igualdade.
i. um número complexo possui a seguinte forma: parte real + parte imaginária
* i(a+bi) onde i é a raiz quadrada de -1;
ii. inicializar o número, recebe dois valores como argumentos para inicializar
os campos da classe (parte real e imaginária);
iii. obter o número, devolve o número complexo encapsulado usando a notação a + bi;
iv. verificar a igualdade, recebe uma outra instância da classe Número Complexo e
retorna true se os valores dos campos encapsulados forem iguais aos da instância
passada como argumento;
v. adicionar, recebe uma outra instância da classe Número Complexo e adiciona este
número complexo com o encapsulado usando a fórmula (a+bi)+(c+di) =
(a+c)+(b+d)i e devolve um novo Número Complexo como resposta;
vi.subtrair, recebe uma outra instância da classe Número Complexo e subtrai este
número complexo com o encapsulado usando a fórmula (a+bi)−(c+di) =
(a−c)+(b−d)i e devolve um novo Número Complexo como resposta;
vii. multiplicar, recebe uma outra instância da classe Número Complexo e multiplica este
número complexo com o encapsulado usando a fórmula (a+bi)∗(c+di) =
(ac−bd)+(ad+bc)i e devolve um novo Número Complexo como resposta;
viii. dividir, recebe uma outra instância da classe Número Complexo e divide este número
complexo com o encapsulado usando a fórmula (a+bi)/(c+di)=
(ac+bd)/(c²+d²) + ((bcad)/(c²+d²))i devolve um novo Número Complexo como resposta.*/

public class TestNumeroComplexo{
  public static void main(String[] args){
    NumeroComplexo nc1 = new NumeroComplexo(1, 2);
    System.out.println("Parte real: " + nc1.getParteReal());
    System.out.println("Parte imaginária: " + nc1.getParteImaginaria());
    System.out.println(nc1.numComplexo());
    System.out.println("Z1 = " + nc1.obterNumero());

    NumeroComplexo nc2 = new NumeroComplexo(3, 5);
    System.out.println("Z2 = " + nc2.obterNumero());

    System.out.println("Igualdade: " + nc1.verificaIgualdade(1, 2, 3, 5));
    System.out.println("Adição: Z1 + Z2 = " + nc1.adicaoNumeroComplexo(1, 2, 3, 5));
    System.out.println("Subtração: Z1 - Z2 = " + nc1.subtracaoNumeroComplexo(1, 2, 3, 5));
    System.out.println("Multiplicação: Z1 * Z2 = " + nc1.multiplicacaoNumeroComplexo(1, 2, 3, 5));
    System.out.println("Divisão: Z1 / Z2 = " + nc1.divisaoNumeroComplexo(1, 2, 3, 5));
  }
}
