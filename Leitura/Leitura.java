package Leitura;

public class Leitura {
	public static void main(String[] args)  {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro","M", 22);
		p[1] = new Pessoa("Maria", "F", 25);
		
		l[0] = new Livro("Diário de um Banana","Jeff Kinney", 300, p[0]);
		l[1] = new Livro("Odisseia", "Homero", 450, p[1]);
		l[2] = new Livro("Harry Potter", "J. K. Rowling", 500, p[0]);
		
		l[0].abrir();
		l[0].folear(250);
		l[1].abrir();
		l[1].folear(100);
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
	}
}
