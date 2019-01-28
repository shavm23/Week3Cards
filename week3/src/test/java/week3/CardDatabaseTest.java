package week3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CardDatabaseTest 
{
	@Test
	public void shouldsaveRecord()
	{
		IDatabase<Card> db = new CardDatabase();
		Card card = new Card(1,"Club");
		boolean success = db.save(card);
		assertTrue(success);
		
	}
	public void shouldRetrieveFirstRecord()
	{
		/**
		 * TODO:
		 * 
		 * Create an instance of a card database
		 * Retrieve the first record from the database
		 * assert that the object returned is not null
		 * assert that the suit of the object is the same one that as saved
		 * assert that the number of the card object
		 * is the same as the one that was saved
		 * 
		 */
	}

}
