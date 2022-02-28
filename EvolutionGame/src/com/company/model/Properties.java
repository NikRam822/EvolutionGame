package com.company.model;

/**
 * Свойства животного.
 */
public enum Properties {
    CAMOUFLAGE("\u001B[31m" +" КАМУФЛЯЖ\n"+"\u001B[0m"+" Животное может быть атаковано только хищником, имеющим свойство ОСТРОЕ ЗРЕНИЕ(SHARP VISION)"),//камуфляж
    BURROWING("\u001B[31m" +" НОРНОЕ\n"+"\u001B[0m"+"Когда животное НАКОРМЛЕНО, оно не может быть атаковано хищником"),//норное
    SHARP_VISION("\u001B[31m" +"ОСТРОЕ ЗРЕНИЕ\n"+"\u001B[0m"+"Хищник имеющий это свойство может атаковать животное со свойством КАМУФЛЯЖ(CAMUFLAGE)"),//острое зрение
    SYMBIOSIS("""
            \u001B[31m СИМБИОЗ
            \u001B[0mСыграть одновременно на пару животных друг с другом. Одно из животных указывается как "симбионт".\s
             Другое животное не может бфть атаковано хищником, пока жив "симбионт",\s
             однако оно может получать синие или красные фишки еды только в том случае если "симбионт" уже накормлен"""),//Симбиоз
    PIRACY("""
            \u001B[31mПИРАТСТВО
            \u001B[0mИспользовать это свойство в свою фазу питания. Получить синюю фишку еды забрав любую фишку еды у другого животного на столе\s
             (в том числе и у своего), которое уже получало фишки еды в этот ход, но еще не накормлено. Можно использовать только один раз за ход"""),//Пиратсво
    STOMPERS("\u001B[31m" +"ТОПОТУН\n"+"\u001B[0m"+"Можно использовать один раз в каждый ход в свою фазу питания - уменьшить(удалить) одну фишку еды из \"кормовой базы\" . "),//Топотун
    DROPPING_TAIL("""
            \u001B[31mОТБРАСЫВАНИЕ ХВОСТА
            \u001B[0mКогда животное атаковано хищником потерять(поместить в сброс) карту этого или любого другого имеющегося свойства жтвотного.\s
             При этом жиотное остается живо а хищник нападавший на него получает одну синюю фишку еды"""),//Отбрасывание хвоста
    HIBERNATION("\u001B[31m" +"СПЯЧКА\n"+"\u001B[0m"+"Использовать в свою фазу питания при недостатке еды (животное становится \"накормленым\". Это свойство нельзя использовать две фазы питания подряд."),//спячка
    POISONOUS("\u001B[31m" +"ЯДОВИТОЕ\n"+"\u001B[0m"+"Хищник съевший животное с этим свойством, в фазу вымирания текущего круга погибает "),//Ядовитое
    INTERACTION("""
            \u001B[31mВЗАИМОДЕЙСТВИЕ
            \u001B[0mСыграть одновременно на пару животных друг с другом. Когда одно животное получает красную фишку еды\s
             из "кормовой базы", второе получает красную фишку от туда вне очереди."""),//Взаимодействие
    SCAVENGER("""
            \u001B[31mПАДАЛЬЩИК
            \u001B[0mКогда съедено другое животное, животное с этим свойством получает синюю фишку еды\s
            . Эту фишку еды может получить только одно животное начиная с игрока хищник которого атаковал.
             В случае отсутсвия у него животного со свойством падальщик фишка достанется следующему игроку по часовой стрелке,
             и отсутсвии этого свойства далее по кругу.\s"""),//Падальщик
    FAST("\u001B[31m" +"БЫСТРОЕ\n"+"\u001B[0m"+"Когда ваше животное с этим свойством атаковано подбросить кубик. Если выпало 4,5,6 животное не будет съедено и хищник в этот ходне может атоковать другое животное. Иначе животное будет съедено"),//Быстрое
    MIMICRY("""
            \u001B[31mМИМИКРИЯ
            \u001B[0mКогда ваше животное с этим свойством атаковано,
             владелец может перенаправить атаку на другое свое животное,\s
             которое этот хищник способен атаковать или принять атаку на себя"""),//Мимикрия
    WATER_FLOATING("""
            \u001B[31mВОДОПЛАВАЮЩЕЕ
            \u001B[0mЖивотное с этим свойством может быть атакованно только хищником с таким же свойством.
             Если ваше животное хищник с этим свойством оно может атаковать только животных с таким же свойством."""),//Водоплавающее
    PARASITE("""
            \u001B[31mПАРАЗИТ
            \u001B[0mМожет быть сыграно только на животное другого игрока. Добавляет +2 к потребности в еде\s
             На одно животное можно сыграть только одного паразита. Паразита можно отбросить с помощью свойства отбрасывание ховста."""),//Паразит
    PREDATOR("""
            \u001B[31mХИЩНИК
            \u001B[0mСвойство может быть использованно только один раз в ход, в свою фазу питания. В эту фазу игрок не берет красной фишки из "кормовой базы",
             вместо этого Хищник может атаковать ЛЮБОЕ животное на столе при успешной атаке получить две синие фишки еды и завершить ход."""),//Хищник
    FAT_RESERVE("""
            \u001B[31mЖИРОВОЙ ЗАПАС
            \u001B[0mОдно животное может иметь несколько жировых запасов.
             Если животное НАКОРМЛЕНО может получить одну жёлтую фишку в замен на одну фишку из "кормовой базы".
             Вместо получения еды или при её недостатке игрок может преобразовать желтые фишки в синие фишки еды."""),//Жировой запас
    COOPERATION("""
            \u001B[31mСОТРУДНИЧЕСТВО
            \u001B[0mСыграть одновременно на пару животных друг с другом.
             Когда одно животное получает любую фишку еды второе животное срузу же получает синюю фишку еды"""),//Сотрудничество
    BIG("\u001B[31m" +"БОЛЬШОЙ\n"+"\u001B[0m"+" Добавляет +1 к потребности в еде. Данное животное может быть атаковано только хищником с таким же свойством.");//Большой



    /**
     *  свойство существа.
     */
    private final String textRepresentation;

     Properties(String textRepresentation) {
        this.textRepresentation = textRepresentation;
    }

    @Override
    public String toString() {
        return textRepresentation;
    }
}
//TODO:17 СВОЙСТ.
// 84 карты.
// Камуфляж - 4 шт.
// Норное - 4 шт.
// Острое зрение - 4 шт.
// Симбиоз - 4 шт.
// Пиратство - 4 шт.
// Топотун - 4 шт.
// Отбрасывание хвоста - 4 шт.
// Спячка - 4 шт.
// Ядовитое -4 шт.
// Взаимоействие -4шт.
// Падальщик - 4 шт.
// Быстрое -4 шт.
// Мимикрия - 4 шт.
// Водоплавающе - 8шт.
// Паразит\хищник - 4шт
// Паразит\Жировой запас -4 шт
// Сотрудничество\хищник - 4 шт
// Сотрудничество \Жировой запас -4 шт
// Большой \ хищник - 4 шт
// Большой\Жировой запас - 4 шт

