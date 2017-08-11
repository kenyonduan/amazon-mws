
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LanguageSWVG的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageSWVG">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="adygei"/>
 *     &lt;enumeration value="afrikaans"/>
 *     &lt;enumeration value="albanian"/>
 *     &lt;enumeration value="alsatian"/>
 *     &lt;enumeration value="amharic"/>
 *     &lt;enumeration value="arabic"/>
 *     &lt;enumeration value="armenian"/>
 *     &lt;enumeration value="assamese"/>
 *     &lt;enumeration value="bambara"/>
 *     &lt;enumeration value="basque"/>
 *     &lt;enumeration value="bengali"/>
 *     &lt;enumeration value="berber"/>
 *     &lt;enumeration value="breton"/>
 *     &lt;enumeration value="bulgarian"/>
 *     &lt;enumeration value="buryat"/>
 *     &lt;enumeration value="cantonese_chinese"/>
 *     &lt;enumeration value="castillian"/>
 *     &lt;enumeration value="catalan"/>
 *     &lt;enumeration value="cayuga"/>
 *     &lt;enumeration value="cheyenne"/>
 *     &lt;enumeration value="chinese"/>
 *     &lt;enumeration value="classical_newari"/>
 *     &lt;enumeration value="cornish"/>
 *     &lt;enumeration value="corsican"/>
 *     &lt;enumeration value="creole"/>
 *     &lt;enumeration value="crimean_tatar"/>
 *     &lt;enumeration value="croatian"/>
 *     &lt;enumeration value="czech"/>
 *     &lt;enumeration value="danish"/>
 *     &lt;enumeration value="dargwa"/>
 *     &lt;enumeration value="dutch"/>
 *     &lt;enumeration value="english"/>
 *     &lt;enumeration value="esperanto"/>
 *     &lt;enumeration value="estonian"/>
 *     &lt;enumeration value="farsi"/>
 *     &lt;enumeration value="filipino"/>
 *     &lt;enumeration value="finnish"/>
 *     &lt;enumeration value="flemish"/>
 *     &lt;enumeration value="french"/>
 *     &lt;enumeration value="french_canadian"/>
 *     &lt;enumeration value="georgian"/>
 *     &lt;enumeration value="german"/>
 *     &lt;enumeration value="gibberish"/>
 *     &lt;enumeration value="greek"/>
 *     &lt;enumeration value="gujarati"/>
 *     &lt;enumeration value="gullah"/>
 *     &lt;enumeration value="hausa"/>
 *     &lt;enumeration value="hawaiian"/>
 *     &lt;enumeration value="hebrew"/>
 *     &lt;enumeration value="hindi"/>
 *     &lt;enumeration value="hmong"/>
 *     &lt;enumeration value="hungarian"/>
 *     &lt;enumeration value="icelandic"/>
 *     &lt;enumeration value="indo_european"/>
 *     &lt;enumeration value="indonesian"/>
 *     &lt;enumeration value="ingush"/>
 *     &lt;enumeration value="inuktitun"/>
 *     &lt;enumeration value="inuktitut"/>
 *     &lt;enumeration value="inupiaq"/>
 *     &lt;enumeration value="irish"/>
 *     &lt;enumeration value="italian"/>
 *     &lt;enumeration value="japanese"/>
 *     &lt;enumeration value="kalaallisut"/>
 *     &lt;enumeration value="kalmyk"/>
 *     &lt;enumeration value="karachay_balkar"/>
 *     &lt;enumeration value="kashubian"/>
 *     &lt;enumeration value="kazakh"/>
 *     &lt;enumeration value="khmer"/>
 *     &lt;enumeration value="klingon"/>
 *     &lt;enumeration value="korean"/>
 *     &lt;enumeration value="kurdish"/>
 *     &lt;enumeration value="ladino"/>
 *     &lt;enumeration value="lao"/>
 *     &lt;enumeration value="lapp"/>
 *     &lt;enumeration value="latin"/>
 *     &lt;enumeration value="lithuanian"/>
 *     &lt;enumeration value="lojban"/>
 *     &lt;enumeration value="lower_sorbian"/>
 *     &lt;enumeration value="macedonian"/>
 *     &lt;enumeration value="malagasy"/>
 *     &lt;enumeration value="malay"/>
 *     &lt;enumeration value="malayalam"/>
 *     &lt;enumeration value="maltese"/>
 *     &lt;enumeration value="mandarin_chinese"/>
 *     &lt;enumeration value="maori"/>
 *     &lt;enumeration value="mende"/>
 *     &lt;enumeration value="middle_english"/>
 *     &lt;enumeration value="mirandese"/>
 *     &lt;enumeration value="moksha"/>
 *     &lt;enumeration value="mongo"/>
 *     &lt;enumeration value="mongolian"/>
 *     &lt;enumeration value="multilingual"/>
 *     &lt;enumeration value="navaho"/>
 *     &lt;enumeration value="nogai"/>
 *     &lt;enumeration value="norwegian"/>
 *     &lt;enumeration value="old_english"/>
 *     &lt;enumeration value="persian"/>
 *     &lt;enumeration value="pig_latin"/>
 *     &lt;enumeration value="polish"/>
 *     &lt;enumeration value="portuguese"/>
 *     &lt;enumeration value="romance"/>
 *     &lt;enumeration value="romanian"/>
 *     &lt;enumeration value="romany"/>
 *     &lt;enumeration value="russian"/>
 *     &lt;enumeration value="samaritan"/>
 *     &lt;enumeration value="sanskrit"/>
 *     &lt;enumeration value="serbian"/>
 *     &lt;enumeration value="serbo-croatian"/>
 *     &lt;enumeration value="sichuan_yi"/>
 *     &lt;enumeration value="sicilian"/>
 *     &lt;enumeration value="sign_language"/>
 *     &lt;enumeration value="slavic"/>
 *     &lt;enumeration value="slovak"/>
 *     &lt;enumeration value="slovene"/>
 *     &lt;enumeration value="somali"/>
 *     &lt;enumeration value="spanish"/>
 *     &lt;enumeration value="sumerian"/>
 *     &lt;enumeration value="swahili"/>
 *     &lt;enumeration value="swedish"/>
 *     &lt;enumeration value="swiss_german"/>
 *     &lt;enumeration value="tagalog"/>
 *     &lt;enumeration value="taiwanese_chinese"/>
 *     &lt;enumeration value="tamil"/>
 *     &lt;enumeration value="thai"/>
 *     &lt;enumeration value="tibetan"/>
 *     &lt;enumeration value="turkish"/>
 *     &lt;enumeration value="udmurt"/>
 *     &lt;enumeration value="ukrainian"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="urdu"/>
 *     &lt;enumeration value="vietnamese"/>
 *     &lt;enumeration value="welsh"/>
 *     &lt;enumeration value="wolof"/>
 *     &lt;enumeration value="xhosa"/>
 *     &lt;enumeration value="yiddish"/>
 *     &lt;enumeration value="zulu"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LanguageSWVG")
