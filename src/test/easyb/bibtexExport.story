import com.myssyt.bibtex.*
import com.myssyt.bibtex.domain.*

description "As a user I want to create Bibtex files so that I can use them in Latex"

scenario "Bibtex-tiedoston luonti onnistuu kun artikkeli on annettu", {
    given 'Artikkelin kentät on annettu', {
        author = "Spohrer, James C. and Soloway, Elliot"
        title = "Novice mistakes: are the folk wisdoms correct?"
        journal = "Commun. ACM"
        year = "2006"
    }

    when 'Lisätään artikkeli managerille', {
        artikkeli = new Article("1", author, title, journal, year, "a", "b", "c", "d", "e")
        manageri = new ReferenceManager()
        manageri.getReferences().add(artikkeli)
    }

    then 'Bibtex-tiedoston luonti onnistuu managerista', {
        manageri.exportReferences("testi.bib").shouldEqual "Exporting file succeeded"
    }
}