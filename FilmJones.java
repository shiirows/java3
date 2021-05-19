class FilmJones  { 
    
    public static void main(String[] args) {
    
        String film = "indiana jones";
		boolean vue = true;
		int date = 1989;
		double note = 8.2;
		
		String indiana = film + " qui est sortie en " + date + " avec une note de " + note;
		
		if (vue) {
			System.out.println("tu a vue le film " + indiana);
		} else{
            System.out.println("tu na pas vue le film " + indiana);

        }
}


}

