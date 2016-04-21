import com.myssyt.bibtex.*

description "As a user I want to create Bibtex files so that I can use them in Latex"

scenario "Bibtex-tiedoston luonti onnistuu kun artikkeli on annettu", {
    given 'Pakolliset artikkelin kentät on annettu', {
        title = "Novice mistakes: are the folk wisdoms correct?"
        author = "Spohrer, James C. and Soloway, Elliot"
        journal = "Commun. ACM"
        year = "2006"
    }

    when 'Lisätään artikkeli managerille', {
        artikkeli = new Artikkeli("1", author, title, journal, year, "a", "b", "c", "d", "e")
        manageri = new ViiteManageri();
        manageri.getViitteet().add(artikkeli)
    }

    then 'Bibtex-tiedoston luonti onnistuu managerista', {
        manageri.exportViitteet("testi.bib").shouldEqual "Tiedoston exporttaus onnistui"
    }
}