import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> itens = new ArrayList<>();
		
		itens.add("Maria");
		itens.add("Alex");
		itens.add("Joana");
		itens.add("Bob");
		itens.add("Anna");
		
//		itens.add(2, "Matheus");
		
//		System.out.println(itens.size());
		
//		itens.remove(1); 
//		itens.remove("Anna"); 

//		itens.removeIf(x -> x.charAt(0) == 'M'); //Remove atraves de um predicado.
		
//		System.out.println("Index of Bob " + itens.indexOf("Bob"));
//		System.out.println("Index of Marcos " + itens.indexOf("Marcos"));

		// percorrer array pelo for
//		for (String x : itens) {
//			System.out.println(x);
//		}
		
		// array forEach
		itens.forEach(iten->System.out.println(iten));
		
		System.out.println("----------------");
		System.out.println("Retorna lista que começa com a letra A:");
		List<String> result = itens.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		result.forEach(iten->System.out.println(iten));

		System.out.println("----------------");
		System.out.println("Retorna primeiro elemento que comeca com a letra A:");
		String name = itens.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

		
	}

}
