# WheatherLady_B

Stručný popis systému V rámci projektu by měl být vytvořen systém, který bude shromažďovat údaje z jedné nebo nejlépe dvou/tří meteorologických služeb (nebo používat soubory) a poskytovat průměrné (výsledkem by měla být daná hodnota počasí vypočtená jako aritmetický průměr výsledků vrácených každou službou) hodnoty vypočtené na základě vrácených odpovědí.

Hlavní funkce systému Stahování dat o počasí z příslušných webových služeb (nebo souborů na lokálním disku) Stažená data by se měla ukládat do databáze Aplikace by měla používat datum a místo města pro získání průměrných hodnot Průměrné výsledky by se měly ukládat do databáze Technologie Konzolová aplikace JDBC nebo Hibernate Doménová logika rozdělená do vrstev, např. DAO, Service Nástroje pro testování jednotek Volitelně:

Http klient, např. HttpClient, OkHttp Prezentační vrstva aplikace založená na vzoru, např. MVC/MVP Nástroj pro serializaci/deserializaci dat JSON, např. Gson, Jackson framework pro vstřikování závislostí, např. Guice Frontend založený na JavaFX Funkce Uživatelské rozhraní V rámci konzolového/grafického zobrazení by měl mít uživatel možnost vybrat jednu z následujících možností:

přidání konkrétních míst do databáze zobrazení aktuálně přidaných míst stažení hodnot počasí Přidání místa Uživatel by měl mít možnost přidat místo do databáze zadáním následujících hodnot:

Kromě toho by měl uživatel v rámci úkolu zajistit odpovídající validaci:

id - nepovinné: UUID formát zeměpisné délky a šířky podle zeměpisných hodnot (zeměpisná šířka: -90 -> S, 90 -> N, zeměpisná délka: -180 -> W, 180 -> E) název města - nesmí být prázdný region - nepovinné: může být nulový název země - nesmí být prázdný Pokud jsou zadány nesprávné údaje, měl by být uživatel upozorněn prostřednictvím příslušné zprávy.

Zobrazení dostupných míst Výběrem možnosti v nabídce by měl mít uživatel možnost zobrazit všechna místa zadaná do databáze.

Stahování údajů o počasí Stahování údajů o počasí z externích služeb V rámci této možnosti by měl mít uživatel možnost stahovat údaje např. z následujících systémů:

https://openweathermap.org/api https://developer.accuweather.com/apis https://weatherstack.com/documentation Podporované parametry Uživatel by měl mít možnost načíst následující hodnoty:

teplota tlak vlhkost směr a rychlost větru Hodnoty převzaté z externích webových stránek by měly být zprůměrovány a dodatečně uloženy do databáze, než se vrátí uživateli.

Dostupné konfigurace stahování Uživatel může prostřednictvím aplikace zadat následující hodnoty:

DATUM V žádosti lze uvést datum, kdy má být počasí zkontrolováno. Pokud uživatel nezadá datum v dohodnutém formátu, má se zkontrolovat počasí na zítřek.

LOKALITA V požadavku lze uvést lokalitu, pro kterou mají být hodnoty vráceny. Místo by mělo být možné sdělit jako název města nebo zeměpisnou souřadnici. Před použitím by měla být poloha uložena v databázi.

Volitelné funkce Upravit umístění V rámci nové možnosti nabídky by měl mít uživatel možnost upravovat aktuálně přidaná umístění. Součástí editace by mělo být také ověření platnosti.

Vyhledávání umístění Uživatel by měl mít možnost zobrazit informace o konkrétním umístění jeho vyhledáním, např. podle názvu.

Statistické údaje Uživatel by měl mít možnost zobrazit statistické údaje o vybraných hodnotách počasí z určitého časového období, např. měsíce, roku. Data pro tento účel by měla být stahována přímo z databáze.

Zápis/čtení dat Uživatel by měl mít možnost uložit aktuálně shromážděná data do souboru v libovolném formátu a poté je obnovit uložením přímo do databáze.

Unit testy Implementované funkce by měly být pokryty unit testy v souladu s běžně používanými metodikami a postupy.

POZNÁMKA:: Upozorňujeme, že s největší pravděpodobností nebude možné napsat testy pro všechny třídy, protože témata související s mockingem ještě nebyla pokryta.

Další požadavky Program by měl splňovat následující kritéria:

funkčnost kvalita kódu (přehlednost, udržovatelnost, struktura) použití nejnovějších technologií (alespoň nejnovější stabilní verze JDK, nejnovější stabilní verze knihoven) spolehlivost uživatelského prostředí Úkol je formulován velmi obecně účelově. Pokud něco není zadáno, lze to implementovat způsobem, který studentovi vyhovuje. Nejsou preferována jiná řešení nebo technologie než ty, které jsou uvedeny.





