import com.myssyt.bibtex.*
import com.myssyt.bibtex.domain.*


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
        manageri = new ReferenceManager()
        manageri.addArticle(bibtexkey, author, title, journal, year, null, null, null, null, null)
        manageri.addArticle(bibtexkey2, author2, title2, journal2, year2, null, null, null, null, null)
    }

    when 'Poistetaan artikkeli', {
        manageri.removeReference(0)
    }

    then 'Artikkeleita on järjestelmässä yksi vähemmän ja juuri oikea artikkeli poistettiin', {
        manageri.getReferences().size().shouldEqual 1
        artikkeli = manageri.getReferences().get(0)
        artikkeli.getBibtexKey().shouldEqual "artikkeli2"
    }
}