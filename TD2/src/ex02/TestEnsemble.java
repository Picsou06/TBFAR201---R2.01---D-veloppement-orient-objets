package ex02;

public class TestEnsemble {
	public static void main(String[] args) {
		EnsembleEntierBorne ensemble1 = new EnsembleEntierBorne(20);
		EnsembleEntierBorne ensemble2 = new EnsembleEntierBorne(15);
		
		ensemble1.add(5);
		ensemble1.add(7);
		ensemble1.add(3);
		
		ensemble2.add(7);
		ensemble2.add(5);
		ensemble2.add(3);
		ensemble2.remove(3);
		
		System.out.println(ensemble1.toString());
		System.out.println(ensemble2.toString());
		
		ensemble2.add(12);
		System.out.println(ensemble1.intersect(ensemble2));
		System.out.println(ensemble2.doesContain(12));
		
		int maxim = 100;
        EnsembleEntierBorne premiers = new EnsembleEntierBorne(maxim);
        
        for (int i = 2; i <= maxim; i++) {
            premiers.add(i);
        }
  
        for (int i = 2; i <= maxim; i++) {
            if (premiers.doesContain(i)) {
                for (int j = 2 * i; j <= maxim; j += i) {
                    premiers.remove(j);
                }
            }
        }
        
        System.out.println("Les nombres premiers jusqu'à " + maxim + " sont : " + premiers);
	}
}