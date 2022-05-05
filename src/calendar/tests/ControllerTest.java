package calendar.tests;


	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.AfterEach;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	import calendar.controller.Controller;

	class ControllerTest
	{
		private Controller testedController;

		@BeforeEach
		void setUp() throws Exception
		{
			this.testedController = new Controller();
		}

		@AfterEach
		void tearDown() throws Exception
		{
			this.testedController  = null;
		}

		@Test
		void testBuildPokedexText()
		{
			assertTrue(testedController != null, "Can't be null");
		}

		@Test
		void testGetPokemonData()
		{
			assertEquals("Description", testedController.toString(), "Words match");
		}
	}