@XmlEnum
public enum LanguageSWVG {

    @XmlEnumValue("adygei")
    ADYGEI("adygei"),
    @XmlEnumValue("afrikaans")
    AFRIKAANS("afrikaans"),
    @XmlEnumValue("albanian")
    ALBANIAN("albanian"),
    @XmlEnumValue("alsatian")
    ALSATIAN("alsatian"),
    @XmlEnumValue("amharic")
    AMHARIC("amharic"),
    @XmlEnumValue("arabic")
    ARABIC("arabic"),
    @XmlEnumValue("armenian")
    ARMENIAN("armenian"),
    @XmlEnumValue("assamese")
    ASSAMESE("assamese"),
    @XmlEnumValue("bambara")
    BAMBARA("bambara"),
    @XmlEnumValue("basque")
    BASQUE("basque"),
    @XmlEnumValue("bengali")
    BENGALI("bengali"),
    @XmlEnumValue("berber")
    BERBER("berber"),
    @XmlEnumValue("breton")
    BRETON("breton"),
    @XmlEnumValue("bulgarian")
    BULGARIAN("bulgarian"),
    @XmlEnumValue("buryat")
    BURYAT("buryat"),
    @XmlEnumValue("cantonese_chinese")
    CANTONESE_CHINESE("cantonese_chinese"),
    @XmlEnumValue("castillian")
    CASTILLIAN("castillian"),
    @XmlEnumValue("catalan")
    CATALAN("catalan"),
    @XmlEnumValue("cayuga")
    CAYUGA("cayuga"),
    @XmlEnumValue("cheyenne")
    CHEYENNE("cheyenne"),
    @XmlEnumValue("chinese")
    CHINESE("chinese"),
    @XmlEnumValue("classical_newari")
    CLASSICAL_NEWARI("classical_newari"),
    @XmlEnumValue("cornish")
    CORNISH("cornish"),
    @XmlEnumValue("corsican")
    CORSICAN("corsican"),
    @XmlEnumValue("creole")
    CREOLE("creole"),
    @XmlEnumValue("crimean_tatar")
    CRIMEAN_TATAR("crimean_tatar"),
    @XmlEnumValue("croatian")
    CROATIAN("croatian"),
    @XmlEnumValue("czech")
    CZECH("czech"),
    @XmlEnumValue("danish")
    DANISH("danish"),
    @XmlEnumValue("dargwa")
    DARGWA("dargwa"),
    @XmlEnumValue("dutch")
    DUTCH("dutch"),
    @XmlEnumValue("english")
    ENGLISH("english"),
    @XmlEnumValue("esperanto")
    ESPERANTO("esperanto"),
    @XmlEnumValue("estonian")
    ESTONIAN("estonian"),
    @XmlEnumValue("farsi")
    FARSI("farsi"),
    @XmlEnumValue("filipino")
    FILIPINO("filipino"),
    @XmlEnumValue("finnish")
    FINNISH("finnish"),
    @XmlEnumValue("flemish")
    FLEMISH("flemish"),
    @XmlEnumValue("french")
    FRENCH("french"),
    @XmlEnumValue("french_canadian")
    FRENCH_CANADIAN("french_canadian"),
    @XmlEnumValue("georgian")
    GEORGIAN("georgian"),
    @XmlEnumValue("german")
    GERMAN("german"),
    @XmlEnumValue("gibberish")
    GIBBERISH("gibberish"),
    @XmlEnumValue("greek")
    GREEK("greek"),
    @XmlEnumValue("gujarati")
    GUJARATI("gujarati"),
    @XmlEnumValue("gullah")
    GULLAH("gullah"),
    @XmlEnumValue("hausa")
    HAUSA("hausa"),
    @XmlEnumValue("hawaiian")
    HAWAIIAN("hawaiian"),
    @XmlEnumValue("hebrew")
    HEBREW("hebrew"),
    @XmlEnumValue("hindi")
    HINDI("hindi"),
    @XmlEnumValue("hmong")
    HMONG("hmong"),
    @XmlEnumValue("hungarian")
    HUNGARIAN("hungarian"),
    @XmlEnumValue("icelandic")
    ICELANDIC("icelandic"),
    @XmlEnumValue("indo_european")
    INDO_EUROPEAN("indo_european"),
    @XmlEnumValue("indonesian")
    INDONESIAN("indonesian"),
    @XmlEnumValue("ingush")
    INGUSH("ingush"),
    @XmlEnumValue("inuktitun")
    INUKTITUN("inuktitun"),
    @XmlEnumValue("inuktitut")
    INUKTITUT("inuktitut"),
    @XmlEnumValue("inupiaq")
    INUPIAQ("inupiaq"),
    @XmlEnumValue("irish")
    IRISH("irish"),
    @XmlEnumValue("italian")
    ITALIAN("italian"),
    @XmlEnumValue("japanese")
    JAPANESE("japanese"),
    @XmlEnumValue("kalaallisut")
    KALAALLISUT("kalaallisut"),
    @XmlEnumValue("kalmyk")
    KALMYK("kalmyk"),
    @XmlEnumValue("karachay_balkar")
    KARACHAY_BALKAR("karachay_balkar"),
    @XmlEnumValue("kashubian")
    KASHUBIAN("kashubian"),
    @XmlEnumValue("kazakh")
    KAZAKH("kazakh"),
    @XmlEnumValue("khmer")
    KHMER("khmer"),
    @XmlEnumValue("klingon")
    KLINGON("klingon"),
    @XmlEnumValue("korean")
    KOREAN("korean"),
    @XmlEnumValue("kurdish")
    KURDISH("kurdish"),
    @XmlEnumValue("ladino")
    LADINO("ladino"),
    @XmlEnumValue("lao")
    LAO("lao"),
    @XmlEnumValue("lapp")
    LAPP("lapp"),
    @XmlEnumValue("latin")
    LATIN("latin"),
    @XmlEnumValue("lithuanian")
    LITHUANIAN("lithuanian"),
    @XmlEnumValue("lojban")
    LOJBAN("lojban"),
    @XmlEnumValue("lower_sorbian")
    LOWER_SORBIAN("lower_sorbian"),
    @XmlEnumValue("macedonian")
    MACEDONIAN("macedonian"),
    @XmlEnumValue("malagasy")
    MALAGASY("malagasy"),
    @XmlEnumValue("malay")
    MALAY("malay"),
    @XmlEnumValue("malayalam")
    MALAYALAM("malayalam"),
    @XmlEnumValue("maltese")
    MALTESE("maltese"),
    @XmlEnumValue("mandarin_chinese")
    MANDARIN_CHINESE("mandarin_chinese"),
    @XmlEnumValue("maori")
    MAORI("maori"),
    @XmlEnumValue("mende")
    MENDE("mende"),
    @XmlEnumValue("middle_english")
    MIDDLE_ENGLISH("middle_english"),
    @XmlEnumValue("mirandese")
    MIRANDESE("mirandese"),
    @XmlEnumValue("moksha")
    MOKSHA("moksha"),
    @XmlEnumValue("mongo")
    MONGO("mongo"),
    @XmlEnumValue("mongolian")
    MONGOLIAN("mongolian"),
    @XmlEnumValue("multilingual")
    MULTILINGUAL("multilingual"),
    @XmlEnumValue("navaho")
    NAVAHO("navaho"),
    @XmlEnumValue("nogai")
    NOGAI("nogai"),
    @XmlEnumValue("norwegian")
    NORWEGIAN("norwegian"),
    @XmlEnumValue("old_english")
    OLD_ENGLISH("old_english"),
    @XmlEnumValue("persian")
    PERSIAN("persian"),
    @XmlEnumValue("pig_latin")
    PIG_LATIN("pig_latin"),
    @XmlEnumValue("polish")
    POLISH("polish"),
    @XmlEnumValue("portuguese")
    PORTUGUESE("portuguese"),
    @XmlEnumValue("romance")
    ROMANCE("romance"),
    @XmlEnumValue("romanian")
    ROMANIAN("romanian"),
    @XmlEnumValue("romany")
    ROMANY("romany"),
    @XmlEnumValue("russian")
    RUSSIAN("russian"),
    @XmlEnumValue("samaritan")
    SAMARITAN("samaritan"),
    @XmlEnumValue("sanskrit")
    SANSKRIT("sanskrit"),
    @XmlEnumValue("serbian")
    SERBIAN("serbian"),
    @XmlEnumValue("serbo-croatian")
    SERBO_CROATIAN("serbo-croatian"),
    @XmlEnumValue("sichuan_yi")
    SICHUAN_YI("sichuan_yi"),
    @XmlEnumValue("sicilian")
    SICILIAN("sicilian"),
    @XmlEnumValue("sign_language")
    SIGN_LANGUAGE("sign_language"),
    @XmlEnumValue("slavic")
    SLAVIC("slavic"),
    @XmlEnumValue("slovak")
    SLOVAK("slovak"),
    @XmlEnumValue("slovene")
    SLOVENE("slovene"),
    @XmlEnumValue("somali")
    SOMALI("somali"),
    @XmlEnumValue("spanish")
    SPANISH("spanish"),
    @XmlEnumValue("sumerian")
    SUMERIAN("sumerian"),
    @XmlEnumValue("swahili")
    SWAHILI("swahili"),
    @XmlEnumValue("swedish")
    SWEDISH("swedish"),
    @XmlEnumValue("swiss_german")
    SWISS_GERMAN("swiss_german"),
    @XmlEnumValue("tagalog")
    TAGALOG("tagalog"),
    @XmlEnumValue("taiwanese_chinese")
    TAIWANESE_CHINESE("taiwanese_chinese"),
    @XmlEnumValue("tamil")
    TAMIL("tamil"),
    @XmlEnumValue("thai")
    THAI("thai"),
    @XmlEnumValue("tibetan")
    TIBETAN("tibetan"),
    @XmlEnumValue("turkish")
    TURKISH("turkish"),
    @XmlEnumValue("udmurt")
    UDMURT("udmurt"),
    @XmlEnumValue("ukrainian")
    UKRAINIAN("ukrainian"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("urdu")
    URDU("urdu"),
    @XmlEnumValue("vietnamese")
    VIETNAMESE("vietnamese"),
    @XmlEnumValue("welsh")
    WELSH("welsh"),
    @XmlEnumValue("wolof")
    WOLOF("wolof"),
    @XmlEnumValue("xhosa")
    XHOSA("xhosa"),
    @XmlEnumValue("yiddish")
    YIDDISH("yiddish"),
    @XmlEnumValue("zulu")
    ZULU("zulu");
    private final String value;

    LanguageSWVG(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageSWVG fromValue(String v) {
        for (LanguageSWVG c: LanguageSWVG.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
