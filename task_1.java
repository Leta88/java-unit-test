@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    boolean expected = true;
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Ошибка", expected, isAdult);
	// Напиши код здесь
}
