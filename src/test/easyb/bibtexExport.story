import com.myssyt.bibtex.*

description "As a user I want to create Bibtex files so that I can use them in Latex"

scenario "Bibtex-tiedoston luonti onnistuu kun artikkeli on annettu", {
    given 'Pakolliset artikkelin kentät on annettu', {
        journal = "Commun. ACM"
        title = "Novice mistakes: are the folk wisdoms correct?"
        author = "Spohrer, James C. and Soloway, Elliot"
        publisher = "Consortium for Computing Sciences in Colleges"
        year = 2006
    }

    when 'Lisätään artikkeli managerille', {
        artikkeli = new Artikkeli(null, author, title, journal, year, null, null, null, null, null)
        manageri = new ViiteManageri();
        manageri.lisaaArtikkeli(artikkeli);
    }

    then 'Bibtex-tiedoston luonti onnistuu managerista', {
        String viesti = manageri.exportViitteet("testi.bib");
        assertEquals("Tiedoston exporttaus onnistui", viesti);
    }
}