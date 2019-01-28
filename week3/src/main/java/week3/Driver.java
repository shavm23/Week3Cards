package week3;

public class Driver{

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
		IDatabase<Card> db = new CardDatabase();
		Card card = new Card(1, "Club");
		if(db.save(card))
		{
			System.out.println("Card saved Successfully");
		}else 
		{ 
			System.out.println("Card cannot be saved");
		}

	}

}
