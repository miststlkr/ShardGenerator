public class main {

    //  biomes
    //      TUNDRA,
    //      RAINFOREST,
    //      SAVANNA,
    //      TAIGA,
    //      TEMPERATE_FOREST,
    //      TEMPERATE_GRASSLAND,
    //      ALPINE,
    //      DESERT,
    //      ROLL2

    //  size
    //      descriptor, square_km
    //      CITY, 115
    //      STATE, 163537
    //      COUNTRY, 9984404
    //      CONTINENT, 24710000

    //  magicLevel
    //      NONE,
    //      LOW,
    //      AVERAGE,
    //      HIGH,
    //      WILD

    //  inhabited
    //      NEVER,
    //      LONG_AGO,
    //      RECENTLY,
    //      CURRENTLY

    //  technology              // defaults to NONE
    //      NONE                // only possible if inhabited == inhabited.NEVER
    //      ANCIENT,
    //      BEHIND,
    //      MODERN,
    //      ADVANCED

    //  population              // defaults to NONE
    //      NONE,
    //      SPARSE,
    //      AVERAGE,
    //      DENSE

    //  baseRaces               // generate from external file??
    //      DWARF,
    //      ELF,
    //      HALFLING,
    //      HUMAN,
    //      DRAGONBORN,
    //      GNOME,
    //      HALFELF,
    //      HALFORC,
    //      TIEFLING

    //  exoticRaces             // generate from external file??

    //  racialDiversity         // defaults to NONE
    //      NONE,               // if picked and inhabited != inhabited.NEVER then pick any one race
    //      SOMEONE_MISSING,    // pick one basic race that is missing
    //      AVERAGE,
    //      SOMETHING_UNUSUAL,  // add one exotic race
    //      COMPLETELY_EXOTIC   // roll one exotic race

    //  hostility               // defaults to NONE
    //      NONE,
    //      PEACEFUL,
    //      FRIENDLY,
    //      WARY,
    //      AGGRESSIVE

    // class Shard
    //      pickSize
    //      pickBiome
    //      pickMagicLevel
    //      pickInhabited
    //      if inhabited != inhabited.NEVER: pickTechnology
    //      if inhabited == inhabited.CURRENTLY:
    //          pickPopulation
    //          pickRacialDiversity
    //          pickHostility

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(String.format("%s Java %s", str1, str2));
    }

}