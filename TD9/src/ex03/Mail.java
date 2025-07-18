package ex03;

public class Mail
{
	private String de, a, corps;
	private static int n = 1; // C'est un blasphème de commencer à 0 pour un ID Madame
	private int id;

	public Mail()
    {
    	this.de = "INDETERMINE";
    	this.a = "INDETERMINE";
    	this.corps = "INDETERMINE";
    	this.id = n++;
	}

    public Mail(String de, String a, String corps)
    {
    	this.de = de;
    	this.a = a;
    	this.corps = corps;
    	this.id = n++;
    }

	@Override
    public String toString()
    {
		StringBuilder sb = new StringBuilder();
		sb.append("Mail ")
				.append(id)
				.append(" de : ")
				.append(de)
				.append(" a : ")
				.append(a)
				.append(" avec le corps : ")
				.append(corps);
		return sb.toString();
    }
}