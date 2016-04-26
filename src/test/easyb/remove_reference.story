import com.myssyt.bibtex.*


description "As a user I can delete a reference from the system"

scenario "Artikkelin poistaminen onnistuu", {
    given 'Artikkeleita löytyy järjestelmästä', {
        bibtexkey = "artikkeli"
        bibtexkey2 = "artikkeli2"
        journal = "Commun. ACM"
        journal2 = "Commun. ACM222"
        title = "Novice mistakes: are the folk wisdoms correct?"
        title2 = "Novice mistakes: are the folk wisdoms correct?222"
        author = "Spohrer, James C. and Soloway, Elliot"
        author2 = "Spohrer, James C. and Soloway, Elliot222"
        year = "2006"
        year2 = "2007"
        manageri = new ViiteManageri()
        manageri.lisaaArtikkeli(bibtexkey, author, title, journal, year, null, null, null, null, null)
        manageri.lisaaArtikkeli(bibtexkey2, author2, title2, journal2, year2, null, null, null, null, null)
    }

    when 'Poistetaan artikkeli', {
        manageri.poistaViite(0)
    }

    then 'Artikkeleita on järjestelmässä yksi vähemmän ja juuri oikea artikkeli poistettiin', {
        manageri.getViitteet().size().shoudEqual 1
        artikkeli = manageri.getViitteet(0)
        artikkeli.getBibtexKey().shoudEqual "artikkeli2"
    }
}