package ex03;

public class Mail
{
	private String de, a, corps;
	private static int n = 0;
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

    public String toString()
    {
    	return getClass().getName() + id + " De : " + de + " A : " + a + " Corps : " + corps;
    }
}