public class TestBouquet {
	public static void main( String[] args) {
		Fleur rose = new Fleur("rose",2.6);
		Fleur tulipe = new Fleur("tulipe",0.4);
		Fleur oeillet = new Fleur("oeillet",1.8);
		
		System.out.println(rose);
		System.out.println(tulipe);
		System.out.println(oeillet);
		
		
		LotFleurs lotroses = new LotFleurs(rose,5);
		LotFleurs lottulipes = new LotFleurs(tulipe,7);
		LotFleurs lotoeillets = new LotFleurs(oeillet,3);
		
		Bouquet b = new Bouquet(lotroses, lottulipes, lotoeillets);
		double prixb = b.prix();
		System.out.println(b+" : "+prixb+" euros");
		
		Stock magasin = new Stock(rose,tulipe,oeillet);
		System.out.println(magasin);
		magasin.ajouteRose(100);
		magasin.ajouteTulipe(150);
		magasin.ajouteOeillet(200);
		System.out.println(magasin);
		System.out.println(magasin.valeurStock());
		boolean orderBouquet = magasin.bouquetFaisable(b);
		System.out.println(orderBouquet);
	}
}
